package designpatterns.factory;

public class FlutterFactoryBuilder {
    public static IFlutterFactory CreateFlutterFactory(OperatingSystem os) {
        if(os == OperatingSystem.IOS) {
            return new IOSFactory();
        } else if (os == OperatingSystem.ANDROID) {
            return new AndroidFactory();
        }
        return null;
    }
}
