package model;

import java.time.LocalDate;

public class Soat extends Document {
    private double damageCover;

    public Soat(double price, int[][] docs, String docNum, LocalDate date, double damageCover) {
        super(price, docs, docNum, date);
        this.setDamageCover(damageCover);
    }

    public double getDamageCover() {
        return damageCover;
    }

    public void setDamageCover(double damageCover) {
        this.damageCover = damageCover;
    }

    @Override
    public String toString() {
        return super.toString()+"Soat [damageCover=" + damageCover + "]";
    }
    
}
