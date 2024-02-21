package breakandcontinue;
import java.util.*;
import java.lang.*;;
public class breakclass {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if(n%10==0) {
                break;
            }
            System.out.println(n);
        }
        while(true);
    }
}
