public class Lecture5Code5 {
    public static void main(String[] args) {
        // to print the pattern
        /*
        
              * 
            * * 
          * * * 
        * * * * 
         
         */

        for(int i=1; i<=4; i++) { // outer loop
            for(int j=1;j<=4-i; j++) { // to print the spaces
                System.out.print(" ");
        }
        for(int k=1; k<=i; k++) { // to print the stars
            System.out.print("*");
        }
        System.out.println();
    }
}
}