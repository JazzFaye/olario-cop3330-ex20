/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Use class Scanner

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //Use scanner to obtain input
        //Use try..catch statement
        try{
            double tax = 0; //Declaration of variables
            System.out.println("What is the order amount? ");
            String order = sc.nextLine();   //Obtain input from user
            double order_amount = Double.parseDouble(order);    //Convert input from string to double

            System.out.println("What state did you live in? ");
            String state = sc.nextLine();   //Obtaini input from the user
            //If-else statement
            if (state.equalsIgnoreCase("Wisconsin") || state.equalsIgnoreCase("WI")){   //If user choose "wi" state
                System.out.println("What county did you live in? ");
                String county = sc.nextLine();  //Obtain input from the user
                //Using nested if-else statement
                if (county.equalsIgnoreCase("Eau Claire")){ //If user choose "Eua Claire"
                    double tax_state = order_amount * 0.05; //Formula to calculate tax_state
                    double tax_county = order_amount * 0.005;   //Formula to calculate tax_county
                    tax = tax_county + tax_state;   //Formula to calculate total tax
                    System.out.printf("The tax is $%.2f", tax ); //Display the total tax
                }
                //If user choose "Dunn"
                else if (county.equalsIgnoreCase("Dunn")){
                    double tax_state = order_amount *0.05;  //Formula to calculate tax_state
                    double tax_county = order_amount * 0.004;   //Formula to calculate tax_county
                    tax = tax_county + tax_state;   //Formula to calculate total tax
                    System.out.printf("The tax is $%.2f", tax ); //Display the total tax
                }
                //If user choose "IL" state
            } else if (state.equalsIgnoreCase("Illinois") || state.equalsIgnoreCase("IL")){
                tax = order_amount * 0.08;  //Formula to calculate tax
                System.out.printf("The tax is $%.2f", tax ); //Display the tax
            }else{
                //If user inputs state that is neither "wi" or "il"
                System.out.println("No tax will be collected.");
            }
            System.out.printf("\nThe total is $%.2f", order_amount + tax);   //Display the overall total
        }
        catch (NumberFormatException e) {
            //Display the following if the user inputs non - numerical values
            System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}
