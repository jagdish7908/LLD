package designpatterns.strategy;

public class CarStrategy implements IPathStrategy {
    @Override
    public void findPath(String from, String to) {
        System.out.println("Path from " + from + " to " + to + " using Car");
    }
}
