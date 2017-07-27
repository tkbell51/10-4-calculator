package com.tbell.demo.controllers;

public class Operations {
    private String firstNumber;
    private String secondNumber;
    private String operator;

    public Operations(String firstNumber, String secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public Double doMath (String number1, String number2, String operator){
        double num1 =  Double.parseDouble(number1);
        double num2=  Double.parseDouble(number2);

        double result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "X":
                result = num1 * num2;
                break;
            case "/":
                switch((int) num2){
                    case 0:
                        result = 0;
                        break;
                        default:
                            result = num1/num2;
                }
                break;
            case "%":
                result = num1 % num2;
                break;
            case "^":
                result = Math.pow(num1,num2);
        }
return result;
    }
}
