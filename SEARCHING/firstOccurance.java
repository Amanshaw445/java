public class firstOccurance {
    static int firstOcc(int [] a, int target){
        int n = a.length;
        int start = 0, end = n-1;
        int firstOcc = -1;
        while(start <= end){
        int mid = start + (end-start)/2;
            if(a[mid] == target){
                firstOcc = mid;
                end = mid-1;
            }
            else if(a[mid] < target){
                start = mid+1;
            }
            else if(a[mid] > target){
                end = mid-1;
            }
        }

        return firstOcc;
    }

    public static void main(String[] args) {
        int [] a = {1,2,2,4,5,5,5,6,6,7,8};
        int target = 5;
        int result = firstOcc(a,target);
        System.out.println("the first occurance of " + target + " is at " + result);
    }
}