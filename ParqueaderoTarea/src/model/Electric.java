package model;

import java.time.LocalDate;

public class Electric extends Car implements PriceCalculation{
    private TypeCharger typeCharger;
    private double bateryDuration;
    public Electric( boolean newUsed, double basePrice, double sellPrice, String mark, int model, int cylinder,
    double kilometers,int typeCar, int doors, int polarized, int plate, double bateryDuration,
    int typeCharger, double consume) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, kilometers, plate, doors, polarized,typeCar);
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
    public double calculatePrice(double basePrice, LocalDate currentDate){
        boolean expired=super.docExpired(currentDate);
        double price=getBasePrice();
        boolean newUsed=true;
        
        if(getDocuments().isEmpty()|| expired==true){
             price+=500000;
        }
        double aux=price;
        if(newUsed==false){
             aux*=0.1;
             price-=aux;
        }
        aux=price*0.2;
        price+=aux;
     return price;
 
    }
    
	

    
    public String toString() {
        return super.toString()+"Electric [bateryDuration=" + bateryDuration + ", typeCharger=" + typeCharger + "]";
    }

  
   
}
