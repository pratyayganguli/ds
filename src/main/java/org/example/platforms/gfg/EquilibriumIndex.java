package org.example.platforms.gfg;


/**
 * *
 * * @author Pratyay
 *
 * Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists.
 * The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals
 * the sum of all elements at higher indexes.
 */

class EquilibriumIndex {

    public static void main(String[] args) {
        int res = getEquilibrium(new int[]{
                1, 2, 0, 3
        });
        System.out.println(res);
    }

    private static int getEquilibrium(int[] arr) {
        int mid = arr.length/2;
        System.out.println("Mid element: " + arr[mid]);
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < mid ; i++) {
            sumLeft = sumLeft + arr[i];
        }

        for(int j = mid + 1; j < arr.length; j++) {
            sumRight = sumRight + arr[j];
        }

        if(sumLeft == sumRight) {
            return mid;
        }
        return -1;
    }
}
