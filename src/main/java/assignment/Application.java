package assignment;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean data = true;

        while (data) {

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

            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    List<User> userList = User.get_list_user();
                    System.out.println(userList);
                    break;
                case 2:
                    System.out.print("Nhập tên khách hàng: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập email khách hàng: ");
                    String email = scanner.nextLine();
                    System.out.print("Nhập số điện thoại khách hàng: ");
                    String phoneNumber = scanner.nextLine();
                    User.saveUsers(name, email, phoneNumber);
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại để tìm kiếm: ");
                    phoneNumber = scanner.nextLine();

                    System.out.println(User.search(phoneNumber));
                    break;
                case 4:
                    System.out.print("Nhập tên khách hàng:");
                    name = scanner.nextLine();
                    System.out.print("Nhập email khách hàng: ");
                    email = scanner.nextLine();
                    System.out.print("Nhập số điện thoại khách hàng: ");
                     phoneNumber = scanner.nextLine();
                    System.out.println(User.updateUser(name, email, phoneNumber));

                    break;
                case 5:
                    System.out.print("Nhập số điện thoại để xóa: ");
                     phoneNumber = scanner.nextLine();
                    System.out.println(User.delete(phoneNumber));
                    break;
                case 6:
                    data = false;
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
