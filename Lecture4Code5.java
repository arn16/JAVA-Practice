import java.util.Scanner;

public class Lecture4Code5 {
    public static void main(String[] args) {
        //print sum of n natural numbers
        
        int i = 0;
        int sum = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
}
