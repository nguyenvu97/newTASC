package collection_java.arry.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

import static collection_java.arry.set.SetEx.NUMBER;

public class DequeEx {

    public static void check_deque(){
        Deque<Integer> linkedList = new LinkedList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();

        /*
        ADD arrayDeque
        * */

        var startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.addFirst(i);
        }
        var endTime = System.nanoTime();

        System.out.println("linkedList add time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            arrayDeque.addFirst(i);
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque add time : " + (endTime - startTime) +"ns");

         startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.addLast(i);
        }
         endTime = System.nanoTime();

        System.out.println("linkedList add time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            arrayDeque.addLast(i);
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque add time : " + (endTime - startTime) +"ns");

        /*
            remove

        * */


        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.removeFirst();
        }
        endTime = System.nanoTime();

        System.out.println("linkedList remove time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            arrayDeque.removeFirst();
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque remove time : " + (endTime - startTime) +"ns");
        /*
        * tim kiem
        * */


        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.contains(100);
        }
        endTime = System.nanoTime();

        System.out.println("linkedList remove time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            arrayDeque.contains(100);
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque remove time : " + (endTime - startTime) +"ns");
    }
}
