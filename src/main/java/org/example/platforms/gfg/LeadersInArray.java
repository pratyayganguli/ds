package org.example.platforms.gfg;


import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
class LeadersInArray {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(16);
        numbers.add(17);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        findLeader(numbers);
    }

    private static void findLeader(List<Integer> numbers) {
        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < numbers.size() ; i++) {
            if(i == (numbers.size() - 1)) {
                leaders.add(numbers.get(i));
            } else {
                for(int j = i + 1; j < numbers.size(); j++) {
                    if((numbers.get(i) > numbers.get(j)) && j == numbers.size()-1) {
                        leaders.add(numbers.get(i));
                    } else if(numbers.get(i) < numbers.get(j)) {
                        break;
                    }
                }
            }
        }
        System.out.println(leaders);
    }
}
