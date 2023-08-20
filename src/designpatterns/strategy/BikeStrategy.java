package designpatterns.strategy;

public class BikeStrategy implements IPathStrategy {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Path from " + from + " to " + to + " using Bike");
    }
}
