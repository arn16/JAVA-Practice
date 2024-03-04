import java.util.Scanner;

public class Lecture3Code1 {
    public static void main(String[] args) {
        // To check whether the person is an Adult or not
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        
        if(age>18){
            System.out.println(name+" is an Adult");
        }
        else{
            System.out.println(name+" is not an Adult");
        }
}
}
