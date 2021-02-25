public class SelectionSort
{
    public int minIndex(int start, int[] unsorted)
    {
        int minIndex = start;

        for(int i = start; i < unsorted.length; i++)
        {
            int a = unsorted[i];
            int b = unsorted[minIndex];

            if(a < b)
            {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void sort(int[] unsorted)
    {
        for(int i = 0; i < unsorted.length; i++)
        {
            int min = minIndex(i, unsorted);

            swap(unsorted, i, min);
        }
    }

    public void swap(int[] swappable, int a, int b)
    {
        int temp = swappable[a];

        swappable[a] = swappable[b];

        swappable[b] = temp;
    }

    public void print(int[] array)
    {
        System.out.println();
        System.out.println();

        for(int i : array)
        {
            System.out.print("| " + i + " ");
        }
    }
}
