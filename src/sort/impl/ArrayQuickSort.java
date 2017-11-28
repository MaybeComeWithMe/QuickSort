package sort.impl;

import model.QuickSortModel;
import sort.PrintableSort;

public class ArrayQuickSort implements PrintableSort<Integer> {

    private QuickSortModel<Integer> sortModel;

    @Override
    public void setSortModel(QuickSortModel<Integer> sortModel) {
        this.sortModel = sortModel;
    }

    @Override
    public QuickSortModel<Integer> getSortModel() {
        return this.sortModel;
    }

    @Override
    public QuickSortModel<Integer> iterateSort() {
        if (this.sortModel.getArray().size() == 0)
            return this.sortModel;//завершить выполнение если длина массива равна 0

        if (this.sortModel.getLow() >= this.sortModel.getHigh())
            return this.sortModel;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = this.sortModel.getLow() + (this.sortModel.getHigh() - this.sortModel.getLow()) / 2;
        int opora = this.sortModel.getArray().get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = this.sortModel.getLow(), j = this.sortModel.getHigh();
        while (i <= j) {
            while (this.sortModel.getArray().get(i) < opora) {
                i++;
            }

            while (this.sortModel.getArray().get(j) > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = this.sortModel.getArray().get(i);
                this.sortModel.getArray().set(i, this.sortModel.getArray().get(j));
                this.sortModel.getArray().set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (this.sortModel.getLow() < j) {
            sortModel.setLow(this.sortModel.getLow());
            sortModel.setHigh(j);
        }
        if (this.sortModel.getHigh() > i) {
            sortModel.setLow(i);
            sortModel.setHigh(this.sortModel.getHigh());
        }
        return sortModel;
    }
}



