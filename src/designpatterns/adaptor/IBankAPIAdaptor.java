package designpatterns.adaptor;

public interface IBankAPIAdaptor {
    void send(String from, String to, int amount);
    int balanceInquiry();
}
