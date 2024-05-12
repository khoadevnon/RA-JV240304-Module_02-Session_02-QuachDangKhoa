import java.util.Scanner;

public class Excercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số từ 0 đến 9: ");
        int num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("Số không");
                break;
            case 1:
                System.out.println("Số một");
                break;
            case 2:
                System.out.println("Số hai");
                break;
            case 3:
                System.out.println("Số ba");
                break;
            case 4:
                System.out.println("Số bốn");
                break;
            case 5:
                System.out.println("Số năm");
                break;
            case 6:
                System.out.println("Số sáu");
                break;
            case 7:
                System.out.println("Số bảy");
                break;
            case 8:
                System.out.println("Số tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.printf("Số bạn nhập là %d - Số không hợp lệ - Vui lòng nhập số trong khoảng từ 0 -9\n", num);
                break;
        }
    }
}


