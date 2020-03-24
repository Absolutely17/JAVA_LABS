package Threads;

public class Consumer implements Runnable {

    Store store;

    public Consumer(Store store)
    {
        this.store=store;
    }


    public void run() {
        while (true) {
           store.add();
        }
    }
}
