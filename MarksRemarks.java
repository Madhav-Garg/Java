import java.util.Scanner;

public class MarksRemarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered.");
            return;
        }

        
        String grade;
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

  
        switch (grade) {
            case "A":
                System.out.println("Excellent performance!");
                break;
            case "B":
                System.out.println("Very good! Keep it up.");
                break;
            case "C":
                System.out.println("Good effort. You can do even better.");
                break;
            case "D":
                System.out.println("Fair. Try to improve.");
                break;
            case "F":
                System.out.println("Poor. You need to work harder.");
                break;
            default:
                System.out.println("Unexpected grade.");
                break;
        }
    }
}