package Array;
import java.util.Scanner;

public class FindSecondLargest {
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


int SecondLargest(){
    int Max = Integer.MIN_VALUE;
    int SecondMax = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length; i++){
        if(Max < arr[i]){
            SecondMax = Max;
            Max = arr[i];
        }
        else if (arr[i] > SecondMax && arr[i] != Max) {
            SecondMax = arr[i];
        }
    }
    return SecondMax;
}
int ThirdLargest(){
    int Max = Integer.MIN_VALUE;
    int SecondMax = Integer.MIN_VALUE;
    int ThirdMax = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length; i++){
            int num = arr[1];
        if (num == Max || num == SecondMax || num == ThirdMax) // is to skip if reapeting values exist so not to fill the max secondmax and third max with the same values if repeated several times in the array
            continue;

        if(Max < arr[i]){
            ThirdMax = SecondMax;
            SecondMax = Max;
            Max = arr[i];
        }
        else if (arr[i] > SecondMax && arr[i] != Max) {
            ThirdMax = SecondMax;
            SecondMax = arr[i];
        }
        else if (arr[i] > ThirdMax && arr[i] != SecondMax){
            ThirdMax = arr[i];
        }
    }
    return ThirdMax;
}

public static void main(String[] args) {
    FindSecondLargest obj = new FindSecondLargest();
    obj.arrayInput();
    
    // int result = obj.SecondLargest();
    // System.out.print("the second largest is : " + result);
    int result = obj.ThirdLargest();
    System.out.print("the third largest is : " + result);
}
}
