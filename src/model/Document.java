package model;
import java.time.LocalDate;
public abstract class Document {
    private double price;
    private int [][] docs;
    private String docNum;
    private LocalDate date;
    public Document(double price, int[][] docs, String docNum, LocalDate date) {
        this.price = price;
        this.docs = docs;
        this.docNum = docNum;
        this.date = date;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int[][] getDocs() {
        return docs;
    }
    public void setDocs(int[][] docs) {
        this.docs = docs;
    }
    public String getDocNum() {
        return docNum;
    }
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}