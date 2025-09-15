import java.util.Scanner;                         //2 4 8 16 32 64 
public class gp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=2;
        for(int i=1 ; i<=n ; i++){
            System.out.print(a+ " ");
            a*=2;
        }
    }
}