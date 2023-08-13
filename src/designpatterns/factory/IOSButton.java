package designpatterns.factory;

public class IOSButton extends Button {
    IOSButton() {
        System.out.println("Created IOS Button");
    }

    @Override
    public void changeSize() {
        System.out.println("Changing IOS Button Size");
    }
}
