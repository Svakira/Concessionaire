package model;
import java.time.LocalDate;
import java.util.ArrayList;
public class Vehicle {
    private boolean newUsed;
    private double basePrice;
    private double sellPrice;
    private String mark;
    private String model;
    private int cylinder;
    private double kilometers;
    private int placa;
    private ArrayList<Document>documents;
    public Vehicle(boolean newUsed, double basePrice, double sellPrice, String mark, String model,
            int cylinder, double kilometers, int placa) {
        this.newUsed = newUsed;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.mark = mark;
        this.model = model;
        this.cylinder = cylinder;
        this.kilometers = kilometers;
        this.placa = placa;
    }
    public boolean isnewUsed() {
        return newUsed;
    }
    public void setnewUsed(boolean newUsed) {
        this.newUsed = newUsed;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getcylinder() {
        return cylinder;
    }
    public void setcylinder(int cylinder) {
        this.cylinder = cylinder;
    }
    public double getKilometers() {
        return kilometers;
    }
    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public ArrayList<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }
    public void addSoat(double valueSoat, double damageCover, LocalDate dateSoat, int[][] docs, String mess){
        docs.add(new Soat())
    }
    
    
}
