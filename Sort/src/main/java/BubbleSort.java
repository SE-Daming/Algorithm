import Util.Swap;

public class BubbleSort {
    public static void sort(int[] arr){
        int length = arr.length;
        for(int i=0;i<length;i++){
            for (int j=0;j<length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    Swap.swap(arr,j,j+1);
                }
            }
        }
    }
}
