package Interfaces.Contract.application;

import Interfaces.Contract.model.entities.Contract;
import Interfaces.Contract.model.entities.Installment;
import Interfaces.Contract.model.services.ContractService;
import Interfaces.Contract.model.services.OnlinePaymentService;
import Interfaces.Contract.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter contract data:");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Date (dd/MM/yyyy): ");
            sc.nextLine();
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

            System.out.print("Contract value: ");
            double totalValue = sc.nextDouble();

            System.out.print("Number of installments: ");
            int months = sc.nextInt();

            Contract contract = new Contract(number, date, totalValue);

            new ContractService(new PaypalService()).processContract(contract, months);

            System.out.println();
            System.out.println("Installments:");
            for (Installment i : contract.getInstallments()) {
                System.out.println(i);
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
