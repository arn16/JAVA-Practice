public class quiz{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        // (a x b) / (a - b)

        int mul = a * b;
        int diff = a - b;
        int answer = mul / diff;
        
        System.out.println("The result is : " + answer);
    }
    
}
