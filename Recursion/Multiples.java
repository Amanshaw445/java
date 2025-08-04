public class Multiples {

    void MultiplesSum(int num, int k) {
        if (k == 1) {
            System.out.println(num); // base case
            return;
        }
        MultiplesSum(num, k - 1);       // recursive call
        System.out.println(num * k);    // print multiple
    }

    public static void main(String[] args) {
        Multiples m = new Multiples();
        m.MultiplesSum(3, 5);  // Output: 3 6 9 12 15
    }
}
