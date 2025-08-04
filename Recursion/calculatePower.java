public class calculatePower {
    static int power(int base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        else{
        return power(base, exponent-1) * base;
        }
    }
public static void main(String[] args) {
    System.out.println(power(2, 3));
}
}