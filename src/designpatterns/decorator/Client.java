package designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IIcecream icecream = new VanillaScoop(new StrawberryScoop(new Cone()));
        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());
    }
}
