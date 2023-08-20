package strategy;

public class PathFactory {
    public static IPathStrategy getPathStrategy(Mode mode) {
        IPathStrategy pathStrategy;
        switch (mode) {
            case BIKE -> pathStrategy = new BikeStrategy();
            case CAR -> pathStrategy = new CarStrategy();
            default -> pathStrategy = null;
        }
        return pathStrategy;
    }
}
