package Threads;

public class Producer implements Runnable {

    Store store;

    public Producer(Store store){
        this.store=store;
    }


    public void run()
    {
        while (true) {
            store.reduce();
        }
    }
}
