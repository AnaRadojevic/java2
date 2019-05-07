package computer;

public class Computer {

    private double tact;
    private double memory;
    private int hardDrive;

    public Computer(double memory, int hardDrive) {
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public Computer() {
    }

    public Computer(double tact, double memory, int hardDrive) {
        this.tact = tact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
    
    

    public double getTact() {
        return tact;
    }

    public void setTact(double tact) {
        this.tact = tact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
   
    public void info() {
        System.out.println("Memory: " + getMemory());
        System.out.println("Tact: " + getTact());
        System.out.println("Hard drive: " + getHardDrive()); 
    }
}

