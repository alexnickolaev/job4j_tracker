package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int multiply(int b) {
        return b * x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperations(int sum, int minus, int multiply, int divide) {
        return sum + minus + multiply + divide;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int resultMinus = Calculator.minus(10);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(10);
        System.out.println(resultMultiply);
        int resultDivide = calculator.divide(10);
        System.out.println(resultDivide);
        int sumAllOperations = calculator.sumAllOperations(result, resultMinus, resultMultiply, resultDivide);
        System.out.println(sumAllOperations);
    }
}