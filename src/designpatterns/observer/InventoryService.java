package designpatterns.observer;

public class InventoryService implements IOnOrderPlacedSubscriber {
    @Override
    public void orderPlacedNotification(String event) {
        System.out.println("Inventory  Notification in Inventory Service: " + event);
    }
}
