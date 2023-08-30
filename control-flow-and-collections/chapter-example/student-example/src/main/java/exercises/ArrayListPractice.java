package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static int sumEvens(ArrayList<Integer> nums){
        int sum = 0;
        for(int pickNum : nums){
            if(pickNum%2 == 0){
                sum += pickNum;
            }
        }
        return sum;
    }

    public static void print5(ArrayList<String> words){
       for(String checkWord : words){
           if(checkWord.length() == 5){
               System.out.println(checkWord);
           }
       }
    }
}
