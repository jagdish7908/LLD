package designpatterns.decorator;

public class StrawberryScoop implements IIcecream {
    private IIcecream icecream;
    @Override
    public int getCost() {
        return icecream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + "," + "Strawberry Scoop";
    }

    public StrawberryScoop(IIcecream icecream) {
        this.icecream = icecream;
    }
}
