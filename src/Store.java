import java.util.concurrent.atomic.AtomicInteger;

public class Store {
    private final AtomicInteger products = new AtomicInteger();

    public void add()
    {
        products.incrementAndGet();
    }
    public int get()
    {
        return products.get();
    }
    public void reduce()
    {
        products.decrementAndGet();
    }
}