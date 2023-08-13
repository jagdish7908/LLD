package designpatterns.adaptor;

public class KotakAdaptor implements IBankAPIAdaptor {
    private KotakAPI kotakAPI;

    KotakAdaptor() {
        this.kotakAPI = new KotakAPI();
    }
    @Override
    public void send(String from, String to, int amount) {
        this.kotakAPI.send(from, to, amount);
    }

    @Override
    public int balanceInquiry() {
        return this.kotakAPI.viewBalance();
    }
}
