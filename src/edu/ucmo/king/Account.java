/* Ryan M. King
* CS 1110
* HW4
* Description: Creates a class for the object Account and performs get/set methods for each property.
* Program determines monthly and annual interest, deposit, and withdrawal actions.
 */
package edu.ucmo.king;

import java.util.Date;

public class Account {

    // Variables
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // no arg constructor
    Account() {
        id = 0;
        balance = 0;
    }

    // Two arg constructor
    Account(int someId, double someBalance) {
        id = someId;
        balance = someBalance;
    }

    // method gets ID
    public int getId(){ return id; }

    // method sets ID
    public void setId(int newID){ id = newID; }

    // method gets balance
    public double getBalance(){ return balance; }

    // method sets balance
    public void setBalance(double newBalance) { balance = newBalance; }

    // method gets annual interest rate
    public double getAnnualInterestRate() { return annualInterestRate / 100; }

    // method sets annual interest rate
    public void setAnnualInterestRate(double newRate) { annualInterestRate = newRate; }

    // method gets date
    public Date getDate() { return new Date(); }

    // method gets Monthly interest rate
    public double getMonthlyInterestRate(){ return getAnnualInterestRate() / 12; }

    // method gets Monthly Interest
    public double getMonthlyInterest(){ return balance * getMonthlyInterestRate(); }

    // method withdraws money from account
    public void withdraw(double amt){
        balance = balance - amt;
    }

    // method deposits money into the account
    public void deposit(double amt){
        balance = balance + amt;
    }

    }