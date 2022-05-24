package model;

import java.time.LocalDate;

public class OwnerCard extends Document{

    public OwnerCard(double price, int[][] docs, String docNum, LocalDate date) {
        super(price, docs, docNum, date);
    }
    
    
}
