import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Principal: ");
        String vas = scanner.nextLine();
        float p = scanner.nextFloat();
        
        System.out.println("Annual Interest Rate: "  + vas);
        float interest = scanner.nextFloat();
        
        System.out.println("Period (Years): ");
        int year = scanner.nextInt();
        
        float r = (interest/12)/100;
        double n = year*12.0;
        
        double num = Math.pow(1+r, n);
        
        double M = (p*r*num)/(num -1);
        
        
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(M));
    }


}
