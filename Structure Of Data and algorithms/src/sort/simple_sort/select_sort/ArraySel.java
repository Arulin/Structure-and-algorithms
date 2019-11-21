package sort.simple_sort.select_sort;

import sort.simple_sort.ListArray;

public class ArraySel implements ListArray {
    private long a[];
    private int numbersElements;

    public ArraySel(int maxSize){
        a = new long[maxSize];
        numbersElements = 0;
    }

    @Override
    public void insert(long value) {
        a[numbersElements] = value;
        numbersElements++;
    }

    @Override
    public void display() {
        for(int i = 0; i < numbersElements; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void selectSort(){
        int out, in, min;
        for(out = 0; out < numbersElements-1;out++){
            min = out;
            for(in = out+1; in < numbersElements;in++){
                if(a[min] > a[in]){
                    min = in;
                }
            }
            swap(min, out);
        }
    }

    private void swap(int first, int second){
        long temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
