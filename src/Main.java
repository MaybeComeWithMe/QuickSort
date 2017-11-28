import model.QuickSortModel;
import print.Printer;
import print.impl.MyDummyPrinter;
import sort.impl.ArrayQuickSort;
import sort.PrintableSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> myArray = new ArrayList<Integer>() {{
            add(6);
            add(5);
            add(7);
            add(2);
            add(3);
            add(5);
            add(1);
            add(7);
            add(3);
            add(6);
            add(1);
            add(8);
        }};

        QuickSortModel<Integer> sortModel= new QuickSortModel<>(myArray);
        PrintableSort<Integer> printableSort = new ArrayQuickSort();
        printableSort.setSortModel(sortModel);

        Printer<Integer> printer = new MyDummyPrinter();
        printer.printSorted(printableSort);

    }
}