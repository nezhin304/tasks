package nextValue;

import java.util.concurrent.atomic.AtomicInteger;

public class NextValue {

    public synchronized int getNextValue() {
        return value++;
    }

    public int getNextValue() {
        synchronized (this) {
            return value++;
        }
    }

    public int getNextValue() {
        return new AtomicInteger(value).incrementAndGet();
    }
}
