import java.util.Scanner;                         //6 8 10 12 14 16 18 20
public class ap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 6 ; int d = 2;
        for(int i=1 ; i<=n ; i++){
            System.out.print(a + " ");
            a+=d;
        }

    }
    
}