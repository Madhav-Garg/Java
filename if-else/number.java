import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if(number>0){
            System.out.print("Postive");

        }else if(number<0){
            System.out.print("Negitive");
        }else {
            System.out.println("Zero");

        }
    }
}
