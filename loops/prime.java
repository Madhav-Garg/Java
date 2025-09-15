import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n<=1){
            System.out.print("its not prinme number");
        }else{
            boolean isprime = true;
            for(int i=2 ; i<n ; i++){
                if(n%i==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                 System.out.println("prime number");
            }else{
            System.out.print("its not a prime number");
            }
        }  
    }
}