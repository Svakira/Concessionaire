package model;

import java.time.LocalDate;

public class Gasoline extends Car implements PriceCalculation{

    private double tankCapacity;
    private double conGaso;
    private TypeGasoline typeGasoline;
   
    public Gasoline(boolean newUsed, double basePrice, double sellPrice, String mark, int model, int cylinder,
    double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat, int typeGasoline,
    double valueTec) {
        super(newUsed, basePrice, sellPrice, mark, model, cylinder, mileage, plate, doors, polarized,typeCar);
        this.tankCapacity = tankCapacity;
        this.conGaso = conGaso;
        switch(typeGasoline){
            case 1:this.setTypeGasoline(TypeGasoline.CORRIENTE);
            break;
            case 2: this.setTypeGasoline(TypeGasoline.EXTRA);
            break;
            case 3: this.setTypeGasoline(TypeGasoline.DIESEL);
            break;
        }
    }

   public TypeGasoline getTypeGasoline() {
        return typeGasoline;
    }

    public void setTypeGasoline(TypeGasoline typeGasoline) {
        this.typeGasoline = typeGasoline;
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
    return price;

   }

@Override
public String toString() {
    return super.toString()+"Gasoline [conGaso=" + conGaso + ", tankCapacity=" + tankCapacity + "]";
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

  

   
}
