package Experiments;

public class BinarySearch {
    // instance variables of integer type
     static int low;
    static int high;
    static int mid,k,s;
    static int[] a;
    int[] sort( int a[], int s){
        for (int i=0;i<=s;i++){
            for (int j=1;j<= i-1;j++){
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    // method to perform binary search
    public static int bSearch(int b[], int k){
    int a[]=new BinarySearch().sort(b,b.length-1);
    int s=a.length-1;
    // passing the arguments:an array,a key value and size of array
        low = 1;// low is assigned with zero
        high = s;// high is assigned with last element of array
        for (int i = 1; i < s; i++) {// initializing the loop variable and checking the conditon
            mid = (low + high) / 2;// calculating the mid value
            // returns the position if the desired element is found
            if (k == a[mid])
                return mid+1;
                // low gets asigned to the value followed by mid if key is greater
            else if (k > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return 0;
    }
}

