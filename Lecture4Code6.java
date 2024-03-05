import java.util.Scanner;

public class Lecture4Code6 {
    public static void main(String[] args) {
        // to print the table of n using concept of loops

        int i=0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(i=0;i<=10;i++){
            System.out.println(n+" x "+ i + " = "+ (n*i));
        }

    }
    
}
