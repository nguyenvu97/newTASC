package assignment;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private static  User user;
    private static  final String fileName  = "/Volumes/Extreme SSD/Java/leanJavacore/src/main/resources/user.txt";
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String PHONE_REGEX = "^(\\+\\d{1,3})?\\d{10}$";
    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private static boolean checkNull(String username, String email, String phoneNumber){
        if (email.isEmpty() || username.isEmpty() || phoneNumber.isEmpty() || !email.matches(EMAIL_REGEX) || !phoneNumber.matches(PHONE_REGEX) ){
            return false;
        }
        return true;
    }

    public static User getInstance(String username, String email, String phoneNumber) {
        if (user == null) {
            synchronized (User.class) {
                if (user == null) {
                    user = new User(username, email, phoneNumber);
                }
            }
        }
        return user;
    }


    private static Map<String,User> getUser(){
        Map<String, User> userMap;
        StringBuilder resultStringBuilder = new StringBuilder();
        try(BufferedReader br
                    = new BufferedReader(new FileReader(User.fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line);
            }
            String json = resultStringBuilder.toString();
            Gson gson = new Gson();
            TypeToken<Map<String,User>> token = new TypeToken<>(){};
            userMap = gson.fromJson(json, token.getType());

        }catch (IOException e){
            throw new RuntimeException(e.getMessage());
        }
        return userMap;
    }

    public static List<User> get_list_user(){
        List<User> userList = new ArrayList<>();
        Map<String,User> userMap = getUser();
        if (userMap != null) {
            userList.addAll(userMap.values());
        }
        return userList;
    }
    public static void saveUsers(String name, String email, String phoneNumber) {
        if (checkNull(name, email, phoneNumber)) {

            var users = getUser();
            if (!users.containsKey(phoneNumber)) {
                users.put(phoneNumber, getInstance(name, email, phoneNumber));
                try (FileWriter fileWriter = new FileWriter(User.fileName)) {
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    String json = gson.toJson(users);
                    fileWriter.write(json);
                } catch (IOException e) {
                    System.err.println("Error writing to user file: " + e.getMessage());
                }
            } else {
                System.out.println("số điện thoại đã bi trùng");
            }
        }
    }

    public static void write_Flies(Map<String,User>userMap){
        try (FileWriter fileWriter = new FileWriter(User.fileName)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(userMap);
            fileWriter.write(json);
        } catch (IOException e) {
            System.err.println("Error writing to user file: " + e.getMessage());
        }

    }
    public static User search(String phoneNumber){
        var userMap = getUser();
        if (userMap != null) {
            return userMap.get(phoneNumber);
        }
        throw  new Notfound("not data User" + phoneNumber);
    }



    public static String delete(String phoneNumber){
        Map<String,User> userMap = getUser();
        if (userMap != null) {
            userMap.remove(phoneNumber);
            write_Flies(userMap);
            return "delete Ok";
        }
        throw  new Notfound("not data User" + phoneNumber);
    }

    public static String updateUser(String name, String email, String phoneNumber){
        if (phoneNumber == null || phoneNumber.isEmpty()) {
           return "input phone number wrong";
        }
        Map<String,User> userMap = getUser();
        if (userMap != null) {
            User user1 = userMap.get(phoneNumber);
            if (email == null || email.isEmpty()){
                userMap.put(phoneNumber,getInstance(name,user1.email,phoneNumber));
                write_Flies(userMap);
                return "update Ok";
            }
            if (name == null || name.isEmpty()){
                userMap.put(phoneNumber,getInstance(user1.name,email,phoneNumber));
                write_Flies(userMap);
                return "update Ok";
            }
            userMap.put(phoneNumber,getInstance(name,email,phoneNumber));
            write_Flies(userMap);
            return "update Ok";
        }
        throw  new Notfound("not data User" + phoneNumber);
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
