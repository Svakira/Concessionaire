package model;

import java.time.LocalDate;

public interface PriceCalculation{

   
	public abstract double calculatePrice(double basePrice,LocalDate currentDate);
	
	

}