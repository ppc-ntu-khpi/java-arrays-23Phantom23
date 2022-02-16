package domain;

public class Exercise 
{
    public static int Calculate(int[] array)
    {
        int TwoMaxNumber = 0;
        for (int i = 0; i < array.length; i++) 
        {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) 
            {
                if (array[j] < min) 
                {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
            TwoMaxNumber = array[array.length-1];
        }
        return TwoMaxNumber;
    }
}