package thread;

import java.lang.reflect.RecordComponent;
import java.util.concurrent.locks.ReentrantLock;

public class Asynchronous {

    private int count = 0;

    public  void increment() {
        count++;
    }

    public int getCount() {
        return count;

    }
}
