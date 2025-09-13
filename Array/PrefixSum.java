import java.util.Scanner;

public class PrefixSum {
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


int[] makePrefixSum(int[] arr){
    int n = arr.length;
    int [] pref = new int [n];
    pref[0]=arr[0];
    for(int i=1; i<n; i++){
        pref[i]= arr[i] + pref[i-1];
    
    }
    return pref;
}

int rangeSum(int[] pref, int l,int r){
    if(l==1){
        return pref [0];
    }
    return pref[r-1] - pref[l-2];
}

public static void main(String[] args) {
PrefixSum obj = new PrefixSum();
        obj.arrayInput();

       int[] result = obj.makePrefixSum(obj.arr);

            System.out.println("Prefix sum:");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter range to print following 1 index");
        int l = sc.nextInt();
        int r = sc.nextInt();

        int rangeSum = obj.rangeSum(result, l, r);
        System.out.println("Sum of index " + l +" to " + r + " is: " + rangeSum);
}
}