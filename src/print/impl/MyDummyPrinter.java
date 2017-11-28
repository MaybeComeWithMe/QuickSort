package print.impl;

import print.Printer;
import sort.PrintableSort;

import java.util.concurrent.TimeUnit;


public class MyDummyPrinter implements Printer<Integer> {
    
    @Override
    public void printSorted(PrintableSort<Integer> printableSort) throws InterruptedException {
        while (true){
            System.out.println(printableSort.getSortModel().getArray());
            printableSort.iterateSort();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
