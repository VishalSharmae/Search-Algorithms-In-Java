import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    private static ArrayList<Integer> searchingArray = new ArrayList<Integer>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 5 elements in the array list:- ");
        System.out.println("Enter 1st Number: ");
        searchingArray.add(scanner.nextInt());
        System.out.println("Enter 2nd Number: ");
        searchingArray.add(scanner.nextInt());
        System.out.println("Enter 3rd Number: ");
        searchingArray.add(scanner.nextInt());
        System.out.println("Enter 4th Number: ");
        searchingArray.add(scanner.nextInt());
        System.out.println("Enter 5th Number: ");
        searchingArray.add(scanner.nextInt());

        System.out.println("");
        System.out.println("Enter the number you want to search in the array: ");

        Integer[] arr = searchingArray.toArray(new Integer[0]);

        int searchingNumber = scanner.nextInt();
        scanner.nextLine();
        linearSearch(arr, searchingNumber);
    }

    private static int linearSearch(Integer[] array, int number){
        for (int i = 0; i < searchingArray.size(); i++){
            if (searchingArray.get(i) == number){
                System.out.println("Number " + number + " found in the array!");
                return number;
            }
        }
        System.out.println("Number " + number + " not found in the array!");
        return -1;
    }
}
