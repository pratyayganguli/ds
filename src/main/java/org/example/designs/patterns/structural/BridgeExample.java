package org.example.designs.patterns.structural;


import lombok.RequiredArgsConstructor;

/**
 * *
 *
 * How many ways can a customer pay for an order
 *
 * A. UPI
 * B. Credit/Debit Card
 * C. Third party platforms
 * D. NetBanking
 *
 * E. Cash on Delivery (QR)
 * F. Cash on Delivery (Offline)
 *
 */

interface Payment {
    void pay();
}

@RequiredArgsConstructor
class PrepaidPayment implements Payment {
    private final PaymentMode prepaidPaymentMode;

    @Override
    public void pay() {
    }
}

@RequiredArgsConstructor
class PostPaidPayment implements Payment {
    private final PaymentMode postpaidPaymentMode;

    @Override
    public void pay() {
    }
}

interface PaymentMode {
    PaymentMode getPaymentMode();
}

class PrepaidPaymentMode implements PaymentMode {
    @Override
    public PaymentMode getPaymentMode() {
        return null;
    }
}

class PostpaidPaymentMode implements PaymentMode {

    @Override
    public PaymentMode getPaymentMode() {
        return null;
    }
}






