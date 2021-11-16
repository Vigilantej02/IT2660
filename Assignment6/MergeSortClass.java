//so many nests in this one, lookin like a birdhouse.
public class MergeSortClass
{
    public static int[] mergeSort(int[] array)
    {   //if statement to see if the merge is complete
        if(array.length <= 1)
        {
            return array;
        }
        //midpoint is a variable that divides thelenght f the array by 2
        int midpoint = array.length / 2;
        //creating 2 arrays called right and left to store each half
        //of the initial array
        int[] left = new int[midpoint];
        int[] right = new int[midpoint];
        //for loop to put all the numbers in the left array
        for(int leftCount = 0; leftCount < midpoint; leftCount++)
        {
            left[leftCount] = array[leftCount];
        }
        //for loop to put the rest of the numbers past the midpoint
        //into the right-hand array
        for(int rightCount = 0; rightCount < right.length; rightCount++)
        {
            right[rightCount] = array[midpoint + rightCount];
        }
        int[] result = new int[array.length];
        //yay recursion
        left = mergeSort(left);
        right = mergeSort(right);
        
        result = merge(left, right);
        return result;
    }
    //a private class that I use to merge the left and right arrays together
    private static int[] merge(int[] left, int[] right)
    {   //declaring an inner result array with a size that total left+right
        int[] result = new int[left.length + right.length];
        //variables used in a while statement later. i visualize these as like
        //actual arrows above the printed array
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        //while statement that checks if there is anything left to merge
        while(leftPointer < left.length || rightPointer < right.length)
        {
            //this while statement contains 3 if statements, with each
            //corresponding to whether both the right and left have
            //numbers to sort, if just the right or if just the left do
            //these also dictate the actual sorting method
            if(leftPointer < left.length && rightPointer < right.length)
            {   //nested if statement saying that if the number stored
                //in the pointer given on the left is smaller than the right,
                //store that in the result pointer. If not, store it in the right one.
                if(left[leftPointer] < right[rightPointer])
                {
                    result[resultPointer++] = left[leftPointer++];
                }
                else
                {
                    result[resultPointer++] = right[rightPointer++];
                }
            }
            //else-if incase theres just numbers on the left
            else if(leftPointer < left.length)
            {
                result[resultPointer++] = left[leftPointer++];
            }
            else if (rightPointer < right.length)
            {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}
