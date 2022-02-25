public class JumpSearch {


    //Like Binary Search, Jump Search is a searching algorithm for sorted arrays. The basic idea is to check fewer
    // elements (than linear search) by jumping ahead by fixed steps or skipping some elements in place of searching
    // all elements.
    //Let’s consider the following array: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610).
    // The length of the array is 16. Jump search will find the value of 55 with the following steps assuming that the
    // block size to be jumped is 4.

    //STEP 1: Jump from index 0 to index 4;
    //STEP 2: Jump from index 4 to index 8;
    //STEP 3: Jump from index 8 to index 12;
    //STEP 4: Since the element at index 12 is greater than 55 we will jump back a step to come to index 8.
    //STEP 5: Perform a linear search from index 8 to get the element 55.

    public static int jumpSearch(int[] array, int searchNumber){
        int jumpCount = (int) Math.sqrt(array.length);
        int i = 0;

        while (array[i] < searchNumber){
            if ( array[i] == searchNumber){
                return i;
            }
            else if (array[i] > searchNumber){
                break;
            }
            i+= jumpCount;
        }

        for (int j = i; j >= (i-= jumpCount); j--){
            if(array[j] == searchNumber){
                return j;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int num = 144;


        System.out.println(jumpSearch(array, num));
    }


}
