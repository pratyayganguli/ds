package org.example.datastructures;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}


class CyclicLinkedListProblem {
    public boolean isCyclic(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        // returning a dummy value
        return false;
    }

}

class Executor {
    public static void main(String[] args) {
        CyclicLinkedListProblem cyclicLinkedListProblem = new CyclicLinkedListProblem();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        cyclicLinkedListProblem.isCyclic(node1);
    }
}