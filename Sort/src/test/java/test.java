import Util.RandomNums;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class test {
    int[]arr;
    @Before
    public void init(){
        arr=RandomNums.randomArrays();
    }
    @After
    public void print(){
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void BubbleSort(){
        BubbleSort.sort(arr);
    }
    @Test
    public void SelectSort(){
        SelectSort.sort(arr);
    }
}
