package org.example.designs.lld.atm_machine;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * * @author Pratyay
 */
class ATMMachine {
    public static void main(String[] args) {
        List<User> users = WannabeDatabase.loadUsers(2);

    }

    private static void authenticate() {

    }

}

class WannabeDatabase {
    private static final Faker faker = new Faker();

    public static List<User> loadUsers(int count) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
            User user = new User();
            user.setBankAccountData(generateAccount());
            user.setCardDetails(generateCard());
            user.setName(faker.name().fullName());
            users.add(user);
        }
        return users;
    }

    private static CardDetails generateCard() {
        CardDetails cardDetails = new CardDetails();
        cardDetails.setCardNumber(faker.business().creditCardNumber());
        cardDetails.setPin(faker.number().digits(4));
        return cardDetails;
    }

    private static BankAccount generateAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(faker.number().digits(10));
        final int fixedBalance = 1000;
        bankAccount.setBalance(fixedBalance);
        return bankAccount;
    }
}

class Controller {
    private boolean activeSession;

    public Controller() {
        this.activeSession = false;
    }

    public Controller authenticate(String cardNumber, String pin) {
        // db check
        this.activeSession = true;
        return this;
    }

    public Controller balanceEnquiry(User user) {
        authCheck();
        // db check and then maybe print the balance.
        System.out.println(user.getBankAccountData().getBalance());
        return this;
    }

    public Controller cashWithdrawal(int amount) {
        authCheck();
        // after every cash withdrawal, request the user to authenticate again.

        // business logic
        this.activeSession = false;
        return this;
    }

    private void authCheck() {
        if(activeSession == false) {
            throw new IllegalStateException("unauthorized transaction!");
        }
    }
}


@Data
@NoArgsConstructor
class User {
    private String name;
    private BankAccount bankAccountData;
    private CardDetails cardDetails;
}

@Data
@NoArgsConstructor
class BankAccount {
    private String accountNumber;
    private int balance;
}

@Data
@NoArgsConstructor
class CardDetails {
    private String cardNumber;
    private String pin;
}
