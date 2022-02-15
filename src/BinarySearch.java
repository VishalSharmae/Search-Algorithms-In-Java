public class BinarySearch {

    //Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
    //It uses divide and conquer methodology and requires data set to be sorted beforehand.
    //Usually, within binary search, we compare the target value to the middle element of the array at each iteration.
    //If the target value is equal to the middle element, the job is done.
    //If the target value is less than the middle element, continue to search on the left.
    //If the target value is greater than the middle element, continue to search on the right.


    // Code if we have the sorted array
    private static int sortedBinarySearch(int[] array, int elementToSearch){
        int firstIndex = 0;
        int lastIndex = array.length-1;

        while (firstIndex<lastIndex){
            int middleIndex = (firstIndex + lastIndex) /2;
            if (array[middleIndex] == elementToSearch){
                return middleIndex;
            }
            else if (array[middleIndex] < elementToSearch){
                firstIndex = middleIndex + 1;
            }
            else if(array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int searchElement){
        //sorting array
        int tempNumber; //[2,5,4,8,6,1]
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tempNumber = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempNumber;
                }
            }
        }

        int firstIndex = 0;
        int lastIndex = array.length-1;

        while (firstIndex<lastIndex){
            int middleIndex = (firstIndex + lastIndex) /2;
            if (array[middleIndex] == searchElement){
                return middleIndex;
            }
            else if (array[middleIndex] < searchElement){
                firstIndex = middleIndex + 1;
            }
            else if(array[middleIndex] > searchElement) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    //Recursive Binary Search- Sorted Array
    private static int binarySearch(int[] array, int firstIndex, int lastIndex, int searchElement){
        if (lastIndex >= firstIndex){
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;

            if (array[middleIndex] == searchElement){
                return middleIndex;
            }

            if (array[middleIndex] > searchElement) {
                return binarySearch(array, firstIndex, middleIndex - 1, searchElement);
            }

            return binarySearch(array,middleIndex+1,lastIndex,searchElement);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {3,15,22,36,44,58,67,79,82};
        int[] array = {15,36,3,58,82,44,67,22,79};

        int lastIndex = array.length -1;

        int searchElement = 79;

        System.out.println(sortedBinarySearch(sortedArray, searchElement));
        System.out.println(binarySearch(array,searchElement));
        System.out.println(binarySearch(sortedArray, 0, lastIndex, searchElement));
    }
}
