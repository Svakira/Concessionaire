package model;
public class Car extends Vehicle{
    private int doorNum;
    private int polarized;
    public Car(boolean newUsed, double basePrice, double sellPrice, String mark, String model, int cylinder,
            double kilometers, int placa, int doorNum, int polarized) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, kilometers, placa);
        this.doorNum = doorNum;
        this.polarized = polarized;
    }
    public int getDoorNum(){
        return doorNum;
    }
    public void setDoorNum(int doorNum){
        this.doorNum=doorNum;
    }
    public int getPolarized(){
        return polarized;
    }
    public void setPolarized(int polarized){
        this.polarized=polarized;
    }
   
  
}
