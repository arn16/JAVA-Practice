import java.util.*;

public class takeinput { 
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println(name+" is a good person");*/

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        int a= sc.nextInt();
        double b=sc.nextDouble();
        
        //Printing the values of variables using printf() method
        System.out.printf("The entered name is %s and age is %d and salary is %.2f",name,a,b);
        System.out.println("\n"+name+" is a good person");

    }
    
}
