
import java.util.ArrayList;
import java.util.Arrays;

public class PatternSearch {

    //The Pattern Searching algorithms are sometimes also referred to as String Searching Algorithms and are considered
    //as a part of the String algorithms. These algorithms are useful in the case of searching a string within another string.

    // String : A A B A C A B A A B A A B C A B A A B A A B A
    // Pattern : A A B A
    // Result : Pattern at index- 0, 7, 16, 19

    private static ArrayList patternSearch(String searchText, String pattern){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int textLength = searchText.length();
        int patternLength = pattern.length();
        char[] text = new char[textLength];
        char[] patternChar = new char[patternLength];
        char ch ;

        // Converting string to array
        for (int i = 0 ; i < textLength; i++){
            ch =  searchText.charAt(i);
            text[i] = ch;
        }
        for (int i = 0 ; i < patternLength; i++){
            patternChar[i] = pattern.charAt(i);
        }
        // both searchText and pattern strings are converted to array
        // creates small arrays out of main array text of length same as patternLength and checking is it small as pattern
        for (int i = 0; i <= (textLength-patternLength); i++){
            char[] check = new char[patternLength];
            int value1 = 0;
            int value2 = i;
            while(value1 < patternLength){
                check[value1] = text[value2];
                value1++;
                value2++;
            }
            if (Arrays.equals(check, patternChar)){
                result.add(i); //adding index at which pattern found in our array list
            }
        }
        if (result.size() >= 1){
            System.out.println("Pattern found at Index below:- ");
            return result;
        }else{
            System.out.println("No pattern found!");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(patternSearch("AABACABAABAABCABAABAABA", "AABA"));
        System.out.println(patternSearch("ASBNSAAAAAABAAAAABAAAAAGAHUHDJKDDKSHAAJF", "AAABAAA"));
        System.out.println(patternSearch("123451234512345123451234512345156324812345", "12345"));
        System.out.println(patternSearch("VishalSharmaVishalSharmaVishalSharma" , "Vikas"));
    }
}
