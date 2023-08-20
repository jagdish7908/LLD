package designpatterns.observer;

public interface IOnOrderPlacedPublisher {
    void subscribe(IOnOrderPlacedSubscriber subscriber);
    void unsubscribe(IOnOrderPlacedSubscriber subscriber);
    void placeOrder(String item);
}
