import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        //Make a program that prints the table of a number that is input by the user. 

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("\n"+num+" x 1 = "+num);
        System.out.println("\n"+num+" x 2 = "+num*2);
        System.out.println("\n"+num+" x 3 = "+num*3);
        System.out.println("\n"+num+" x 4 = "+num*4);
        System.out.println("\n"+num+" x 5 = "+num*5);
        System.out.println("\n"+num+" x 6 = "+num*6);
        System.out.println("\n"+num+" x 7 = "+num*7);
        System.out.println("\n"+num+" x 8 = "+num*8);
        System.out.println("\n"+num+" x 9 = "+num*9);
        System.out.println("\n"+num+" x 10 = "+num*10);
        
}
}