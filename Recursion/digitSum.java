public class digitSum {
    static int sumOfDigits(int n){
        if (n==0) {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10); //(n%10) will give the last digitm(n/10) will give the all the others except last
    }

    public static void main (String[]args){
        int number = 12345;
        int result = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is " + result);
    }
}
