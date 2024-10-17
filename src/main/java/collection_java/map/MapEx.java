package collection_java.map;

import student.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static collection_java.set.SetEx.NUMBER;

public class MapEx {

    public static void hashMap(){
        Map<String, Student> map = new HashMap<>();
        Student student = new Student(1,"name",10);
        map.put("1",new Student(1,"name",10));
        map.put("4",new Student(1,"name",10));
        map.put("3",new Student(1,"name",10));
        map.put("5",new Student(1,"name",10));
        map.put("6",new Student(1,"name",10));
//        map.put("6",new Student(1,"name",11));  //  giá trị của key đó sẽ được cập nhật thành giá trị mới.
        map.put(null,new Student(1,"name",10));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("1"));
        System.out.println(map.containsValue(student));
        System.out.println(map.get("1"));
        System.out.println(map.remove(null));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        map.clear();
        tree_map();
        check_hashmap_LinkedHash();

    }
    public static void check_hashmap_LinkedHash(){
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        /*
        add hash Map
        * */
        var startTime = System.nanoTime();
        for (int i = 0 ; i < NUMBER ; i++){
            hashMap.put(i,"data" + i);
        }
        var endTime = System.nanoTime();
        System.out.println("hash Map add time:" + (endTime - startTime) +"ns");

         startTime = System.nanoTime();
        for (int i = 0 ; i < NUMBER ; i++){
            linkedHashMap.put(i,"data" + i);
        }
         endTime = System.nanoTime();
        System.out.println("linkedHashMap add time:" + (endTime - startTime) +"ns");

        /*
        tim kiem  hash Map
        * */
        startTime = System.nanoTime();
        for (int i = 0 ; i < NUMBER ; i++){
            hashMap.containsKey(i);
        }
        endTime = System.nanoTime();
        System.out.println("hash Map  tim kiem :" + (endTime - startTime) +"ns");
        for (int i = 0 ; i < NUMBER ; i++){
            linkedHashMap.containsKey(i);
        }
        endTime = System.nanoTime();
        System.out.println("linkedHashMap tim kiem :" + (endTime - startTime) +"ns");

        /*
        remove hash map
        * */
        startTime = System.nanoTime();
        for (int i = 0 ; i < NUMBER ; i++){
            hashMap.remove(100);
        }
        endTime = System.nanoTime();
        System.out.println("hash Map  remove : " + (endTime - startTime) +"ns");
        for (int i = 0 ; i < NUMBER ; i++){
            linkedHashMap.remove(100);
        }
        endTime = System.nanoTime();
        System.out.println("linkedHashMap remove : " + (endTime - startTime) +"ns");
    }

    public static  void tree_map(){
        Map<Student, String> treeMap = new TreeMap<>();

//        treeMap.put(null,new Student(1,"name",10)); // Cannot invoke "java.lang.Comparable.compareTo(Object)" because "k1" is null
        treeMap.put(new Student(1,"name",10),"data");
        treeMap.put(new Student(4,"name",10),"data");
        treeMap.put(new Student(6,"name",10),"data");
        treeMap.put(new Student(5,"name",10),"data");
        treeMap.put(new Student(2,"name",10),"data");
        System.out.println(treeMap);
    }
}
