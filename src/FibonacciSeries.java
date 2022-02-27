public class FibonacciSeries {

    //In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
    // The first two numbers of fibonacci series are 0 and 1.

    static int startNumOne = 0;
    static int startNumTwo = 1;

    // fibonacci series without recursion
    public static void fibonacciSeries(int count){ // count is total number of elements in the series
        int one = startNumOne;
        int two = startNumTwo;

        int sum = one;
        System.out.println(sum);
        System.out.println(two);

        for (int i = 3; i <= count; i++){
            sum = one + two;
            System.out.println(sum);
            one = two;
            two = sum;
        }
    }

    // fibonacci series with recursion

    public static void fibonacciSeriesRecursion( int count){

        if (count > 0){

            int sum = startNumOne + startNumTwo;
            System.out.println(sum);
            startNumOne = startNumTwo;
            startNumTwo = sum;
            fibonacciSeriesRecursion(count-1);
        }
    }

    public static void main(String[] args) {

        fibonacciSeries(10);
        System.out.println();
        // for recursion method
        System.out.println(startNumOne);
        System.out.println(startNumTwo);
        int count = 10;
        fibonacciSeriesRecursion(count -2);
    }
}
