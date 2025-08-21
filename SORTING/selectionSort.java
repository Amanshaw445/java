package SORTING;

public class selectionSort {
    static void sSort(int[] a){



        for(int i = 0; i<a.length-1; i++){
            int x = i;

            for(int j = i+1; j<a.length; j++){
                if(a[x]>a[j]) {
                    x = j;

                }
            }
        int temp =  a[i];
            a[i] = a[x];
            a[x] = temp;
        }

    }

    public static void main(String[] args) {
        int [] a = {2,7,4,3,5,3};
        sSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}