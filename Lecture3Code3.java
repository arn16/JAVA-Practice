import java.util.Scanner;

public class Lecture3Code3 {
    public static void main(String[] args) {
        // To check if "a=b" or "a>b" or "a<b"
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*conditions*/ 
        
        if(a>b)
        {
        System.out.println(a + " is greater than " + b);
        }
        else if(a==b)
        {
            System.out.println(a +" is equal to "+ b);
        }
        else{
            System.out.println(a+" is less than "+b);
        }
    }
    
}
