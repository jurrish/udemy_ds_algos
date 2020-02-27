package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayTest
{
    public static void main(String[] args)
    {
        int[] intArray = new int[7];  //cant increase or decrease array size

        intArray[0] = 20;  //zero based
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22; //filled

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }

        for(int ints : intArray)
        {
            System.out.println(ints);
        }

        int[] newIntArr = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            newIntArr[i] = intArray[i] + 5;
        }
        
        System.out.println(Arrays.toString(newIntArr));
    }
}
