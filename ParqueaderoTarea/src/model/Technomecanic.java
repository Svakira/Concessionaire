package model;

import java.time.LocalDate;

public class Technomecanic extends Document{
    private double gas;

    public Technomecanic(double price, int[][] docs, String docNum, LocalDate date, double gas) {
        super(price, docs, docNum, date);
        this.gas = gas;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return super.toString()+"Technomecanic [gas=" + gas + "]";
    }
}
