import java.util.Scanner;

public class Lecture4Hw2 {
    public static void main(String[] args) {
        // to check if the number n is prime or not
        int c = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i<n; i++)
        {
            c = n%i;
            if(c==0)
            {
                System.out.println(n + " is not a prime number");
                break;
            }
            else
            { 
                System.out.println(n + " is a prime number");
                i=n;
            }
           
        }
        
    }
}
