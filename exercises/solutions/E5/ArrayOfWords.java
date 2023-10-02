package exercises.solutions.E5;

import java.util.Arrays;

public class ArrayOfWords {
        public static void main(String[] args) {
        String[] myArray = {"earth", "wind", "fire", "water", "spirit", "darkness", "wouga-bouga"};
        
        int longestWord = 0;
        int longestWordIndex = 0;

        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index].length() > longestWord) {
                longestWordIndex = index;
            }
        }
        
        System.out.println("The longest word in the array is: "+ myArray[longestWordIndex]);


        int[] vowelCountArray = new int[myArray.length];
        int index = 0;

        for (String word : myArray) {
            word.toLowerCase();
            int vowelCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (isVowel(word.charAt(i)) == true) {
                    vowelCount++;
                }
            }
            vowelCountArray[index] = vowelCount;
            index++;
        }

        System.out.println(Arrays.toString(vowelCountArray));

        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));

    }

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
            return true;
        } else 
            return false;
    }
}
