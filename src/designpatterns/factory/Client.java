package designpatterns.factory;

public class Client {
    public static void main(String[] args) {
        var flutter = new Flutter(OperatingSystem.IOS);
        flutter.setTheme("light");
        var flutterFactory = flutter.getFlutterFactory();
        var button = flutterFactory.createButton("Blue", "Ok");
        button.changeSize();
        System.out.println("Button name: " + button.name);
        System.out.println("Button color: " + button.color);
    }
}
