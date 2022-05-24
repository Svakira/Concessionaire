package model;

import java.time.LocalDate;

public class Motorcylcle extends Vehicle implements PriceCalculation{
    private double gasolineCapacity;
    private MotorCycleType motorcycleType;
    public Motorcylcle(boolean newUsed, double basePrice, double sellPrice, String mark, int model, int cylinder,
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
  
    public double calculatePrice(double basePrice, LocalDate currentDate){
        boolean expired=super.docExpired(currentDate);
        double price=getBasePrice();
        boolean newUsed=true;
        
        if(getDocuments().isEmpty()|| expired==true){
             price+=500000;
        }
        double aux=price;
        if(newUsed==false){
             aux*=0.02;
             price-=aux;
        }
        aux=price*0.04;
        price+=aux;
     return price;
 
    }
    

    @Override
    public String toString() {
        return super.toString()+"Motorcylcle [gasolineCapacity=" + gasolineCapacity + ", motorcycleType=" + motorcycleType + "]";
    }
   
    
   
}

 