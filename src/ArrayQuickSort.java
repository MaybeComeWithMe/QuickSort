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


    public void  printSortArray(int low, int high) {



    }

    public void sortArray( int low, int high){
        if (array.size() == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить


        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента

        int i = low, j = high;
        while (i <= j) {
            while (array.get(i) < opora) {
                i++;
            }

            while (array.get(j) > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }
        System.out.println(toString());

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            sortArray(low, j);

        if (high > i)
            sortArray(i, high);

    }

    @Override
    public String toString(){
            String res = "";
            for (Integer value : this.array) {
                res += value;
                res += " ";
            }
            return res;
        }

}



