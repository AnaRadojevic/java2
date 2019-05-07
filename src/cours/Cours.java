
package cours;


public class Cours {
    private String name;
    private int numberOfClasess;

    public Cours(String name, int numberOfClasess) {
        this.name = name;
        this.numberOfClasess = numberOfClasess;
    }

    public Cours() {
         this.name = "name";
        this.numberOfClasess = 0;
        
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasess() {
        return numberOfClasess;
    }

    public void setNumberOfClasess(int numberOfClasess) {
        this.numberOfClasess = numberOfClasess;
    }
    
    
    
    public void info() {
        System.out.println("Name: " + getName());
        System.out.println("Number of clasess: " + getNumberOfClasess());
        
    }
    
}
