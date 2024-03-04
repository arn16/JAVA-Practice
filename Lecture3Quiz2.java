import java.util.Scanner;

public class Lecture3Quiz2 {
    public static void main(String[] args) {
        // To create a bot which on input a- prints "Hello", on input b- prints "Namaste" and on input c- prints "Bonjour"
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String button = sc.nextLine();

        // Method 1: Using if , else if and else condtions

        /*if (button=="a"){
            System.out.println("Hello");
        }
        else if(button=="b"){
            System.out.println("Namaste");
        }
        else if (button=="c"){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Input");
        } */


        // Method 2: Using -> Switch case

        switch(button){
            case "a": System.out.println("Hello");
                    break;

            case "b": System.out.println("Namaste");
                     break;

            case "c": System.out.println("Bonjour");
                    break;
            default: System.out.println("Invalid Input");
        }
    }
    
}
