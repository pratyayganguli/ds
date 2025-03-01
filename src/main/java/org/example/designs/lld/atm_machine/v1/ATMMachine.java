package org.example.designs.lld.atm_machine.v1;


import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;


/**
 * *
 * * @author Pratyay
 */
class ATMMachine {

    public static void main(String[] args) {
        CardDetails cardDetails = fetchCardDetails();
        Controller controller = buildController(cardDetails);
        operations(controller);
    }

    private static CardDetails fetchCardDetails() {
        final String CARD_NUMBER = "abc-xxx-123";
        System.out.print("Enter your pin: ");
        Scanner scanner = new Scanner(System.in);
        String pin = scanner.nextLine();
        CardDetails cardDetails = new CardDetails(CARD_NUMBER, pin);
        return cardDetails;
    }

    private static Controller buildController(CardDetails cardDetails) {
        BankAccount bankAccount = loadDummmyBankAccount(cardDetails);
        TransactionManager transactionManager = new TransactionManager(bankAccount);
        Controller controller = new Controller(transactionManager).authenticate(cardDetails);
        return controller;
    }

    private static void operations(Controller controller) {

        System.out.println("1. Withdrawal");
        System.out.println("2. Show Balance");
        System.out.println("3. Exit");
        System.out.print(">");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1: {
                System.out.print("Enter amount: ");
                Scanner amountScanner = new Scanner(System.in);
                int debitAmount = amountScanner.nextInt();
                controller = controller.withdrawal(debitAmount);
                break;
            }
            case 2: {
                controller.showBalance();
                operations(controller);
                break;
            }
            case 3: {
                System.exit(1);
                break;
            }
            default: {
                operations(controller);
                break;
            }
        }
    }

    private static BankAccount loadDummmyBankAccount(CardDetails cardDetails) {
        Faker faker = new Faker();
        BankAccount bankAccount = new BankAccount();
        bankAccount.setCardDetails(cardDetails);
        bankAccount.setAccountNumber(faker.number().digits(10));
        bankAccount.setBalance(10000);
        return bankAccount;
    }
}

class Controller {
    private boolean authorizedSession;
    public final TransactionManager transactionManager;

    public Controller(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
        this.authorizedSession = false;
    }

    public Controller withdrawal(int amount) {
        authCheck();
        transactionManager.debit(amount);
        this.authorizedSession = false;
        return this;
    }

    public Controller showBalance() {
        authCheck();
        transactionManager.showBalance();
        return this;
    }

    public Controller authenticate(CardDetails cardDetails) {
        // dummy logic
        if(cardDetails.getCardNumber().equals("abc-xxx-123")){
            if(cardDetails.getPin().equals("0000")) {
                this.authorizedSession = true;
                return this;
            }
        }

        throw new IllegalStateException("invalid card data!");
    }

    private void authCheck() {
        if(!authorizedSession){
            throw new IllegalStateException("card authentication failed!");
        }
    }
}


class TransactionManager {

    private BankAccount bankAccount;

    private TransactionManager() {
        // no support for no args constructor
    }

    public TransactionManager(BankAccount bankAccount) {
        if(bankAccount == null) {
            throw new IllegalStateException("unauthorized account!, null account provided");
        }
        this.bankAccount = bankAccount;
    }

    public BankAccount debit(int amount) {
        // business logic for withdrawal
        int balance = bankAccount.getBalance() - amount;
        bankAccount.setBalance(balance);
        return bankAccount;
    }

    public void showBalance() {
        // business logic for showing bank account;
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
    }
}

@Data
@NoArgsConstructor
class User {
    private String name;
    private BankAccount bankAccount;
}

@Data
@NoArgsConstructor
class BankAccount {
    private String accountNumber;
    private int balance;
    private CardDetails cardDetails;
}

@Data
@AllArgsConstructor
class CardDetails {
    private String cardNumber;
    private String pin;
}

