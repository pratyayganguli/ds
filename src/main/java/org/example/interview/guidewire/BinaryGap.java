package org.example.interview.guidewire;


import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        var binaryGapLengthCollection = binaryGap.getBinaryGap(9467);
        System.out.println(binaryGapLengthCollection);
    }

    /**
     *
     * @param num
     * @return
     */
    public List<Integer> getBinaryGap(int num) {
        List<Integer> gapLengthCollection = new ArrayList<>();
        String binaryRep = Integer.toBinaryString(num);
        System.out.println(binaryRep);
        char[] binaryRepArr = binaryRep.toCharArray();
        operate(binaryRepArr);
        return gapLengthCollection;
    }

    private void operate(char[] gapArray) {
        int count = 0;
        for (int i = 0; i < gapArray.length ; i++) {
            if(gapArray[0] == '1' && gapArray[1] == '0') {
                count += 1;
                i = i+1;
            }
            if(i < gapArray.length - 2){
                if(gapArray[i] == '1' && gapArray[i+1] == '0') {
                    System.out.println(count);
                    count = 0;
                }

                if(gapArray[i] == '1' && gapArray[i+1] == '1'){
                    System.out.println(count);
                    count = 0;
                }

                if(gapArray[i] == '0') {
                    count +=1;
                }
            } else {
                if(count > '0' && gapArray[i] == '1') {
                    System.out.println(count);
                }
            }
        }
    }
}