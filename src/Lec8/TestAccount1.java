package Lec8;

public class TestAccount1 {
    public static void main(String[] args){
        String name = "George";
        int id = 1122;
        int balance = 1000;
        double rate = 1.65;

        Account1 account = new Account1(name, id, balance);

        account.deposit(30.0);
        account.deposit(40.0);
        account.deposit(50.0);
        account.withdraw(5.0);
        account.withdraw(4.0);
        account.withdraw(2.0);

        System.out.println("Name: " + account.getName());
        System.out.println("Annual interest rate: " + rate);
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Date                            Type    Amount     Balance");
        for(int i=0; i<account.getTransactions().size(); i++){
            System.out.format("%-20s    %c       %-10.1f %-10.1f \n", account.getTransactions().get(i).getDate(), account.getTransactions().get(i).getType()
                    ,account.getTransactions().get(i).getAmount(), account.getTransactions().get(i).getBalance());
        }
    }
}
