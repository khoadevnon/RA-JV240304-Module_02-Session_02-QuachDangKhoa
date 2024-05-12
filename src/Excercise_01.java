import java.util.Scanner;

public class Excercise_01 {
    public static void main(String[] args) {
        /*
        * Input: Số
        * Process:
        * Cho người dùng nhập vào một số
        * Nếu số đó chia hết cho 3 và 5 thì thông báo ra là số đó chia hết cho 3 và 5, còn không thì thông báo khng
        * Ouput: số chia hết cho năm
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào số mà bạn muốn:");
        int number =  Integer.parseInt(sc.nextLine());
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("Số bạn nhập vào là %d - nó chia hết cho 3 và 5 \n", number);

        }else if (number % 3 == 0) {
            System.out.printf("Số bạn nhập vào là %d - nó chỉ chia hết cho 3 \n", number);
        }else if (number % 5 == 0) {
            System.out.printf("Số bạn nhập vào là %d - nó chỉ chia hết cho 5 \n", number);
        }else {
            System.out.printf("Số bạn nhập vào là %d - nó không chia hết cho 3 và 5 \n", number);
        }
    }
}
