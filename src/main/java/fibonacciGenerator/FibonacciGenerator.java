/*
    fibonacci index of 8:
                0 1 1 2 3 5 8 13 21
                0 1 2 3 4 5 6 7 8

    This is how it is calculated;
        0+1+1=2 is index of 2
        0+1+1=2 is index of 3
        1+2=3 is index of 4
        2+3=5 is index of 5
        3+5=8 is index of 6
        5+8=13 is index of 7
 */

package fibonacciGenerator;

import java.util.Scanner;



public class FibonacciGenerator {

    public int[] GenerateIndexNumbersOneToTen() {

        int[] numbers = new int[10];
        System.out.print("FINOBACCI SERIES:  ");
        numbers[0]=0;
        System.out.print(numbers[0] + "  ");
        numbers[1]=1;
        System.out.print(numbers[1] + "  ");
        for(int i = 2; i < 10; i++){
            numbers[i] = numbers[i-2] + numbers[i-1];
            System.out.print(numbers[i] + "  ");
        }
        return numbers;  //return because of @Test
    }

    public int[] GenerateUserFibonacciIndexNumber(int userFibonacciIndex) {

        int[] numbers = new int[userFibonacciIndex];
        System.out.print("FINOBACCI SERIES:  ");
        numbers[0] = 0;
        System.out.print(numbers[0] + "  ");
        numbers[1] = 1;
        System.out.print(numbers[1] + "  ");
        for (int i = 2; i < userFibonacciIndex; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
            System.out.print(numbers[i] + "  ");
        }
        return numbers;  //return because of @Test
    }

    public static void main(String[] args){
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        fibonacciGenerator.GenerateIndexNumbersOneToTen();

        System.out.println();
        System.out.println();
        System.out.print("Type in the finobacci series you are interested:");
        Scanner input = new Scanner(System.in);
        int userFibonacciIndex = input.nextInt();
        fibonacciGenerator.GenerateUserFibonacciIndexNumber(userFibonacciIndex) ;
    }
}
