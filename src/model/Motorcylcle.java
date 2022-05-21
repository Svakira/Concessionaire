package model;
public class Motorcylcle extends Vehicle{
    private double gasolineCapacity;
    private MotorCycleType motorcycleType;
    public Motorcylcle(boolean newUsed, double basePrice, double sellPrice, String mark, String model, int cylinder,
            double kilometers, String typeCar, int placa, double gasolineCapacity, int motorcycleType, double damageCover, double gasoCapa, int typeGasoline, double gas) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, kilometers, placa);
        this.gasolineCapacity = gasolineCapacity;
        switch(motorcycleType){
            case 1:this.motorcycleType=MotorCycleType.SPORT;
            break;
            case 2: this.motorcycleType=MotorCycleType.STANDAR;
            break;
            case 3: this.motorcycleType=MotorCycleType.SCOOTER;
            break;
            case 4: this.motorcycleType=MotorCycleType.CROSS;
            break;
        }
     
    }

    public double getGasolineCapacity() {
        return gasolineCapacity;
    }
    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }
  

  
}

 