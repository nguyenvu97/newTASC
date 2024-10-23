package assignment;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean data = true;
        boolean data1 = true;

        while (data) {

            MethodFactory.showMenu();
            int choose = scanner.nextInt();
            scanner.nextLine();


            switch (choose) {
                case 1:
                    List<User> userList = User.get_list_user();
                    System.out.println(userList);
                    break;
                case 2:
                     MethodFactory.add(scanner);
                    break;
                case 3:
                    System.out.println(MethodFactory.search(scanner));
                    break;
                case 4:
                    MethodFactory.update(scanner);
                    break;
                case 5:
                    MethodFactory.delete(scanner);
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
