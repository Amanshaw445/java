package Array;
import java.util.Scanner;

public class FindLargest {
    int arr[];
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


int Largest(){
    int max = arr[0];
    for(int i=0; i<arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        } 
    }
    return max;
}

public static void main(String[] args) {
    FindLargest obj = new FindLargest();
    obj.arrayInput();
    
    int result = obj.Largest();
    System.out.print("the greatest is : " + result);
}
}