package designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        var computerFacade = new ComputerFacade();
        // Starting the computer
        System.out.println("Starting the computer...");
        computerFacade.start();

        System.out.println();

        // Shutting down the computer
        System.out.println("Shutting down the computer...");
        computerFacade.shutdown();
    }
}
