import java.util.Scanner;

public class Lecture3Hw1 {
    public static void main(String[] args) {
        //Make a calculator. Take 2 numbers (a & b) from the user and an operation from the following:
        // 1. Add
        // 2. Subtract
        // 3. Multiply
        // 4. Divide
        // 5. Modulus
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();

        switch (button) 
        {
            case 1: 
            int sum = a+b;
            System.out.println("Addition of a and b : " + sum);
            break;

            case 2:
            int diff = a-b;
            System.out.println("Subtraction of a and b : " + diff);
            break;

            case 3:
            int mul = a*b;
            System.out.println("Multiplication of a  and b : "+ mul);
            break;

            case 4:
            int div = a/b;
            System.out.println("Division of a and b : "+ div);
            break;

            case 5:
            int mod= a%b;
            System.out.println("Modulus of a and b : "+ mod);
            break;

            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
