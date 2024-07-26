package dev.arturo.models;

public class Main {
    public static void main(String[] args) {

        UserInput userInput = new UserInput("", 0);

        Integer monthNumber = 12;

        userInput.obtainMonth(monthNumber);

        System.out.println(userInput.getMonthName());

        System.out.println(userInput.getMonthName());
     
}
}