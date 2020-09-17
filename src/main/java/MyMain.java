import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int decimal = Integer.parseInt(binary,2);
        return decimal;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String bi_num = scan.next();
        System.out.println("Please enter a binary number.");
        System.out.println("Your binary input is " + binaryToDecimal(bi_num) + " in decimal.");
        scan.close();
    }
}
