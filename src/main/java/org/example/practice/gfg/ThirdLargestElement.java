
package org.example.practice.gfg;


class ThirdLargestElement {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        int [] data = new int[] {12, 1, 89, 8, 45, 33, 2};
        int thirdLargestElement = getThirdLargestElement(data);
        System.out.println(thirdLargestElement);
    }

    /**
     * 
     * Still using the o(n) for solving this question
     * 
     * @param data
     * @return
     */
    private static int getThirdLargestElement(int[] data) {

        int largestElement = -1;
        int secondLargestElement = -1;
        int thirdLargestElement = -1;

        for (int i = 0; i < data.length; i++) {
            if(data[i] > largestElement){
                secondLargestElement = largestElement;
                thirdLargestElement = secondLargestElement;
                largestElement = data[i];
            } else if(data[i] > secondLargestElement && data[i] != largestElement) {
                thirdLargestElement = secondLargestElement;
                secondLargestElement = data[i];
            } else if(data[i] > thirdLargestElement && data[i] != secondLargestElement) {
                thirdLargestElement = data[i];
            }
        }
        return thirdLargestElement;
    }
}