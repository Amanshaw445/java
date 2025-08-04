public class array {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 9;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 2;
        numbers[4] = 0;

        System.out.println("print using loop");
        for(int i=0; i<numbers.length; i++) {
                System.out.println("element at index " + i + " is " +numbers[i]);
        }
    }
}