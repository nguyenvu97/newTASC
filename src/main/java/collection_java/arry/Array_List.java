package collection_java.arry;

import java.util.*;

import static collection_java.set.SetEx.NUMBER;

public class Array_List {
    public static void checkArray(){
        List<Integer>arrayList = new ArrayList<>();
        List<Integer>linkedList = new LinkedList<>();
             /*
        add linkedList
        * */

        var startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            arrayList.add(i);
        }
        var endTime = System.nanoTime();
        System.out.println("arrayList add : "  + (endTime - startTime)  + "ns" );
         startTime = System.nanoTime();

        for (int i = 0; i < NUMBER; i++) {
            linkedList.add(i);
        }
         endTime = System.nanoTime();
        System.out.println("linkedList add : "  + (endTime - startTime)  + "ns" );

        /*
        remove
        * */

         startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            arrayList.clear();
        }
         endTime = System.nanoTime();
        System.out.println("arrayList add : "  + (endTime - startTime)  + "ns" );
        startTime = System.nanoTime();

        for (int i = 0; i < NUMBER; i++) {
            linkedList.clear();
        }
        endTime = System.nanoTime();
        System.out.println("linkedList add : "  + (endTime - startTime)  + "ns" );
        /* time kiem

         */
        startTime = System.nanoTime();
        for (int i = 0; i < NUMBER; i++) {
            arrayList.contains(NUMBER/2);
        }
        endTime = System.nanoTime();
        System.out.println("arrayList add : "  + (endTime - startTime)  + "ns" );
        startTime = System.nanoTime();

        for (int i = 0; i < NUMBER; i++) {
            linkedList.contains(NUMBER/2);
        }
        endTime = System.nanoTime();
        System.out.println("linkedList add : "  + (endTime - startTime)  + "ns" );
    }
}
