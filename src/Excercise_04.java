import java.util.Scanner;

public class Excercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu tiên: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số cuối cùng: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + a + " đến " + b + " là: " + sum);
    }
    }
