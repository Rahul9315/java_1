import java.util.Scanner;

public class Fizz_and_buzz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        
        if (num%3==0 && num%5==0) {
            System.out.println("FizzBuzz");
        } else if (num%3==0){
            System.out.println("Buzz");
        } else if (num%5==0){
            System.out.println("Fizz");
        } else {
            System.out.println(num) ;
        }

        practice_classes Method_1 = new practice_classes();
        Method_1.main();
        
        

    }
}
