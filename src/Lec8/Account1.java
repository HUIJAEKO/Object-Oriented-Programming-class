package Lec8;

import java.util.ArrayList;
import java.util.Date;

public class Account1 extends Account{
    private String name;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account1(String name, int id, double balance){
        super(id, balance);
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        transactions.add(new Transaction('W', amount, getBalance(), "withdraw"));
    }

    @Override
    public void deposit(double amount){
        super.deposit(amount);
        transactions.add(new Transaction('D', amount, getBalance(), "deposit"));
    }

    public static class Transaction{
        private java.util.Date date;
        private char type;
        private double amount;
        private double balance;
        private String description;

        public Transaction(char type, double amount, double balance, String description){
            this.date = new Date();
            this.type = type;
            this.amount = amount;
            this.description = description;
            this.balance = balance;
        }

        public Date getDate() {
            return date;
        }

        public char getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }

        public double getBalance() {
            return balance;
        }

        public String getDescription() {
            return description;
        }

        public void setType(char type) {
            this.type = type;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

