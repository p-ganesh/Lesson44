package com.company;

import java.io.*;
import java.util.*;
import java.text.*; //for NumberFormat
public class Main {
    public static void main(String args[])
    {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        ArrayList aryLst = new ArrayList( );

        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
            name = kbReader.nextLine( );
            if( !name.equalsIgnoreCase("EXIT") )
            {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble( );
                System.out.println(" "); //gives an eye pleasing blank line between accounts
                BankAccount theAccount = new BankAccount(name, amount);
                aryLst.add(theAccount);

            }
        }while(!name.equalsIgnoreCase("EXIT"));
//Search aryLst and print out the name and amount of the largest bank account
        BankAccount ba = (BankAccount)aryLst.get(0);
        double maxBalance = ba.balance; //set last account as winner so far
        String maxName = ba.name;
        /*for(int x = 1; x < aryLst.size(); x++)
        {
            ba = (BankAccount)aryLst.get(x);
            if (ba.balance > maxBalance) {
                maxBalance = ba.balance;
                maxName = ba.name;
            }
        }
        System.out.println(" ");
        System.out.println("The account with the largest balance belongs to " + maxName + ".");
        System.out.println("The amount is $" + formatter.format(maxBalance) + ".");*/

        Comparator(BankAccount.)
    }
}