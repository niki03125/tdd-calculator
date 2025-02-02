package tdd;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
         return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int add (String numbers){
        String[] numberArray = numbers.split(",");
        int sum = 0;
        for(String num: numberArray){
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public int add(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

}
