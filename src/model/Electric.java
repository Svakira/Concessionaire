package model;
public class Electric extends Car {
    private TypeCharger typeCharger;
    private double bateryDuration;
    public Electric(boolean newUsed, double basePrice, double sellPrice, String mark, String model, int cylinder,
            double kilometers, int placa, int doorNum, int polarized, int typeCharger, double bateryDuration,
            double bateryConsume, double consume) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, kilometers, placa, doorNum, polarized);
        switch(typeCharger){
            case 1:this.typeCharger=TypeCharger.NORMAL;
            break;
            case 2: this.typeCharger=TypeCharger.FASTER;
            break;
        }
        this.bateryDuration = bateryDuration;
    }

    public double getBateryDuration() {
        return bateryDuration;
    }
    public void setBateryDuration(double bateryDuration) {
        this.bateryDuration = bateryDuration;
    }

   
}
