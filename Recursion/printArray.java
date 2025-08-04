public class printArray {

    static int sum(int [] arr,int idx){
      if(idx == arr.length){
        return 0;
      }
      return arr[idx] + sum(arr , idx + 1);
    }

    static int max(int [] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = max(arr, idx+1);
        return Math.max((arr)[idx] , smallAns);
    }

    static void print(int [] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " " );
        print(arr, idx+1);
    }

    static boolean check(int []arr , int target ,int idx){
        if(idx == arr.length)
            return false;
        else if(arr[idx] == target)
            return true;
        return check(arr, target, idx + 1);
        }

    static int checkIndex(int []arr , int target ,int idx){
        if(idx == arr.length)
            return -1;
        else if(arr[idx] == target)
            return idx;
        return checkIndex(arr, target, idx + 1);
        }

    static void printAllIndices(int []arr , int target ,int idx){
        if(idx == arr.length)
            return;
        else if(arr[idx] == target)
            System.out.print(idx + " ");
        printAllIndices(arr, target, idx + 1);
    }



public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 4, 5};

    System.out.println("the array is : " );
    print(arr, 0);
    System.out.println();  // for new line
    System.out.println("max in array : " + max(arr , 0));
    System.out.println("Sum of array is : " + sum(arr , 0));

    if(check(arr , 4 , 0))
        System.out.println("YES, target is present");
    else
        System.out.println("NO, target is not present");

    System.out.println("the target is present at index : " + checkIndex(arr , 4 , 0));

    printAllIndices(arr, 4, 0);

    }

}
















