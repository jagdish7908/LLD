package designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        var orderService = OrderService.getInstance();
        var emailService = new EmailService();
        var inventoryService = new InventoryService();
        orderService.subscribe(emailService);
        orderService.subscribe(inventoryService);
        orderService.placeOrder("Item1");
    }
}
