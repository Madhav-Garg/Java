import java.util.Scanner;
public class composite {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean iscomposite = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                iscomposite = true;
                break;

            }
        }
        if(iscomposite){
            System.out.print("composite number");
        }else{
            System.out.print("Its not a composite number");
        }
    }
    
}
