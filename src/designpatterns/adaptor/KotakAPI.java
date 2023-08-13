package designpatterns.adaptor;

public class KotakAPI {
    public void send(String from, String to, int amount) {
        System.out.println("Sending money using Kotak Bank API");
    }

    public int viewBalance() {
        System.out.println("Checking balance using Kotak Bank API");
        return 200;
    }
}
