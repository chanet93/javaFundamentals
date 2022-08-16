package encapsulation;

public class Phone {

    private String branch;

    private Batery batery;

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch = branch;
    }

    public int getCapacity(){
        return batery.getCapacity();
    }

    public void setCapacity(int capacity){
        batery.setCapacity(capacity);
    }

    public Phone(String branch, int capacity){
        this.branch= branch;
        this.batery= new Batery(capacity);
    }

    public int duracionBateria() {
        return batery.duracionBateria();
    }

}
