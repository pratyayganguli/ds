
package org.example.practice.gfg;


class ThirdLargestElement {

    private static int getThirdLargestNumber(int[] arr) {
        int largestElement = -1;
        int secondLargestElement = -1;
        int thirdLargestElement =  -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largestElement) {
                thirdLargestElement = secondLargestElement;
                secondLargestElement = largestElement;
                largestElement = arr[i];
            } else if(arr[i] > secondLargestElement && arr[i] != largestElement) {
                thirdLargestElement = secondLargestElement;
                secondLargestElement = arr[i];
            } else if(arr[i] > thirdLargestElement && arr[i] != secondLargestElement && arr[i] != largestElement) {
                thirdLargestElement = arr[i];
            }
        }
        return thirdLargestElement;
    }

    public static void main(String[] args) {
        // sample input arrays

        //int [] arr = new int[]{1, 19, 3, 75, 0, 9};
        int [] arr = new int[]{13, 100, 40, 3, 5, 1};
        int data = getThirdLargestNumber(arr);
        System.out.println(data);
    }
}