import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập năm sinh của bạn: ");
        int year = Integer.parseInt(scanner.nextLine());

        int age = 2023 - year;

        System.out.println("tuổi của bạn: " + age);
        if (age % 2 == 0) {
            System.out.println("tuổi của bạn là số chẵn");
        }else {
            System.out.println("tuổi của bạn là số lẻ");
        }
    }
}
