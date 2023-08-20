package designpatterns.observer;

public class EmailService implements IOnOrderPlacedSubscriber {
    @Override
    public void orderPlacedNotification(String event) {
        System.out.println("Order Notification in Email Service: " + event);
    }
}
