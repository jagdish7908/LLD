package designpatterns.adaptor;

public class HDFCBankAPI {
    public void transferMoney(String from, String to, int amount) {
        System.out.println("Sending money using HDFC Bank API");
    }

    public int balance() {
        System.out.println("Checking balance using HDFC Bank API");
        return 200;
    }
}
