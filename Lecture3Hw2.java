import java.util.Scanner;

public class Lecture3Hw2 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num)
        {
            case 1: System.out.println("Month 1 :January");
                    break;
            case 2: System.out.println("Month 2 :February");
                    break;
            case 3: System.out.println("Month 3 :March");
                    break;   
            case 4: System.out.println("Month 4 :April");
                    break;
            case 5: System.out.println("Month 5 :May");
                    break;
            case 6: System.out.println("Month 6 :June");
                    break;
            case 7: System.out.println("Month 7 :July");
                    break;
            case 8: System.out.println("Month 8 :August");
                    break;
            case 9: System.out.println("Month 9 :September");
                    break;
            case 10: System.out.println("Month 10 :October");
                     break;
            case 11: System.out.println("Month 11 :November");
                     break;
            case 12: System.out.println("Month 12 :December");
                     break;
            default: System.out.println("Invalid input");            
                
        }
    }
    
}
