package Experiments;
import java.util.Scanner;

import static Experiments.BinarySearch.a;

/*public class MergeS {

    public static int swapcount = 0;
    public static int a[];
    MergeS(int m[]){
        a=m;
    }

      void mergeSort(int[] a, int first, int last) {
        int mid;
        if (first < last) {
            mid = (first + last) / 2;
            // dividing the list using recursive calls
            mergeSort(a, first, mid);
            mergeSort(a, mid + 1, last);
            merge(a, first, mid, last);

        }
    }

     void merge (int a, int first, int mid, int last) {
        int[] b = new int[20];// creating a temporary array
        int i = first;
        int j = mid + 1;
        int k = first;
        while (i <= mid && j <= last) {// checking the condition to merge
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;

            } else {
                b[k] = a[j];
                j++;

            }
            k++;
        }
        while (i <= mid)// incrementing the index value of the temporary array
            b[k++] = a[i++];
        while (j <= last)
            b[k++] = a[j++];// incrementing the index value of the temporary array
        for (i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                swapcount++;
            }
        }
        for (i = first; i <= last; i++)
            a[i] = b[i];// assigning temporary array elements to originl array

    }
    static int[] result(){
        return BinarySearch.a ;
    }
    public int swaps(){
        return swapcount;
    }

}*/

