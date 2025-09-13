import java.util.Scanner;

public class EqualPartArray {
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
int[] makeSuffixSum(int[] arr){
    int n = arr.length;
    int [] suff = new int [n];
    suff[n-1]=arr[n-1];
    for(int i = n-2; i >= 0; i--){
        suff[i]= arr[i] + suff[i+1];
    }
    return suff;
}

void CheckEqualPart(){
  int total = 0;
        for (int num : arr) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = total - leftSum;

            if (leftSum == rightSum) {
                System.out.println("\nEqual partition is possible.");
                System.out.println("Partition Index: " + i);
                System.out.print("Left part: ");
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.print("\nRight part: ");
                for (int j = i + 1; j < arr.length; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println("\nLeft sum = Right sum = " + leftSum);
                return;
            }
        }

        System.out.println("\nEqual partition is NOT possible.");
}

public static void main(String[] args) {
EqualPartArray obj = new EqualPartArray();

        obj.arrayInput();

       int[] resultPref = obj.makePrefixSum(obj.arr);

            System.out.println("Prefix sum:");
            for (int i = 0; i < resultPref.length; i++) {
                System.out.print(resultPref[i] + " ");
        }
        System.out.println();

       int[] resultSuff = obj.makeSuffixSum(obj.arr);

            System.out.println("Suffix sum:");
            for (int i = (resultSuff.length - 1); i >= 0; i--) {
                System.out.print(resultSuff[i] + " ");
        }
        System.out.println();   

        // cheak if equal partition is possible
        obj.CheckEqualPart();

}
}