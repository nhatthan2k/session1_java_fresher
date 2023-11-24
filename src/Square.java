import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số nguyên: ");
        int number = scanner.nextInt();

        int Square = number * number;

        System.out.println("bình phương của số nguyên: " + Square);
    }
}
