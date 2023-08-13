package designpatterns.factory;

public class Flutter {
    private String theme;
    private OperatingSystem os;

    Flutter(OperatingSystem os) {
        this.os = os;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return this.theme;
    }

    public IFlutterFactory getFlutterFactory() {
        if(this.os == OperatingSystem.IOS) {
            return new IOSFactory();
        } else if (this.os == OperatingSystem.ANDROID) {
            return new AndroidFactory();
        }
        return null;
    }
}
