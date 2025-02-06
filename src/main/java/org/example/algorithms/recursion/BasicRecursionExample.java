package org.example.algorithms.recursion;


/**
 * *
 * * @author Pratyay
 */
class BasicRecursionExample {
    static int count = 0;

    public static void main(String[] args) {
        call();
    }

    static void call() {
        System.out.println("calling!");
        System.out.println("did not answer");
        count++;
        if(count > 2) {
            return;
        }
        call();
    }
}
