package org.example.practice.gfg;


class SecondLargestElement {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{12, 1, 89, 8, 45, 33, 2};
        int data = getSecondLargestElement(arr);
        System.out.println("Second largest element: " + data);
    }

    /**
     * We are not passing any negative numbers over here
     * @param data
     * @return
     */
    private static int getSecondLargestElement(int[] data) {
       int largestNumber = -1;
       int secondLargestNumber = -1;

        for (int i = 0; i < data.length; i++) {
            if(data[i] > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = data[i];
            } else if(data[i] > secondLargestNumber && data[i] != largestNumber) {
                secondLargestNumber = data[i];
            }
        }
        return secondLargestNumber;
    }
}
