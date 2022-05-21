package model;
public class Hybrid extends Car {
   
    private double tankCapacity;
    private double conGaso;
    private TypeCharger typeCharger;
    private TypeGasoline typeGasoline;
    private double bateryDuration;
    private double bateryConsume;
    public Hybrid(boolean newUsed, double basePrice, double sellPrice, String mark, String model, int cylinder,
    double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat, double damageCover,
    double valueTec, double gasoCapa, int typeGasoline, double gas, double bateryDuration,int typeCharger, double consume) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, mileage, plate, doors, polarized);
        this.tankCapacity = tankCapacity;
        this.conGaso = conGaso;
        switch(typeGasoline){
            case 1:this.typeGasoline=TypeGasoline.CORRIENTE;
            break;
            case 2: this.typeGasoline=TypeGasoline.EXTRA;
            break;
            case 3: this.typeGasoline=TypeGasoline.DIESEL;
            break;
        }
        switch(typeCharger){
            case 1:this.typeCharger=TypeCharger.FASTER;
            break;
            case 2: this.typeCharger=TypeCharger.NORMAL;
            break;
           
        }

        this.bateryDuration = bateryDuration;
        this.bateryConsume = bateryConsume;
    }
   
    public double getTankCapacity() {
        return tankCapacity;
    }
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public double getConGaso() {
        return conGaso;
    }
    public void setConGaso(double conGaso) {
        this.conGaso = conGaso;
    }
  
    public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }
    public void setTypeGasoline(TypeGasoline typeGasoline) {
        this.typeGasoline = typeGasoline;
    }
    public double getBateryDuration() {
        return bateryDuration;
    }
    public void setBateryDuration(double bateryDuration) {
        this.bateryDuration = bateryDuration;
    }
    public double getBateryConsume() {
        return bateryConsume;
    }
    public void setBateryConsume(double bateryConsume) {
        this.bateryConsume = bateryConsume;
    }

    
    
    
    
    

    
}
