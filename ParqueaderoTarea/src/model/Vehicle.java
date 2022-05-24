package model;
import java.time.LocalDate;
import java.util.ArrayList;

public class Vehicle{
    private boolean newUsed;
    private double basePrice;
    private double sellPrice;
    private String mark;
    private int model;
    private int cylinder;
    private double kilometers;
    private int placa;
    private LocalDate current;
    private ArrayList<Document>documents;
    public Vehicle(boolean newUsed, double basePrice, double sellPrice, String mark, int model,
            int cylinder, double kilometers, int placa) {
        this.newUsed = newUsed;
        this.basePrice = basePrice;
        this.sellPrice = sellPrice;
        this.mark = mark;
        this.model = model;
        this.cylinder = cylinder;
        this.kilometers = kilometers;
        this.placa = placa;
        current=LocalDate.now();
        documents=new ArrayList<Document>();
    }
    public boolean getNewUsed() {
        return newUsed;
    }
    public void setNewUsed(boolean newUsed) {
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
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
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
    public LocalDate getCurrent(){
        return current;
    }
    public void setCurrent(LocalDate current){
        this.current=current;
    }
    
    public void addSoat(double valueSoat, double damageCover, LocalDate dateSoat, int[][] docs, String mess){
        documents.add(new Soat(valueSoat,  docs,  mess,  dateSoat,  damageCover));
    }
    public void addTechnomecanic(double price, int[][] docs, String docNum, LocalDate date, double gas){
        documents.add(new Technomecanic(price, docs, docNum, date, gas));
    }
    public boolean docExpired(LocalDate currentDate){
        setCurrent(currentDate);
        boolean mens=false;
        for (int i=0;i<documents.size();i++){
            Document date=documents.get(i);
            if(date.getDate().isAfter(current)){
                mens=true;
            }
        }
        return mens;
    }
    public String stateDocs(){
        String mens="";
        LocalDate actual=LocalDate.now();
        for(int i=0;i<documents.size();i++){
            if(i==0){
                if(docExpired(actual)==true){
                    mens="the soat is expired"+documents.get(i).getDocNum();
                }else{
                    mens="The soat is current"+documents.get(i).getDocNum();
                }
            }else if(i==2){
                if(docExpired(actual)==true){
                    mens="the technomechanic is expired"+documents.get(i).getDocNum();
                }else{
                    mens="The technomechanic is current"+documents.get(i).getDocNum();
                }
            }
        }
        return mens;
    }
    @Override
    public String toString() {
        return "Vehicle [basePrice=" + basePrice + ", current=" + current + ", cylinder=" + cylinder + ", documents="
                + documents + ", kilometers=" + kilometers + ", mark=" + mark + ", model=" + model + ", newUsed="
                + newUsed + ", placa=" + placa + ", sellPrice=]";
    }
   
    
}
