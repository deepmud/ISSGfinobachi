package fibonacciGenerator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FibonacciGeneratorTests {

    @Test
    void shouldGenerateIndexNumbersOneToTen(){
        fibonacciGenerator.FibonacciGenerator fibonacciGenerator =
                new fibonacciGenerator.FibonacciGenerator();
        int[] expected = {0,1,1,2,3,5,8,13,21,34};
        Assertions.assertArrayEquals(expected,fibonacciGenerator.
                GenerateIndexNumbersOneToTen());
    }

    @Test
    void GenerateUserFibonacciIndexNumber(){
        FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();
        Assertions.assertArrayEquals(GenerateIndexNumbersOneToTen(),
                fibonacciGenerator.GenerateUserFibonacciIndexNumber(10));
    }

    public int[] GenerateIndexNumbersOneToTen(){

        int[] numbers = new int[10];

        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < 10; i++) {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
        return numbers;
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
        }
        return numbers;
    }



}

