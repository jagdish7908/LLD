package designpatterns.factory;

public class AndroidFactory implements IFlutterFactory {
    @Override
    public Button createButton(String color, String name) {
        var button = new AndroidButton();
        button.color = color;
        button.name = name;
        return button;
    }
}
