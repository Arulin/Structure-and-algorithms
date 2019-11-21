package sort.simple_sort.bubble_sort;


import sort.simple_sort.ListArray;

public class ArrayBub implements ListArray {
    private long[] a;
    private int numElements;
    private int maxSize;

    public ArrayBub(int max){
        maxSize = max;
        a = new long[maxSize];
        numElements = 0;
    }

    @Override
    public void insert(long value){
        a[numElements] = value;
        numElements++;
    }

    @Override
    public void display(){
        for(int i = 0; i < numElements;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        int out, in;
        for(out = numElements-1; out > 1; out--){
            for(in = 0; in < out; in++){
                if(a[in] > a[in+1]){
                    swap(in, in+1);
                }
            }
        }
    }


    private void swap(int firstValue, int secondValue){
        long temp = a[firstValue];
        a[firstValue] = a[secondValue];
        a[secondValue] = temp;
    }
}
