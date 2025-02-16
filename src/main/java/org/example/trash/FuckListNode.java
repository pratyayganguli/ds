package org.example.trash;


import java.util.List;

/**
 * *
 * * @author Pratyay
 */
class FuckListNode {
    public static void main(String[] args) {
        String sumStr = "19998";
        int index = 0;
        ListNode res = new ListNode();

        while (index < sumStr.length()) {
            int num = Character.getNumericValue(sumStr.charAt(index));
            if (index == 0) {
                res = new ListNode(num);
            } else {
                res = new ListNode(num, res);
            }
            index++;
        }

        while(res != null){
            System.out.print(res.val);
            res = res.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;

    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}

