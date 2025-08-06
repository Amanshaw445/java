package Array;
import java.util.Scanner;

public class reverseArray {
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

void reverse(){
    int left = 0;
    int right = arr.length-1;
    while(left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}

public static void main (String []args) {
    reverseArray obj = new reverseArray();
    obj.arrayInput();
    System.out.println("original array : ");
    obj.printArray();
    obj.reverse();
    System.out.println("Reversed array : ");
    obj.printArray();
    }
}