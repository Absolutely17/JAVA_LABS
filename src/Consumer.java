public class Consumer implements Runnable {

    Store store;

    public Consumer(Store store)
    {
        this.store=store;
    }

    public void run()
    {
    while(true) {
        if (store.get() == 0) ;
        else {
            store.reduce();
            System.out.println("Покупатель уменьшил количество товаров на 1.");
            System.out.println("Товаров стало: " + store.get());
        }
    }
    }
}
