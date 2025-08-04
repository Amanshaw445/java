import java.util.Scanner;

public class Gcd{
    static int itrativeGcd(int x, int y){
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
        
    }
    static int recursiveGcd(int x, int y){
        if(y == 0){
            return x;
        }
        else{
            return recursiveGcd(y, x % y);
        }
    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // System.out.println(itrativeGcd(x, y));
        System.out.println(recursiveGcd(x, y));
        sc.close();

    }
}
// if LCM is needed the we can calculate using the formula { LCM * GCD = X * Y } after finfing the gcd using the above functon;