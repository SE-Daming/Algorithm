package Util;

public class Swap {
    public static void swap(int[]arr,int a,int b){
        if(a!=b){
            arr[a]=arr[a]^arr[b];
            arr[b]=arr[a]^arr[b];
            arr[a]=arr[a]^arr[b];
        }
    }
}
