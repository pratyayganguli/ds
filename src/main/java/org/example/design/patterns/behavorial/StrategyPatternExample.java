package org.example.design.patterns.behavorial;

/**
 *
 * For strategy pattern example, we require three major components,
 *
 * 1. Strategy interface
 * 2. Concrete strategy classes
 * 3. Context class.
 *
 */

class StrategyPatternExample {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.setOrderStrategy(new OfflineStore());
        orderContext.order();
    }
}

// strategy interface
interface OrderStrategy {
    void order();
}

class OrderContext {
    private OrderStrategy orderStrategy;

    public void setOrderStrategy(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public void order() {
        orderStrategy.order();
    }
}

// concrete strategy class
class OfflineStore implements OrderStrategy {
    @Override
    public void order() {
        // placing order from Offline store
    }
}

// concrete strategy class
class OnlineStore implements OrderStrategy {
    @Override
    public void order() {
        // placing order from online store
    }
}