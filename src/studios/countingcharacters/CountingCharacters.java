package studios.countingcharacters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// for loop method
//---------------------------
//public class CountingCharacters {
//    public static void main(String[] args){
//        String string = "The best of both worlds";
//        int count = 0;
//
//        for(int i =0; i < string.length(); i++){
//            if(string.charAt(i) !=' ')
//                count++;
//        }
//        System.out.println("Total number of characters in a string: " + count);
//    }
//}

//hash map method
// -------------

public class CountingCharacters {
    // initialize a hashmap

    // create a new scanner
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character to count: ");
        // store input in a string
        String stringOfCharacters = input.next();

        // convert to a character array
        char[] charsInString = stringOfCharacters.toCharArray();
        for(char character : charsInString){
            if(charCount.containsKey(character)){
                charCount.put(character,charCount.get(character) + 1);
            }
            else {
                charCount.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> eachChar : charCount.entrySet()){
            System.out.println(eachChar.getKey() + ": " + eachChar.getValue());
        }
    }


}