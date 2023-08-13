package designpatterns.factory;

public class Flutter {
    private String theme;
    private OperatingSystem os;

    Flutter(OperatingSystem os) {
        this.os = os;
    }
    public Button createButton(String color, String name) {
        if(this.os == OperatingSystem.IOS) {
            var button = new IOSButton();
            button.color = color;
            button.name = name;
            return button;
        } else if (this.os == OperatingSystem.ANDROID) {
            var button = new AndroidButton();
            button.color = color;
            button.name = name;
            return button;
        }
        return null;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return this.theme;
    }
}
