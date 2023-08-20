package designpatterns.decorator;

public class Cone implements IIcecream {

    private IIcecream icecream;
    @Override
    public int getCost() {
        return (icecream != null ? icecream.getCost(): 0) + 10;
    }

    @Override
    public String getDescription() {
        return (icecream != null ? icecream.getDescription() + "," : "") + "Cone";
    }

    public Cone() {
    }

    public Cone(IIcecream icecream) {
        this.icecream = icecream;
    }
}
