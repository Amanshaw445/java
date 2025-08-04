public class fibonacci {
    static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }

        int prev = fib(n-1);
        int prevprev = fib(n-2);

        int ans = prev + prevprev;
        return ans;
    }
    // public static void main(String[] args) {
    //     System.out.println(fib(5));
    // }
    public static void main(String[] args) {
        for(int i=0; i<= 10; i++){
            System.out.println(fib(i));
        }
    }
}