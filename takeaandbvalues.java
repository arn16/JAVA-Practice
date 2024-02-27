import java.util.Scanner;

public class takeaandbvalues {
    public static void main(String[] args){
        //take  2 values a and b and return the sum of those two numbers

        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of a and b is :"+sum);
    
    }
    
}
