package org.example.practice.gfg;

class AlternativeElements {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13};
        printAlternativeElements(arr);
    }

    /**
     *
     * @param data
     */
    private static void printAlternativeElements(int[] data) {
        for (int i = 0; i < data.length; i++) {
            if(i % 2 == 0) {
                System.out.println(data[i]);
            }
        }
    }
}
