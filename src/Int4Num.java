import java.util.Scanner;

public class Int4Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số nguyên có 4 chữ số: ");
        int number = scanner.nextInt();

        int sum = 0;
        sum += number % 10;
        sum += (number / 10) % 10;
        sum += (number / 100) % 10;
        sum += number / 1000;

        System.out.println("Tổng các chữ số là: " + sum);

        int reverse = 0;
        reverse += number % 10 * 1000;
        reverse += ((number / 10) % 10) * 100;
        reverse += ((number / 100) % 10) * 10;
        reverse += number / 1000;

        System.out.println("Số nghịch đảo là: " + reverse);
    }
}
