package encapsulation;

public class Batery {

    private int capacity;

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity= capacity;
    }

    public Batery(int capacity){
        this.capacity=capacity;
    }

    public int duracionBateria(){
        return (capacity >3000)?15:10;
    }

}
