import java.util.Scanner;

public class SubjectGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập điểm toán: ");
        float math = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập điểm vật lý: ");
        float physics = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập điểm hóa học: ");
        float chemistry = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập điểm tiếng anh: ");
        float english = Float.parseFloat(scanner.nextLine());

        float SubjectGPA = (math + physics + chemistry + english) / 4;
        String Rating = null;

        if(0 <= SubjectGPA && SubjectGPA < 5) {
            Rating = "yếu";
        } else if (5 <= SubjectGPA && SubjectGPA < 6.5) {
            Rating = "trung bình";
        } else if (6.5 <= SubjectGPA && SubjectGPA < 8) {
            Rating = "khá";
        } else if (8 <= SubjectGPA && SubjectGPA < 9) {
            Rating = "giỏi";
        } else if (9 <= SubjectGPA && SubjectGPA < 10) {
            Rating = "xuất sắc";
        }

        System.out.printf("điểm trung bình: %.2f, xếp hạng: %s", SubjectGPA, Rating);
    }
}
