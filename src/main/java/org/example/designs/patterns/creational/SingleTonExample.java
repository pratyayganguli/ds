package org.example.designs.patterns.creational;


/**
 * *
 * * @author Pratyay
 */
class SingleTonExample {
    //
    private volatile static SingleTonExample instance;

    private SingleTonExample() {
    }

    public static SingleTonExample getInstance() {
        if(instance ==  null) {
            synchronized (SingleTonExample.class) {
                if(instance == null) {
                    instance = new SingleTonExample();
                }
            }
        }
        return instance;
    }
}
