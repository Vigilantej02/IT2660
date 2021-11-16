import java.util.Random;
import java.util.Arrays;
 
public class Main
{
   public static void main(String[] args)
    {   //this initial code block generates 100 random numbers from 1 - 1000 
        //using the Random package, then assigns those numbers to an
        //array named numbers
        int[] numbers = new int[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = rand.nextInt(1000);
        }
        //printing the generated numbers
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(numbers));
        //merge sorting
        MergeSortClass m = new MergeSortClass();
        numbers = m.mergeSort(numbers);
        //printing sorted array
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(numbers));
    }
}
