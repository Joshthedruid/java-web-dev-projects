package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] fibonnaci = {1,1,2,3,5,8};

        System.out.println("Array values:");
        for(int i=0; i<6; i++){
            System.out.println(fibonnaci[i]);
        }

        System.out.println("Odd array values:");
        for(int i=0; i<6; i++){
            if(fibonnaci[i]%2 == 1) {
                System.out.println(fibonnaci[i]);
            }
        }

        String mouses = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordSplit = mouses.split(" ");
        System.out.println(Arrays.toString(wordSplit));
        String[] sentenceSplit = mouses.split("\\.");
        System.out.println(Arrays.toString(sentenceSplit));
    }
}
