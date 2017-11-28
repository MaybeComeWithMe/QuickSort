import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Sort {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter the length of array: ");
        int input = in.nextInt();
        System.out.println("\nOur array: ");

        for (int i = 0; i < input; i++) {
            myArray.add(r.nextInt(20));
        }

        ArrayQuickSort arrayQuickSort = new ArrayQuickSort(myArray);
        arrayQuickSort.sortArray(0, myArray.size() - 1);
        ArrayList<Integer> arrayList = (ArrayList<Integer>) arrayQuickSort.getArray();


        System.out.println(arrayList.toString());

        ArraySortUI app = new ArraySortUI();
        app.setVisible(true);

    }
}