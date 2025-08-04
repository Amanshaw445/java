public class bubbleSort {

    static void bSort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0;j< a.length - i- 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] a ={5,9,6,2,4,1};
        bSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}