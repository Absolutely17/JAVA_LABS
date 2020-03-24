package Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {

    private final AtomicInteger products = new AtomicInteger();
    private int products_2 = 0;
    private final int MAX_CAPACITY = 10;

    public Store()
    {
        products.set(0);
    }

    //If version 2 then added synchronized
    public  void add()
    {
        // Version 1
        if (products.get() == MAX_CAPACITY) ;
        else
        while (products.get() < MAX_CAPACITY) {
            int value = products.incrementAndGet();
            System.out.println("Added. Value = " + value);
        }
        //Version 2
        /*while (products_2 == MAX_CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        while (products_2 < MAX_CAPACITY) {
            int value = ++products_2;
            System.out.println("Added. Value = " + value);
        }
        notify();*/
    }

    //If version 2 then added synchronized
    public void reduce()
    {
        //Version 1
        if (products.get()==0);
        else
        while (products.get()>0) {
            int value = products.decrementAndGet();
            System.out.println("Reduced. Value = " + value);
        }
        //Version 2
        /*while (products_2 == 0)
            try {
                wait();
            }
            catch(InterruptedException e){}
        while (products_2 > 0) {
            int value = --products_2;
            System.out.println("Reduced. Value = " + value);
        }
        notify();*/
    }
}