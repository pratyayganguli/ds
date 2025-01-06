package org.example.practice.gfg;

class MaxProductTriplet {

    public static void main(String [] args) {
        int [] data = new int[]{10, 3, 5, 6, 20};
        
        // sample arr input
        //int [] data = new int[]{1, 5, 7, 2, 9, 0, 3};

        int product = getMaxProduct(data);
        System.out.println(product);
    }

    private static int getMaxProduct(int [] arr) {
        int largestNumber = -1;
        int secondLargestNumber = -1;
        int thirdLargestNumber = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largestNumber) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = largestNumber;
                largestNumber = arr[i];
            } else if(arr[i] > secondLargestNumber && arr[i] != largestNumber) {
                thirdLargestNumber = secondLargestNumber;
                secondLargestNumber = arr[i];
            } else if(arr[i] > thirdLargestNumber && arr[i] != secondLargestNumber && arr[i] != thirdLargestNumber) {
                thirdLargestNumber = arr[i];
            }
        }
        return largestNumber * secondLargestNumber * thirdLargestNumber;
    }
}
