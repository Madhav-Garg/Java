import java.util.Scanner;
public class greatest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>=b &&  a>=c ){
            System.out.println(a+" its a greatest number");
            
        }
        else  if(b>=a &&  b>=c ){
            System.out.println(b+" its a greatest number");

        }
        else if(c>=b &&  c>=a ){
            System.out.println(c+" its a greatest number");

        }
    }
}
