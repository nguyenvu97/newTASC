package assignment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MethodFactory {
    public static String add (Scanner scanner) {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email khách hàng: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String phoneNumber = scanner.nextLine();
        User.saveUsers(name, email, phoneNumber);
        return "Add OK";
    }
    public static User search (Scanner scanner) {
        System.out.print("Nhập số điện thoại để tìm kiếm: ");
        String phoneNumber = scanner.nextLine();
       return User.search(phoneNumber);
    }

    public static String delete(Scanner scanner) {
        System.out.print("Nhập số điện thoại để tìm kiếm: ");
        String phoneNumber = scanner.nextLine();
        return User.delete(phoneNumber);

    }
    public static void update(Scanner scanner) {

        boolean data1 = true;
        System.out.println("1.sửa đổi một trường dữ liệu ");
        System.out.println("2.sửa đổi nhiều trường dữ liệu ");
        System.out.println("3.exit");
        System.out.println("Nhập lựa chọn của bạn:");
        int chooses = scanner.nextInt();
        scanner.nextLine();

        while (data1) {
            switch (chooses) {
                case 1:
                    update1(scanner,true);
                    data1 = false;
                    break;
                case 2:
                    update1(scanner,false);
                    data1 = false;
                    break;
                case 3:
                    data1 = false;
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }

        }
    }
    public static void update1(Scanner scanner,boolean choose ){
        if (choose) {
            System.out.print("Nhập số điện thoại khách hàng: ");
            String  phoneNumber = scanner.nextLine();
            System.out.println("Bạn hãy nhập thông tin muốn thay đổi ");

            System.out.print("Nhập tên khách hàng:");
            String  name = scanner.nextLine();
            System.out.print("Nhập email khách hàng: ");
            String  email = scanner.nextLine();
            System.out.println(User.updateUser(name, email, phoneNumber));

        }else {

            System.out.print("Nhập số điện thoại khách hàng: ");
            String  phoneNumber = scanner.nextLine();
            User.delete(phoneNumber);

            System.out.print("Nhập tên khách hàng:");
            String  name = scanner.nextLine();
            System.out.print("Nhập email khách hàng: ");
            String  email = scanner.nextLine();
            System.out.print("Nhập số điện thoại khách hàng: ");
            String newPhoneNumber = scanner.nextLine();
            System.out.println( User.updateUser(name, email, newPhoneNumber));
        }


    }

    public static void showMenu() {
        System.out.println("My Shop");
        System.out.println("Quản lý thông tin khách hàng");
        System.out.println("Chọn những tính năng sau:");
        System.out.println("1. Hiện thông tin khách hàng");
        System.out.println("2. Lưu thông tin khách hàng");
        System.out.println("3. Tìm kiếm thông tin khách hàng theo số điện thoại");
        System.out.println("4. Chỉnh sửa thông tin khách hàng");
        System.out.println("5. Xóa thông tin khách hàng");
        System.out.println("6. Kết thúc");
        System.out.print("Nhập lựa chọn của bạn: ");
    }


}
