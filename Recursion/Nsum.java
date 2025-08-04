public class Nsum {
    int Sum(int n){
        if (n == 0) {
            return 0;
        }
        else if(n % 2 == 0){
            return -n + Sum(n-1);
        }
        else{
            return n + Sum(n-1);
        }
    }
    public static void main(String[] args) {
        Nsum obj = new Nsum();
        int number = 10;
        int result = obj.Sum(number);
        System.out.println("Sum till " + number + " is " + result);
    }
}
