public class binarySearch {
    

    static boolean binarySearch(int[] a, int target){
        int n = a.length;
        int st = 0, end = n-1;

        while (st <= end){
            int mid = (st + end)/2;
            if(target == a[mid]){
                return true;
            }
            else if(target < a[mid]){
                end = mid - 1;
            }
            else
             st= mid + 1;
        }
    return false;
    }

    static boolean recursiveBinarySearch(int[] a,int start,int end,  int target){
            if(start>end){
                return false;
            }
            int mid = (start + end)/2;
            if(target == a[mid]){
                return true;
            }
            else if(target<a[mid]){
                return recursiveBinarySearch(a, start,  mid-1, target);
            }
            else if (target>a[mid]){
                return recursiveBinarySearch(a, mid+1, end, target);
            }
        return false;
    }

public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int target = 4;

    boolean result = binarySearch(a, target);
    System.out.println(result);
    boolean recursiveResult = recursiveBinarySearch(a, 0, a.length-1, target);
    System.out.println(recursiveResult);
    }
}