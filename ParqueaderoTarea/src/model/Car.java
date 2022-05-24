package model;
public class Car extends Vehicle{
    private int doorNum;
    private int polarized;
    private TypeCar typeCar;
    public Car(boolean newUsed, double basePrice, double sellPrice, String mark, int model, int cylinder,
            double kilometers, int placa, int doorNum, int polarized,int typeCar) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, kilometers, placa);
        this.doorNum = doorNum;
        this.polarized = polarized;
        switch(typeCar){
            case 1:
            this.setTypeCar(TypeCar.SEDAN);
            break;
            case 2:
            this.setTypeCar(TypeCar.PICKUP_TRUCK);
            break;
        }

    }
    public TypeCar getTypeCar() {
        return typeCar;
    }
    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
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
    @Override
    public String toString() {
        return super.toString()+"Car [doorNum=" + doorNum + ", polarized=" + polarized + "]";
    }
   
  
}
