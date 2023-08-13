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
        return FlutterFactoryBuilder.CreateFlutterFactory(this.os);
    }
}
