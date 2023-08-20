package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements IOnOrderPlacedPublisher {
    private static IOnOrderPlacedPublisher instance = null;
    private List<IOnOrderPlacedSubscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(IOnOrderPlacedSubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(IOnOrderPlacedSubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void placeOrder(String item) {
        System.out.println("Order Placed");
        subscriberList.forEach(subscriber -> subscriber.orderPlacedNotification(item));
    }

    private OrderService() {

    }

    public static IOnOrderPlacedPublisher getInstance() {
        if(instance == null) {
            instance = new OrderService();
        }
        return instance;
    }
}
