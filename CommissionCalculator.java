/******************************************************************************
*
* CommissionCalculator.java
*
* Created by: Parker Sands
* Parkland College
* CSC-240, JAVA 2
* Spring 2025
*
******************************************************************************
*
* DESCRIPTION
* 1. Manages Auto, Home, and Life insurance policies.
* 2. Allows user input through a menu-driven system.
* 3. Computes and displays commission for each policy type.
* 4. Works with `Auto`, `Home`, and `Life` classes to store and process policy data.
*
******************************************************************************
*
* LAB INSTRUCTIONS
* 1. Implement a `CommissionCalculator` class to manage multiple insurance policies.
* 2. Create methods to accept user input for Auto, Home, and Life insurance policies.
* 3. Implement a `Run()` method to control the menu-driven interface.
* 4. Compute commission based on policy details and display results.
* 5. Ensure user interaction continues until they select option 7 to quit.
*
******************************************************************************
*
* LAB HINTS
* 1. Use `Scanner` to handle user input.
* 2. Implement `switch-case` inside `Run()` for menu selection.
* 3. Update policy objects when user inputs new data.
* 4. Call the appropriate `toString()` method for displaying policy details.
*
******************************************************************************
*
* EXAMPLE PROGRAM OUTPUT (Generated from CommissionCalculator)
* -----------------------------
* Welcome to Parkland Insurance
* -----------------------------
* Enter any of the following:
* 1) Enter auto insurance policy information
* 2) Enter home insurance policy information
* 3) Enter life insurance policy information
* 4) Compute commission and print auto policy
* 5) Compute commission and print home policy
* 6) Compute commission and print life policy
* 7) Quit
*
******************************************************************************
*
* MY THOUGHT PROCESS
* 1. Define attributes for Auto, Home, and Life policy objects.
* 2. Implement a constructor to initialize objects and `Scanner`.
* 3. Implement a `Run()` method to display and handle menu options.
* 4. Implement separate methods for input and displaying policy details.
* 5. Ensure program loop runs until user selects quit option.
*
******************************************************************************
*
* INPUT
* 1. User selects menu options and enters policy details interactively.
*
* PROCESSING AND CALCULATIONS
* 1. Store user-provided insurance policy details.
* 2. Compute commission for each policy type.
*
* OUTPUT
* 1. Display policy details and computed commission upon user request.
*
******************************************************************************/
package java2_lab_02_commission_calculator;

import java.util.Scanner;

/**
 * CommissionCalculator.java
 * Manages Auto, Home, and Life insurance policies,
 * allowing user input and computing commissions.
 */

public class CommissionCalculator {

	// Attributes
    private Auto autoPolicy;
    private Home homePolicy;
    private Life lifePolicy;
    private Scanner scanner;

    // Constructor
    public CommissionCalculator() {
        this.autoPolicy = new Auto();
        this.homePolicy = new Home();
        this.lifePolicy = new Life();
        scanner = new Scanner(System.in);
    }

    // Welcome message
    private void displayWelcome() {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";
        
        System.out.println(GREEN + "\n=====================================");
        System.out.println("WELCOME TO PARKLAND INSURANCE");
        System.out.println("=====================================");
        System.out.println("Protecting your 'ass'-ets since 2025.");
        System.out.println("=====================================\n" + RESET);
}
    
    // Exit Program
    private void exitProgram() {
        String GREEN = "\u001B[32m"; // Green text
        String RESET = "\u001B[0m"; // Reset to default
        
        String[] exitMessages = {
            "\nThanks for using Parkland Insurance! Stay 'cobra'-erd!",
            "\nDrive safe, stay insured!",
            "\nSee you next time, policyholder!",
            "\nTo infinity... And beyond!"
        };
        
        // Select a random exit message
        int randomIndex = (int) (Math.random() * exitMessages.length);
        String message = exitMessages[randomIndex];
        
        // Print message in green
        System.out.println(GREEN + message + RESET);
    }
    
    // Method to enter Auto insurance details
    private void enterAutoPolicy() {
        String RESET = "\u001B[0m"; 
        String INPUT_COLOR = "\u001B[36m";  // Cyan for user input
       
        System.out.println("Enter first name of insured:");
        System.out.print(INPUT_COLOR); // Switch to cyan before input
        String firstName = scanner.nextLine();
        System.out.print(RESET); // Reset to normal after input
        
        System.out.println("Enter last name of insured:");
        System.out.print(INPUT_COLOR);
        String lastName = scanner.nextLine();
        System.out.print(RESET);
        
        System.out.println("Enter make of vehicle:");
        System.out.print(INPUT_COLOR);
        String make = scanner.nextLine();
        System.out.print(RESET);
        
        System.out.println("Enter model of vehicle:");
        System.out.print(INPUT_COLOR);
        String model = scanner.nextLine();
        System.out.print(RESET);
        
        System.out.println("Enter amount of liability:");
        System.out.print(INPUT_COLOR);
        double liability = scanner.nextDouble();
        System.out.print(RESET);
        
        System.out.println("Enter amount of collision:");
        System.out.print(INPUT_COLOR);
        double collision = scanner.nextDouble();
        System.out.print(RESET);
        
        scanner.nextLine(); // Consume newline
        this.autoPolicy = new Auto(firstName, lastName, make, model, liability, 
        		collision);
    }

