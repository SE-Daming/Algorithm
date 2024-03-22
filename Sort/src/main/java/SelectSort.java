import Util.Swap;

public class SelectSort {
    public static void  sort(int[]arr){
        int length = arr.length;
        for(int i=0;i<length;i++){
            int k=0;
            for (int j=0;j<length-i;j++){
                if(arr[k]<arr[j]){
                    k=j;
                }
            }
            Swap.swap(arr,k,length-i-1);
        }
    }
}
