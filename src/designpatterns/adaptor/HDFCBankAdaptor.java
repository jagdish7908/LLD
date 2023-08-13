package designpatterns.adaptor;

public class HDFCBankAdaptor implements IBankAPIAdaptor {
    private HDFCBankAPI hdfcBankAPI;

    HDFCBankAdaptor () {
        this.hdfcBankAPI = new HDFCBankAPI();
    }
    @Override
    public void send(String from, String to, int amount) {
        this.hdfcBankAPI.transferMoney(from, to, amount);
    }

    @Override
    public int balanceInquiry() {
        return this.hdfcBankAPI.balance();
    }
}
