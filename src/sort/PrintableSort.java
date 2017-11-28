package sort;

import model.QuickSortModel;

public interface PrintableSort<T> {

    void setSortModel(QuickSortModel<T> sortModel);

    QuickSortModel<T> getSortModel();

    QuickSortModel<T> iterateSort();
}
