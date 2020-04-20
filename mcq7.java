
/**
 * Write a description of class tests here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class mcq7
{
    /*
     * the correct answer for which lists won't work is when 
     * firstList is {1, 3, 5, 7} and secondList is {5, 5, 3, 1}
     */
    question10()
    {
        /** Precondition: firstList.size() == secondList.size() */
        public static boolean isReversed(ArrayList<Integer> firstList, ArrayList<Integer> secondList)
        {
            for (int j = 0; j < firstList.size() / 2; j++)
            {
                if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))
                {
                    return false;
                }
            }
        return true;
        }
    }
    
    /*
     * the correct answer for which value won't work is the number 4
     */
    question12()
    {
        int j = 0;
        while (val != numList.get(j))
        {
            j++;
        }
        numList.add(j, val);
    }
    
    /*
     * if you replace Line 3 with for (int j = (elements.size() - 1); j >= 0; j--)
     * then the modified method would return the index of the last appearance of the 
     * target value in the list, or -1 if the target value does not appear in the list
     */
    question13()
    {
        public static int sequentialSearch(ArrayList<Integer> elements, int target)       
        {        
            for (int j = 0; j < elements.size(); j++)     // Line 3        
            {        
                if (elements.get(j) == target)       
                {        
                    return j;        
                }        
            }        
            return -1;
        }
    }
    
    /*
     * the statement possibleIndex--; in line 10 of the method
     * will be executed 5 times
     */
    question16()
    {
        public static void insertionSort(int[] elements)
        {
            for (int j = 1; j < elements.length; j++)
            {
                int temp = elements[j];
                int possibleIndex = j;
                while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
                {
                    elements[possibleIndex] = elements[possibleIndex - 1];
                    possibleIndex--;   // line 10
                }
                elements[possibleIndex] = temp;
            }
        }
    }
}
