
/**
 * Write a description of class mcq6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mcq6
{
    /**
     * the correct loop header to place in the line where it says missing loop header
     * is for(int y = x + 1; y < arr.length; y++)
     */
    question11()
    {
       boolean duplicates = false;
        for (int x = 0; x < arr.length - 1; x++)
        {
            /* missing loop header */
            {
                if (arr[x] == arr[y])
                {
                    duplicates = true;
                }
            }
    }

    /**
     * the correct value needed to be placed where it says missing initial value
     * is values[0]
     */
    question13()
    {
        int maximum = /* missing initial value */;
        for (int k = 1; k < values.length; k++)
        {
            if (values[k] > maximum)
            {
                maximum = values[k];
            }
        }
        System.out.println(maximum);
    }
}
