package designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        var flutter = new Flutter(OperatingSystem.IOS);
        var button = flutter.createButton("blue", "Ok");
        button.changeSize();

    }
}
