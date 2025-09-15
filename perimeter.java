import java.util.Scanner;
public class perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int b = input.nextInt();
        System.out.println("Perimeter of the rectangle: "+ (2*(l+b)));
    }
}
