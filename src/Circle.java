import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập bán kính hình tròn: ");
        int r = scanner.nextInt();
        double pi = 3.14;

        double C = 2 * r * pi;
        double S = r * r * pi;

        System.out.printf("chu vi hình tròn: %.2f, diện tích hình tròn: %.2f", C, S);
    }
}
