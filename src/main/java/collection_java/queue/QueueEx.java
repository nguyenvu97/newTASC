package collection_java.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import static collection_java.set.SetEx.NUMBER;

public class QueueEx {

    public static void check_queue () {
        Queue<Integer> linkedList = new LinkedList<>();
        Queue<Integer> arrayDeque = new ArrayDeque<>();

        /*
        ADD linkedList
        * */

        var startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.add(i);
        }
        var endTime = System.nanoTime();

        System.out.println("linkedList add time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            arrayDeque.add(i);
        }
         endTime = System.nanoTime();

        System.out.println("arrayDeque add time : " + (endTime - startTime) +"ns");

        /*

        remove arrayDeque
        * */

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.remove(i);
        }
         endTime = System.nanoTime();

        System.out.println("linkedList remove time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque remove time : " + (endTime - startTime) +"ns");

        /*
        *  tìm kiếm  nhu nhau
        * */
        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.contains(100);
        }
        endTime = System.nanoTime();

        System.out.println("linkedList tìm kiếm time : " + (endTime - startTime) +"ns");

        startTime = System.nanoTime();

        for (int i = 0 ; i<NUMBER ; i++)
        {
            linkedList.contains(100);
        }
        endTime = System.nanoTime();

        System.out.println("arrayDeque tìm kiếm time : " + (endTime - startTime) +"ns");
        funcQueue ();
    }

    public static void funcQueue (){
        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.offer(6);
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
        System.out.println(linkedList.remove());
        System.out.println(linkedList);
        System.out.println(linkedList.element());
    }

}
