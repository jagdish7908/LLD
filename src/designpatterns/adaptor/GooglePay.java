package designpatterns.adaptor;

public class GooglePay {

    private HDFCBankAPI hdfcBankAPI;
    GooglePay() {
        this.hdfcBankAPI = new HDFCBankAPI();
    }
    public void sendMoney(String from, String to, int amount) {
        hdfcBankAPI.transferMoney(from, to, amount);
    }

    public int checkBalance() {
        return hdfcBankAPI.balance();
    }
}
