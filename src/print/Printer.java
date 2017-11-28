package print;

import sort.PrintableSort;

public interface Printer<T> {

    void printSorted(PrintableSort<T> printableSort) throws InterruptedException;
}
