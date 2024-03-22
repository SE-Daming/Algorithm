package Util;

import java.util.Random;

public class RandomNums {
    public static int[] randomArrays(){
        Random random=new Random();
        int[]arr=new int[10];
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(2000);
            num-=1000;
            arr[i]=num;
        }
        return arr;
    }
    
}
