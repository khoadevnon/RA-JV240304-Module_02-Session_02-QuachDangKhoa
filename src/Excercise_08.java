import java.util.Scanner;

public class Excercise_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhập vào 3 cạnh của tam giác: ");
        System.out.print("Nhập cạnh a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c: ");
        c = Integer.parseInt(scanner.nextLine());
        while (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("3 cạnh vừa nhập không phải là 3 cạnh của 1 tam giác. Mời bạn nhập lại: ");
            System.out.print("Nhập cạnh a: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh b: ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập cạnh c: ");
            c = Integer.parseInt(scanner.nextLine());
        }
        double permeter = a + b + c;
        double p = permeter / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Chu vi của tam giác là: " + permeter);
        System.out.println("Diện tích của tam giác là: " + area);
    }
}
