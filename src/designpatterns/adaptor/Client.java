package designpatterns.adaptor;

public class Client {
    public static void main(String[] args) {
        var googlePayClient = new GooglePay();
        googlePayClient.sendMoney("Account1", "Account2", 1000);
        int balance = googlePayClient.checkBalance();
        System.out.println("Balance: " + balance);
    }
}
