import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số thứ nhất: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ hai: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ ba: ");
        int c = Integer.parseInt(scanner.nextLine());

        int min = a;
        int max = a;

        if (b<min) {
            min = b;
        }
        if (c<min){
            min = c;
        }

        if (b>max) {
            max = b;
        }
        if (c>max){
            max = c;
        }

        System.out.println("giá trị nhỏ nhất là:" + min);
        System.out.println("giá trị lớn nhất là:" + max);
    }
}
