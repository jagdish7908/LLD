package designpatterns.strategy;

public class Client {
    public static void main(String[] args) {
            IPathStrategy bikePathStrategy = PathFactory.getPathStrategy(Mode.BIKE);
            IPathStrategy carPathStrategy = PathFactory.getPathStrategy(Mode.CAR);
            bikePathStrategy.findPath("Mumbai", "Bangalore");
            carPathStrategy.findPath("Mumbai", "Bangalore");
    }
}
