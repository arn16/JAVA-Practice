import java.util.Scanner;

public class Lecture3Quiz1 {
    public static void main(String[] args) {
        // To check if the input number is odd, print " Bazinga "
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        if (a%2==1){
            System.out.println("Bazinga");
        }
        else{
            System.out.println("Not Bazinga");
        }

    }
    
}
