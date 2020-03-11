public class Producer implements Runnable {

    Store store;
    int maxCapacity = 10;

    public Producer(Store store){
        this.store=store;
    }

    public void run()
    {
        while (true) {
            if (store.get() == maxCapacity) ;
            else {
                store.add();
                System.out.println("Производитель увеличил количество товаров на 1.");
                System.out.println("Товаров стало: " + store.get());
            }
        }
    }
}
