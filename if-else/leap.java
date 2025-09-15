import java.util.Scanner;
public class leap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.print("Leap year");
        }else{
            System.out.print("Its not a leap year");
        }
    }
}
