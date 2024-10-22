

import thread.Asynchronous;
import thread.Synchronized;

import static collection_java.arry.Array_List.checkArray;


public class Main {
    public static void main(String[] args) {
//        hashSet ();
//        hashMap();
//        check_queue();
//        check_deque();

//        checkArray();
        Synchronized sync = new Synchronized();
        Asynchronous asynchronous = new Asynchronous();
        Thread thread = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
//                asynchronous.increment(); // bat dong bo
                sync.increment(); // dpng bo

            }
        });

        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
//                asynchronous.increment();
                sync.increment(); // dpng bo
            }
        });
        thread.start();
        thread1.start();
        try {
            var start = System.nanoTime();
            thread1.join();
            thread.join();
            var end = System.nanoTime();
            System.out.println("tong thoi gian :" + (end -start) + "ns" );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Hiển thị kết quả
        System.out.println("Final count: " + asynchronous.getCount());



    }


}







