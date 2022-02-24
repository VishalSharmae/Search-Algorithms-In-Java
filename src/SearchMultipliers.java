import java.util.*;

class SerialMultiplier {
    int first =1;
    int second = 1; // default values of integers is 1
    int third = 1;
    int fourth = 1;
    int fifth = 1;
    int result = 1;

    public SerialMultiplier(int first) {
        this.first = first;
        this.result = result * first;
    }

    public  SerialMultiplier(int first, int second) {
        this.first = first;
        this.second = second;
        this.result = result * first * second;
    }

    public SerialMultiplier(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.result = result * first * second * third;
    }

    public SerialMultiplier(int first, int second, int third, int fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.result = result * first * second * third * fourth;
    }

    public SerialMultiplier(int first, int second, int third, int fourth, int fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        this.result = result * first * second * third * fourth * fifth;
    }

    public int getResult() {
        return result;
    }
}

class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");;
        int first=1, second=1, third=1, fourth=1, fifth=1;
        first = Integer.parseInt(input[0]);
        if(n > 1) {
            second = Integer.parseInt(input[1]);
            if(n >= 3) {
                third = Integer.parseInt(input[2]);
                if(n >= 4) {
                    fourth = Integer.parseInt(input[3]);
                    if(n == 5) {
                        fifth = Integer.parseInt(input[4]);
                    }
                }
            }
        }

        SerialMultiplier result;
        switch(n) {
            case 1:
                result = new SerialMultiplier(first);
                System.out.println(result.getResult());
                break;
            case 2:
                result = new SerialMultiplier(first,second);
                System.out.println(result.getResult());
                break;
            case 3:
                result = new SerialMultiplier(first,second,third);
                System.out.println(result.getResult());
                break;
            case 4:
                result = new SerialMultiplier(first,second,third,fourth);
                System.out.println(result.getResult());
                break;
            case 5:
                result = new SerialMultiplier(first,second,third,fourth,fifth);
                System.out.println(result.getResult());
                break;
            default:
                System.out.println("Invalid Inputs");
        }
    }
}
