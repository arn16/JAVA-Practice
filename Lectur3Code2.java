import java.util.Scanner;

public class Lectur3Code2 {
    public static void main(String[] args) {
        // To check whether a number is even or odd
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }

    }
}
