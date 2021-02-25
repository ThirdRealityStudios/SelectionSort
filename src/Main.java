public class Main
{
    public static void main(String[] args)
    {
        SelectionSort sS = new SelectionSort();

        int[] unsorted = new int[]{0,-32,2,3,-1,90,101};

        System.out.println("min index: " + sS.minIndex(0, unsorted));

        sS.print(unsorted);

        sS.sort(unsorted);

        sS.print(unsorted);
    }
}
