package org.example.designs.patterns.creational;


/**
 **
 ** @author Pratyay
 */

class AbstractFactoryMethodExample {
    public static void main(String[] args) {
        Retailer onlineRetailer = new OnlineRetailer();
        ElectronicsStore onlineElectronicsStore = onlineRetailer.createElectronicsStore();
        onlineElectronicsStore.purchaseElectronics();
        Retailer offlineRetailer = new OfflineRetailer();
        GroceryStore offlineGroceryStore = offlineRetailer.createGroceryStore();
        offlineGroceryStore.buyGrocery();
    }
}


interface ElectronicsStore {
    void purchaseElectronics();
}

class OnlineElectronicsStore implements ElectronicsStore {
    @Override
    public void purchaseElectronics() {
        System.out.println("purchasing from online electronics store");
    }
}

class OfflineElectronicsStore implements ElectronicsStore {
    @Override
    public void purchaseElectronics() {
        System.out.println("purchasing from offline electronics store");
    }
}

interface GroceryStore {
    void buyGrocery();
}

class OnlineGroceryStore implements GroceryStore {
    @Override
    public void buyGrocery() {
        System.out.println("purchased from online grocery store");
    }
}

class OfflineGroceryStore implements GroceryStore {
    @Override
    public void buyGrocery() {
        System.out.println("purchased from offline grocery store");
    }
}

abstract class Retailer {
    abstract ElectronicsStore createElectronicsStore();
    abstract GroceryStore createGroceryStore();
}

class OnlineRetailer extends Retailer {
    @Override
    ElectronicsStore createElectronicsStore() {
        return new OnlineElectronicsStore();
    }

    @Override
    GroceryStore createGroceryStore() {
        return new OnlineGroceryStore();
    }
}

class OfflineRetailer extends Retailer {

    @Override
    ElectronicsStore createElectronicsStore() {
        return new OfflineElectronicsStore();
    }

    @Override
    GroceryStore createGroceryStore() {
        return new OfflineGroceryStore();
    }
}




