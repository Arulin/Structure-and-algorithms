package sort.simple_sort.insert_sort;

import sort.simple_sort.ListArray;

public class ArrayIns implements ListArray {
    private long[]a;
    private int numElements;

    public ArrayIns(int maxSize){
        a = new long[maxSize];
        numElements = 0;
    }

    @Override
    public void insert(long value) {
        a[numElements] = value;
        numElements++;
    }

    @Override
    public void display() {
        for(int i = 0; i < numElements;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insertSort(){
         int in, out;
         for(out = 1; out < numElements;out++){
             long temp = a[out];
             in = out;
             while (in > 0 && a[in-1] >= temp){
                 a[in] = a[in-1];
                 --in;
             }
             a[in] = temp;
         }
    }
}
