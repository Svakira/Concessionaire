package model;
import java.time.LocalDate;
import java.util.ArrayList;
public class  Concessionaire {
    private ArrayList<Vehicle> arrayVehi;
    public Concessionaire(){
        arrayVehi=new ArrayList <Vehicle>();
    }
    public String addHybridCar(int vehicle, boolean newUsed, double basePrice, double sellPrice, String mark, String model,
            int cylinder, double mileage, int typeCar, int doors, int polarized,  int plate, double valueSoat,
            double damageCover, double valueTec, double gasoCapa, int typeGasoline, double gas, LocalDate dateSoat,
            LocalDate dateTechno,double bateryDuration,int  typeCharger, double consume, int [][]docs) {
                arrayVehi.add(new Hybrid(newUsed, basePrice, sellPrice, mark,  model,
                cylinder, mileage, typeCar, doors, polarized, plate, valueSoat,
                damageCover,valueTec, gasoCapa, typeGasoline, gas,bateryDuration,typeCharger,consume));
                 String mens="Registered correct";
                 addSoat(plate,valueSoat,damageCover,dateSoat,docs);
        return mens;
    }

    public String addGasolineCar(boolean newUsed, double basePrice, double sellPrice, String mark, String model,
            int cylinder, double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat,
            double damageCover, double valueTec, LocalDate dateSoat, LocalDate dateTechno, double gasoCapa,
            int typeGasoline, double gas,int[][] docs) {
                arrayVehi.add(new Gasoline( newUsed,  basePrice, sellPrice, mark, model,
                cylinder, mileage, typeCar,  doors, polarized,  plate,  valueSoat,
                damageCover, valueTec, gasoCapa,typeGasoline,gas));
                 String mens="Registered correct";
        return mens;
    }

    public String addElectricCar(boolean newUsed, double basePrice, double sellPrice, String mark, String model,
            int cylinder, double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat,
            double damageCover, double bateryDuration, int typeCharger, double consume, double valueTec,
            LocalDate dateSoat, LocalDate dateTechno, int[][] docs) {
                arrayVehi.add(new Electric(newUsed, basePrice, sellPrice, mark,  model,
                cylinder, mileage, typeCar, doors, polarized,plate, bateryDuration, typeCharger,  consume));
                 String mens="Registered correct";
        return mens;
    }
    public String addMotorcycle(int vehicle, boolean newUsed, double basePrice, double sellPrice, String mark,
            String model, int cylinder, double mileage, String typeCar, int doors, int polarized, int plate,
            double valueSoat, double damageCover, double valueTec, double gasoCapa, int typeGasoline, int typeMoto, double gas,
            LocalDate dateSoat, LocalDate dateTechno, int[][] docs) {
                arrayVehi.add(new Motorcylcle(newUsed, basePrice,  sellPrice,  mark, model,cylinder, mileage,  typeCar,  doors, polarized, plate, damageCover, gasoCapa, typeGasoline, gas));
                 String mens="Registered correct";
        return mens;
    }
    public void addSoat(int plate, double valueSoat, double damageCover, LocalDate dateSoat, int[][] docs){
            String mess="";
            for (int i=0;i<docs.length;i++){
                mess+=docs[i][0];
            }
            for (int j=1;j<docs.length;j++){
                mess+=docs[docs.length-1][j];
            }
            for(int k=0;k<arrayVehi.size();k++){
                if(arrayVehi.get(k).getPlaca()==plate){
                    arrayVehi.get(k);

                }
            }
    }

}