    // Method to enter Home insurance details
    private void enterHomePolicy() {
        String RESET = "\u001B[0m"; 
        String INPUT_COLOR = "\u001B[36m";  // Cyan for user input
        
        System.out.println("Enter first name of insured:");
        System.out.print(INPUT_COLOR); // Switch to cyan before input
        String firstName = scanner.nextLine();
        System.out.print(RESET); // Reset to normal after input
        
        System.out.println("Enter last name of insured:");
        System.out.print(INPUT_COLOR);
        String lastName = scanner.nextLine();
        System.out.print(RESET);

        System.out.println("Enter house square footage:");
        System.out.print(INPUT_COLOR);
        int squareFootage = scanner.nextInt();
        System.out.print(RESET);
        
        System.out.println("Enter amount of dwelling:");
        System.out.print(INPUT_COLOR);
        double dwelling = scanner.nextDouble();
        System.out.print(RESET);
        
        System.out.println("Enter amount of contents:");
        System.out.print(INPUT_COLOR);
        double contents = scanner.nextDouble();
        System.out.print(RESET);
        
        System.out.println("Enter amount of liability:");
        System.out.print(INPUT_COLOR);
        double liability = scanner.nextDouble();
        System.out.print(RESET);
        
        scanner.nextLine(); // Consume newline
        this.homePolicy = new Home(firstName, lastName, squareFootage, dwelling, contents, liability);
    }

    // Method to enter Life insurance details
    private void enterLifePolicy() {
        String RESET = "\u001B[0m"; 
        String INPUT_COLOR = "\u001B[36m";  // Cyan for user input
        
        System.out.println("Enter first name of insured:");
        System.out.print(INPUT_COLOR); // Switch to cyan before input
        String firstName = scanner.nextLine();
        System.out.print(RESET); // Reset to normal after input
        
        System.out.println("Enter last name of insured:");
        System.out.print(INPUT_COLOR);
        String lastName = scanner.nextLine();
        System.out.print(RESET);
        
        System.out.println("Enter age of insured:");
        System.out.print(INPUT_COLOR);
        int age = scanner.nextInt();
        System.out.print(RESET);
        
        System.out.println("Enter amount of term:");
        System.out.print(INPUT_COLOR);
        double termCoverage = scanner.nextDouble();
        System.out.print(RESET);
        
        scanner.nextLine(); // Consume newline
        this.lifePolicy = new Life(firstName, lastName, age, termCoverage);
    }
        
    // Run method - Handles user input and menu
    public void Run() {
    	displayWelcome();
        int choice;
        do {
            displayMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println
                ("\nInvalid input. Please enter a number between 1 and 7.\n");
                scanner.nextLine(); // Consume invalid input
                choice = -1; // Reset choice to prevent unintended behavior
            }
            
            switch (choice) {
                case 1:
                    enterAutoPolicy();
                    break;
                case 2:
                    enterHomePolicy();
                    break;
                case 3:
                    enterLifePolicy();
                    break;
                case 4:
                    System.out.println(this.autoPolicy);
                    break;
                case 5:
                    System.out.println(this.homePolicy);
                    break;
                case 6:
                    System.out.println(this.lifePolicy);
                    break;
                case 7:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 7);
    }
  
    // Display menu
    private void displayMenu() {
        String RESET = "\u001B[0m";
        String YELLOW = "\u001B[33m";
        String GREEN = "\u001B[32m";

        System.out.println(GREEN + "-------------------------------------");
        System.out.println("Parkland Insurance Main Menu");
        System.out.println("-------------------------------------\n" + RESET);
        System.out.println("Enter any of the following:\n");
        System.out.println(YELLOW + "1) Enter auto insurance policy information");
        System.out.println("2) Enter home insurance policy information");
        System.out.println("3) Enter life insurance policy information");
        System.out.println("4) Compute commission and print auto policy");
        System.out.println("5) Compute commission and print home policy");
        System.out.println("6) Compute commission and print life policy");
        System.out.println("7) Quit");
        System.out.println("-------------------------------------\n" + RESET);
    }
}
