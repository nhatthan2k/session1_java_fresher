import java.util.Scanner;

public class Scoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập điểm toán: ");
        float math = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập điểm văn: ");
        float philology = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập điểm tiếng anh: ");
        float english = Float.parseFloat(scanner.nextLine());

        float Sum = math + philology + english;
        float SubjectGPA = Sum / 3;

        System.out.printf("tổng điểm: %.2f, điểm trung bình: %.2f", Sum ,SubjectGPA);
    }
}
