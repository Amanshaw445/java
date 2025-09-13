import java.util.Scanner;
public class array2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        //array Initialize
        int [] array = new int[size];

        //array input
        System.out.println("Enter elements : ");
        for(int i=0; i<array.length; i++){
            array[i]=scanner.nextInt();
        }

        //to print array
        for(int i=0; i<array.length; i++){
            System.out.println("Elements at index " + i + " is " + array[i]);
        }
        

    }

}
