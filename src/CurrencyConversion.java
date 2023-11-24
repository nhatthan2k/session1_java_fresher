import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int exchangeRate = 23000;

        System.out.println("nhập giá trị cần chuyển đổi: ");
        float numberUsd = Float.parseFloat(scanner.nextLine());

        float VND = exchangeRate * numberUsd;

        System.out.println("giá trị sau chuyển đổi: " + VND);
    }
}
