package designpatterns.facade;

// Complex Subsystems

class CPU {
    public void start() {
        System.out.println("CPU is starting...");
    }

    public void shutdown() {
        System.out.println("CPU is shutting down...");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory is loading data...");
    }

    public void unload() {
        System.out.println("Memory is unloading data...");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("Hard Drive is reading data...");
    }

    public void writeData() {
        System.out.println("Hard Drive is writing data...");
    }
}

// Facade

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
        cpu.start();
        memory.load();
        hardDrive.readData();
        System.out.println("Computer is starting up...");
    }

    public void shutdown() {
        cpu.shutdown();
        memory.unload();
        hardDrive.writeData();
        System.out.println("Computer is shutting down...");
    }
}