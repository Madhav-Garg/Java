import java.util.Scanner;
public class condition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.print("Enter the age: ");
        int age = input.nextInt();
        System.out.print("Enter the gender male/female: ");
        boolean isfemale = input.nextBoolean();

        if(age < 5){
            System.out.print("the discount is 75%");
        }
        else if(isfemale){
            System.out.print("the discount is 50%");

        }else if(age>=5 && !isfemale){
            System.out.println("the discount is 25%");
        }
    }
    
}