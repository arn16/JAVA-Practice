import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        //Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double area = 3.14 * rad * rad;
        System.out.println("Area of the circle is : " +area);
    }
    
}
