package designpatterns.decorator;

import javax.swing.*;

public class VanillaScoop implements IIcecream {
    private IIcecream icecream;
    @Override
    public int getCost() {
        return icecream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "," + "Vanilla Scoop";
    }

    public VanillaScoop(IIcecream icecream) {
        this.icecream = icecream;
    }
}
