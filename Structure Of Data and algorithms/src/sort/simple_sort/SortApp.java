package sort.simple_sort;

import sort.simple_sort.bubble_sort.ArrayBub;
import sort.simple_sort.insert_sort.ArrayIns;
import sort.simple_sort.select_sort.ArraySel;

public class SortApp {

    public static void main(String[] args) {
        int maxSize = 1000000;
        ArrayBub array = new ArrayBub(maxSize);
        ArraySel arraySel = new ArraySel(maxSize);
        ArrayIns arrayIns = new ArrayIns(maxSize);

        SortApp.fillIn(array, maxSize);
        SortApp.fillIn(arraySel, maxSize);
        SortApp.fillIn(arrayIns, maxSize);



        System.out.println("Bubble Sort:");
        long startTime = System.currentTimeMillis();
        array.bubbleSort();
        long time = System.currentTimeMillis() - startTime;
        System.out.println(time + " ms");


        System.out.println();

        System.out.println("Select Sort:");
        startTime = System.currentTimeMillis();
        arraySel.selectSort();
        time = System.currentTimeMillis() - startTime;
        System.out.println(time + " ms");

        System.out.println();

        System.out.println("Insert Sort:");
        startTime = System.currentTimeMillis();
        arrayIns.insertSort();
        time = System.currentTimeMillis() - startTime;
        System.out.println(time + " ms");






    }

    public static void fillInRandomly(ListArray arrayValue, int maxSize){
        ListArray array = arrayValue;
        for(int i = 0; i < maxSize; i++){
            long num = (long)(Math.random()*(maxSize-1));
            array.insert(num);
        }
    }

    public static void fillIn(ListArray arrayValue, int maxSize){
        ListArray array = arrayValue;
        for(int i = 0; i < maxSize; i++){
            array.insert(i+1);
        }
    }
}
