package ru.arulin.algorithms.sort;

public class MargeSort {
    private int[] array;

    public MargeSort(){}

    public void sort(int[] A){
        array = A;
        margeSort(A, 0, A.length-1);
    }

    public void sort(int[] A, int p, int r){
        array = A;
        margeSort(A, p, r);
    }

    private void margeSort(int[] array,int left,int right){
        if(right <= left) return;
        int middle = (left+right)/2;
        margeSort(array, left, middle);
        margeSort(array, middle+1, right);
        merge(array, left, middle, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int[] leftArray = new int [lengthLeft];
        int[] rightArray = new int [lengthRight];

        // копируем отсортированные массивы во временные
        System.arraycopy(array, left, leftArray, 0, lengthLeft);
        System.arraycopy(array, mid+1, rightArray, 0, lengthRight);

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }


    }

    public int[] getArray() {
        return array;
    }
}
