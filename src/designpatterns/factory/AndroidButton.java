package designpatterns.factory;

public class AndroidButton extends Button {

    AndroidButton() {
        System.out.println("Created Android Button");
    }

    @Override
    public void changeSize() {
        System.out.println("Changing Android Button Size");
    }
}
