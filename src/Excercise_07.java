import java.util.Scanner;

public class Excercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn");
                    } else {
                        System.out.println(number + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int num = scanner.nextInt();
                    if (num < 2) {
                        System.out.println(num + " không phải là số nguyên tố");
                    } else {
                        int i = 2;
                        boolean check = true;
                        while (i <= Math.sqrt(num)) {
                            if (num % i == 0) {
                                check = false;
                                break;
                            }
                            i++;
                        }
                        if (check) {
                            System.out.println(num + " là số nguyên tố");
                        } else {
                            System.out.println(num + " không phải là số nguyên tố");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int num3 = scanner.nextInt();
                    if (num3 % 3 == 0) {
                        System.out.println(num3 + " chia hết cho 3");
                    } else {
                        System.out.println(num3 + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        } while (choice != 4);

    }
}

