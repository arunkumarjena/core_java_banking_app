package com.corejava.pratice.bankingapp;


import java.util.Scanner;
import java.util.UUID;

class Customer{
    Scanner scanner = new Scanner(System.in);
    static UUID account = UUID.randomUUID();
    static int depositAmount = 0;
    static int withdrawAmount;

    public void createAccount(){
        System.out.println("Enter your name :");
        String name = scanner.nextLine();

        System.out.println("Enter your email :");
        String email = scanner.nextLine();

        System.out.println("Enter address :");
        String address = scanner.nextLine();

        System.out.println("Your account number is :" + account);
        System.out.println("Hello " + name + " your account created successfully...");
        System.out.println("Account Details : ");
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Address :" + address);
        System.out.println("--------------------------------------------------------");
    }

    public void accountOperation(){
            System.out.println("Enter account number :");
            UUID uuid = UUID.fromString(scanner.next());
            if (account.equals(uuid)){
                System.out.println("Enter amount to deposit :");
                depositAmount = scanner.nextInt();
                System.out.println("Your balance is :" +depositAmount);
            }else {
                System.out.println("Account number is incorrect...");
            }
    }
    public void withdraw(){
        System.out.println("Enter account number :");
        UUID uuid = UUID.fromString(scanner.next());
        if (account.equals(uuid)){
            System.out.println("Enter amount to withdraw :");
             withdrawAmount = scanner.nextInt();
            if (withdrawAmount > depositAmount){
                System.out.println("Sorry insufficient balance...");
            }else {
                System.out.println("Your amount withdraw successfully :" +withdrawAmount);
                System.out.println("Your available balance : " + (depositAmount - withdrawAmount));
            }
        }else {
            System.out.println("Account number is incorrect...");
        }

    }


}
public class BankingApp {

    public static void main(String[] args){
            Customer customer = new Customer();
//            customer.accountOperation();
//            customer.createAccount();
//            customer.accountOperation();
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your choice......");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Balance");
                System.out.println("3. Withdraw Balance");
                Integer choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        customer.createAccount();
                        break;
                    case 2:
                        customer.accountOperation();
                        break;
                    case 3:
                        customer.withdraw();
                    default:
                        System.out.println("Thank you visit again....");
                }
            }

    }
}
