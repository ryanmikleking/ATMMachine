/* Ryan M. King
* CS 1110
* HW4
* Description: Creates an ATM Machine using the Account class by creating ten Account objects all with $100 balance.
*/
package edu.ucmo.king;

import java.util.Scanner;

public class ATMachine{
    public static void main(String[] args) {
        // variables
        Account[] bank = new Account[10]; // array for the Account objects
        int actID; // users account ID

        Scanner input = new Scanner(System.in); // scans user input

        // for loop to create Account object bank
        for(int i = 0; i < bank.length; i++){
                bank[i] = new Account(i, 100.00);
        }

        // endless loop to run ATM Machine. Requires users to manually exit
        while(true){
            // Takes user input for account ID
            System.out.println("Enter account ID number: ");
            actID = input.nextInt();
            int choice; // Stores users account info
            // determines if input is valid ID
            if(actID >= 0 && actID <= 9){

                // Creates option menu
                System.out.println("Main Menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice: ");

                // Stores users choice for ATM
                choice = input.nextInt();

                // While loop that executes the commands from ATM menu
                while(choice != 4){
                    // Switch statement to process users commands
                    switch(choice){
                        case 1:
                            System.out.println("The balance for " + actID + " is: " + bank[actID].getBalance()); // Returns balance
                            break;
                        case 2:
                            double withdrawal; // stores withdrawal amount
                            //  Takes users input
                            System.out.println("Enter an amount to withdraw: ");
                            withdrawal = input.nextDouble();
                            // calls withdraw method
                            bank[actID].withdraw(withdrawal);
                            System.out.println("The balance for " + actID + " is: " + bank[actID].getBalance()); // Returns balance
                            break;
                        case 3:
                            double depositAMT; // stores deposit amount
                            // takes users input
                            System.out.println("Enter an amount to deposit: ");
                            depositAMT = input.nextDouble();
                            // calls deposit method
                            bank[actID].deposit(depositAMT);
                            System.out.println("The balance for " + actID + " is: " + bank[actID].getBalance()); // Returns balance
                            break; // ends users selection process
                    }
                    // Requests user to select another option
                    System.out.println("Main Menu");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    System.out.println("Enter a choice: ");
                    choice = input.nextInt();
                }
            }
        }
    }
}