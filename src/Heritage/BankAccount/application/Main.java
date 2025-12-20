package Heritage.BankAccount.application;

import Heritage.BankAccount.entities.Account;
import Heritage.BankAccount.entities.BusinessAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("=====Account Data=====");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            Account account = new Account(number, holder);

            System.out.println();
            System.out.println("Your Account:");
            System.out.println(account);

            System.out.println();
            System.out.print("Amount to deposit: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.println();
            System.out.print("Amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            System.out.println();
            System.out.println("Your Account:");
            System.out.println(account);

            System.out.println();
            System.out.println("=====Business Account Data=====");
            BusinessAccount businessAccount = new BusinessAccount(number, holder, 10000.00);

            System.out.print("Amount to loan: ");
            double loanAmount = sc.nextDouble();
            businessAccount.loan(loanAmount);

            System.out.println();
            System.out.println("Your Business Account:");
            System.out.println(businessAccount);
        }
    }
}
