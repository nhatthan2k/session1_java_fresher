import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài: ");
        int lenght = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập chiều rộng: ");
        int width = Integer.parseInt(scanner.nextLine());

        int S = lenght * width;
        int C = (lenght + width) * 2;

        System.out.println("chu vi hình chữ nhật là: " + C);
        System.out.println("diện tích hình chữ nhật là: " + S);
    }
}
