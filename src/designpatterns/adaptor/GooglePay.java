package designpatterns.adaptor;

public class GooglePay {

    private IBankAPIAdaptor bankAPIAdaptor;
    GooglePay() {
//        this.bankAPIAdaptor = new HDFCBankAdaptor();
        this.bankAPIAdaptor = new KotakAdaptor();
    }
    public void sendMoney(String from, String to, int amount) {
        bankAPIAdaptor.send(from, to, amount);
    }

    public int checkBalance() {
        return bankAPIAdaptor.balanceInquiry();
    }
}
