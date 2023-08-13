package designpatterns.factory;

public class IOSFactory implements IFlutterFactory {
    @Override
    public Button createButton(String color, String name) {
        var button = new IOSButton();
        button.color = color;
        button.name = name;
        return button;
    }
}
