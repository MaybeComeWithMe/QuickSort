import java.util.List;

public class ArrayQuickSort {

    private List<Integer> array;

    public List<Integer> getArray() {
        return array;
    }

    public void setArray(List<Integer> array) {
        this.array = array;
    }

    public ArrayQuickSort(List<Integer> array) {

        this.array = array;
    }

    public void sort(int low, int high) {
        sortArray(this.array, low, high);
    }

    public void  sortArray(List<Integer> myArray, int low, int high) {
        if (myArray.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = myArray.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (myArray.get(i) < opora) {
                i++;
            }

            while (myArray.get(j) > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = myArray.get(i);
                myArray.set(i, myArray.get(j));
                myArray.set(j, temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sortArray(myArray, low, j);

        if (high > i)
            sortArray(myArray, i, high);
    }
}



