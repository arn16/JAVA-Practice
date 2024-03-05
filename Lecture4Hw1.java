import java.util.*;
public class Lecture4Hw1 {
    public static void main(String[] args) {
        // print all even numbers upto n
    
        int i=0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println("Even numbers between 0 and "+n+" are : ");
        for(i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }   
        }
    } 
}
