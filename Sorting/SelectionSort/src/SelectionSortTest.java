import java.util.Arrays;

public class SelectionSortTest
{
    public static void main(String[] args)
    {
        //select largest element and place it into the sorted partition
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //set last index to end of array, iterate backwards and decrement the lastUnsortedIndex
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            //set largest to 0 and compare starting at i = 1
            int largest = 0;

            //start i at 1, compare values and save largest as an index# for later
            for (int i = 1; i <= lastUnsortedIndex; i++)
            {
                //check to see if where youre at is bigger than largest value
                if(intArray[i] > intArray[largest])
                {
                    //if it is, set a new largest index
                    largest = i;
                }
            }
            //swap last indice with largest value, and wherever that largest value is in the array
            //with the value at lastUnsortedIndex (last value in array)
            swap(intArray, lastUnsortedIndex, largest);
            
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j)
    {
        if(i == j)
        {
            return;
        }

        if(i > j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
