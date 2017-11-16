import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>() {{
            add(6);
            add(5);
            add(7);
            add(9);
            add(2);
        }};

        ArrayQuickSort arrayQuickSort = new ArrayQuickSort(myArray);
        arrayQuickSort.sort(0, myArray.size() - 1);
        ArrayList<Integer> arrayList = (ArrayList<Integer>) arrayQuickSort.getArray();

        for (Integer integer : arrayList) {
           System.out.print(integer + " ");
        }
    }
}