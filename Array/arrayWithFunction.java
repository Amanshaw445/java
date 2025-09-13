import java.util.Scanner;

public class arrayWithFunction {
    int[] arr;
    Scanner scanner = new Scanner(System.in);

void arrayInput(){
    System.out.print("Enter the size of array: ");
    int size= scanner.nextInt();

    arr = new int [size] ;

    System.out.print("Enter the elements of array: ");
    for(int i=0; i<arr.length; i++){
        arr[i] = scanner.nextInt();
    }
}
void printArray(){
    System.out.println("The array is : ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    arrayWithFunction obj = new arrayWithFunction();
    obj.arrayInput();
    obj.printArray();
}
}