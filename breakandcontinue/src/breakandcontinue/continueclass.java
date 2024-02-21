package breakandcontinue;
import java.util.*;
public class continueclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the numbers: ");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println(n +" "+ "is the multiple of 10");
                continue;

            } 

        } while(true);
       
    }
    
}
