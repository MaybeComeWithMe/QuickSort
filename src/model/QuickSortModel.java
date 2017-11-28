package model;

import java.util.List;

public class QuickSortModel<T> {
    private List<T> array;
    private int low;
    private int high;

    public QuickSortModel(List<T> array) {
        this.array = array;
        this.setLow(0);
        this.setHigh(array.size() - 1);
    }

    public List<T> getArray() {
        return array;
    }

    public void setArray(List<T> array) {
        this.array = array;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
