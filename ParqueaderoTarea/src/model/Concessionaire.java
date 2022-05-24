package model;
import java.lang.ProcessBuilder.Redirect.Type;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
public class  Concessionaire {
    private ArrayList<Vehicle> arrayVehi;
    private ArrayList<Vehicle> arrayPosi;
    private Vehicle [][]matriz;
    public Concessionaire(){
        arrayVehi=new ArrayList <Vehicle>();
        setArrayPosi(new ArrayList <Vehicle>());
        setMatriz(new Vehicle[10][5]);
    }
    public ArrayList<Vehicle> getArrayPosi() {
        return arrayPosi;
    }
    public void setArrayPosi(ArrayList<Vehicle> arrayPosi) {
        this.arrayPosi = arrayPosi;
    }
    public Vehicle [][] getMatriz() {
        return matriz;
    }
    public void setMatriz(Vehicle [][] matriz) {
        this.matriz = matriz;
    }
    public String addHybridCar(int vehicle, boolean newUsed, double basePrice, double sellPrice, String mark, int model,
            int cylinder, double mileage,  int doors, int polarized,  int plate, double valueSoat,
            double damageCover, double valueTec, double gasoCapa, int typeGasoline, double gas, LocalDate dateSoat,
            LocalDate dateTechno,double bateryDuration,int  typeCharger, double consume, int [][]docs, double valueOwnerCard, LocalDate dateOwnerCard,int typeCar) {
                arrayVehi.add(new Hybrid(newUsed, basePrice, sellPrice, mark,  model,
                cylinder, mileage, typeCar, doors, polarized, plate, valueSoat,
                damageCover,valueTec, gasoCapa, typeGasoline, gas,bateryDuration,typeCharger,consume));
                if(model<2015){
                    arrayPosi.add(new Hybrid(newUsed, basePrice, sellPrice, mark,  model,
                    cylinder, mileage, typeCar, doors, polarized, plate, valueSoat,
                    damageCover,valueTec, gasoCapa, typeGasoline, gas,bateryDuration,typeCharger,consume));
                }
                

                 String mens="Registered correct";
                 addSoat(plate,valueSoat,damageCover,dateSoat,docs);
                 addTechno(plate,valueTec,dateTechno,docs);
                 addOwnerCard(plate,valueOwnerCard,dateOwnerCard,docs);
        return mens;
    }

    public String addGasolineCar(boolean newUsed, double basePrice, double sellPrice, String mark, int model,
            int cylinder, double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat,
            double damageCover, double valueTec, LocalDate dateSoat, LocalDate dateTechno, double gasoCapa,
            int typeGasoline, double gas,int[][] docs, double valueOwnerCard, LocalDate dateOwnerCard) {
                arrayVehi.add(new Gasoline( newUsed,  basePrice, sellPrice, mark, model,
                cylinder, mileage, typeCar,  doors, polarized,  plate, gasoCapa,typeGasoline,gas));
                if(model<2015){
                    arrayPosi.add(new Gasoline( newUsed,  basePrice, sellPrice, mark, model,
                    cylinder, mileage, typeCar,  doors, polarized,  plate, gasoCapa,typeGasoline,gas));
                }
                 String mens="Registered correct";
                 addSoat(plate,valueSoat,damageCover,dateSoat,docs);
                 addTechno(plate,valueTec,dateTechno,docs);
        return mens;
    }

    public String addElectricCar(boolean newUsed, double basePrice, double sellPrice, String mark, int model,
            int cylinder, double mileage, int typeCar, int doors, int polarized, int plate, double valueSoat,
            double damageCover, double bateryDuration, int typeCharger, double consume, double valueTec,
            LocalDate dateSoat, LocalDate dateTechno, int[][] docs, double valueOwnerCard, LocalDate dateOwnerCard) {
                arrayVehi.add(new Electric(newUsed, basePrice, sellPrice, mark,  model,
                cylinder, mileage, typeCar, doors, polarized,plate, bateryDuration, typeCharger,  consume));
                if(model<2015){
                    arrayPosi.add(new Electric(newUsed, basePrice, sellPrice, mark,  model,
                    cylinder, mileage, typeCar, doors, polarized,plate, bateryDuration, typeCharger,  consume));
                }
                 String mens="Registered correct";
                 addSoat(plate,valueSoat,damageCover,dateSoat,docs);
                 addTechno(plate,valueTec,dateTechno,docs);
        return mens;
    }
    public String addMotorcycle(int vehicle, boolean newUsed, double basePrice, double sellPrice, String mark,
            int model, int cylinder, double mileage, String typeCar, int doors, int polarized, int plate,
            double valueSoat, double damageCover, double valueTec, double gasoCapa, int typeGasoline, int typeMoto, double gas,
            LocalDate dateSoat, LocalDate dateTechno, int[][] docs, double valueOwnerCard, LocalDate dateOwnerCard) {
                arrayVehi.add(new Motorcylcle(newUsed, basePrice,  sellPrice,  mark, model,cylinder, mileage,  typeCar,  doors, polarized, plate, damageCover, gasoCapa, typeGasoline, gas));
                if(model<2015){
                    arrayPosi.add(new Motorcylcle(newUsed, basePrice,  sellPrice,  mark, model,cylinder, mileage,  typeCar,  doors, polarized, plate, damageCover, gasoCapa, typeGasoline, gas));
                }
                 String mens="Registered correct";
                 addSoat(plate,valueSoat,damageCover,dateSoat,docs);
                 addTechno(plate,valueTec,dateTechno,docs);
        return mens;
    }
    public String addSoat(int plate, double valueSoat, double damageCover, LocalDate dateSoat, int[][] docs){
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
           return mess;
    }
    public String addTechno(int plate, double valueTec, LocalDate dateTechno, int[][] docs){
        //en que tipo de date se mete la informacion, matriz?
            String mens="";
            for (int i=0;i<docs.length;i++){
                mens+=docs[0][i];
            }
            
            for (int x=1;x<docs.length;x++){
                for(int y=0;y<docs.length;y++){
                    if(y+x==docs.length-1){
                     mens+=docs[x][y];
                    }
                    
                }
            }
            for (int a=1;a<docs.length;a++){
                mens+=docs[docs.length-1][a];
            }
            return mens;
            
        }
    public String addOwnerCard(double valueOwnerCard, double valueOwnerCard2, LocalDate dateOwnerCard, int[][] docs){
        String mens="";
        for (int i=docs.length;i>=0;i--){
            for (int j=docs.length-1;j>=0;j--){
                if((i+j)%2==0){
                    mens+=docs[i][j];
                }
            }
        }

        return mens;
    }

    public Vehicle searchVehicle(int plateSell){
        Vehicle vehicle=null;
        boolean continue1 = true;
        for(int i=0;i<arrayVehi.size()&&continue1!=false;i++){
            if(arrayVehi.get(i).getPlaca()==plateSell){
                vehicle= arrayVehi.get(i);
                continue1 = false;
            }
        }

        return vehicle;

    }
    public String calculateSellPrice(int showCar, LocalDate currentDate){
            String mens=""; 
            if( arrayVehi.get(showCar-1) instanceof Gasoline){
                Gasoline obj=(Gasoline)arrayVehi.get(showCar-1);
               mens="The sell price of the vehicle is:"+obj.calculatePrice(obj.getBasePrice(),currentDate);
               obj.setSellPrice(obj.calculatePrice(obj.getBasePrice(),currentDate));
               obj.setCurrent(currentDate);
            }if(arrayVehi.get(showCar-1) instanceof Hybrid ){
                Hybrid obj=(Hybrid)arrayVehi.get(showCar-1);
                mens="The sell price of the vehicle is:"+obj.calculatePrice(obj.getBasePrice(),currentDate);
                obj.setSellPrice(obj.calculatePrice(obj.getBasePrice(),currentDate));
                obj.setCurrent(currentDate);
            } if( arrayVehi.get(showCar-1) instanceof Electric){
                Electric obj=(Electric)arrayVehi.get(showCar-1);
                mens="The sell price of the vehicle is:"+obj.calculatePrice(obj.getBasePrice(),currentDate);
                obj.setSellPrice(obj.calculatePrice(obj.getBasePrice(),currentDate));
                obj.setCurrent(currentDate);
             }if(arrayVehi.get(showCar-1) instanceof Motorcylcle ){
                Motorcylcle obj=(Motorcylcle)arrayVehi.get(showCar-1);
                 mens="The sell price of the vehicle is:"+obj.calculatePrice(obj.getBasePrice(),currentDate);
                 obj.setSellPrice(obj.calculatePrice(obj.getBasePrice(),currentDate));
                 obj.setCurrent(currentDate);
             }

        return mens;
        
    }

    public String showSellCar(){
        String carsReg="";
        for(int i=0; i<arrayVehi.size();i++ ){
            carsReg += "\n"+(i+1)+".";
            carsReg+=arrayVehi.get(i).getMark()+"/"+arrayVehi.get(i).getModel();
            if(arrayVehi.get(i) instanceof Gasoline){
                carsReg+="/Gasoline car/";
            }
            if(arrayVehi.get(i) instanceof Electric){
                carsReg+="/Electric car/";
            }
            if(arrayVehi.get(i) instanceof Hybrid){
                carsReg+="/Hybrid car/";
            }
            if(arrayVehi.get(i) instanceof Motorcylcle){
                carsReg+="/Motorcycle/";
            }
        }
        return carsReg;
    }
    public String generateReport(int answ,int answ2){
        String mens="";
                if(answ==1){
                    if(answ2==1){
                        for(int i=0;i<arrayVehi.size();i++){
                         Car objCar=(Car)arrayVehi.get(i);
                        if(objCar.getTypeCar().equals(TypeCar.SEDAN)){
                            mens+=arrayVehi.toString();
                        }else if(answ2==2){
                            for(int j=0;j<arrayVehi.size();j++){
                            Car obj=(Car)arrayVehi.get(j);
                           if(obj.getTypeCar().equals(TypeCar.PICKUP_TRUCK)){
                               mens+=arrayVehi.toString();}
                             }
                            }
                        }
                    }
                    
                }else if(answ==2){
                    if(answ2==1){
                        for(int i=0;i<arrayVehi.size();i++){
                            if(arrayVehi.get(i) instanceof Gasoline){
                                Gasoline gaso=(Gasoline)arrayVehi.get(i);
                                if(gaso.getTypeGasoline().equals(TypeGasoline.CORRIENTE)){
                                    mens+=gaso.toString();
                                }
                            }else if(arrayVehi.get(i) instanceof Hybrid){
                                Hybrid hybri=(Hybrid)arrayVehi.get(i);
                                if(hybri.getTypeGasoline().equals(TypeGasoline.CORRIENTE)){
                                    mens+=hybri.toString();
                                }
                            } 
                        }
                    }else if(answ2==2){
                        for(int i=0;i<arrayVehi.size();i++){
                            if(arrayVehi.get(i) instanceof Gasoline){
                                Gasoline gaso=(Gasoline)arrayVehi.get(i);
                                if(gaso.getTypeGasoline().equals(TypeGasoline.EXTRA)){
                                    mens+=gaso.toString();
                                }
                            }else if(arrayVehi.get(i) instanceof Hybrid){
                                Hybrid hybri=(Hybrid)arrayVehi.get(i);
                                if(hybri.getTypeGasoline().equals(TypeGasoline.EXTRA)){
                                    mens+=hybri.toString();
                                }
                            } 
                        }
                    }else if(answ==3){
                        for(int i=0;i<arrayVehi.size();i++){
                            if(arrayVehi.get(i) instanceof Gasoline){
                                Gasoline gaso=(Gasoline)arrayVehi.get(i);
                                if(gaso.getTypeGasoline().equals(TypeGasoline.DIESEL)){
                                    mens+=gaso.toString();
                                }
                            }else if(arrayVehi.get(i) instanceof Hybrid){
                                Hybrid hybri=(Hybrid)arrayVehi.get(i);
                                if(hybri.getTypeGasoline().equals(TypeGasoline.DIESEL)){
                                    mens+=hybri.toString();
                                }
                            } 
                        }
                    }
                }else if(answ==3){
                    if(answ2==1){
                        for(int i=0;i<arrayVehi.size();i++){
                            if(arrayVehi.get(i).getNewUsed()==true){
                                mens+=arrayVehi.get(i).toString();
                            }
                        }
                    }else if(answ2==2){
                        for(int i=0;i<arrayVehi.size();i++){
                            if(arrayVehi.get(i).getNewUsed()==false){
                                mens+=arrayVehi.get(i).toString();
                            }
                        }
                    }
                }
                
        return mens;

    }

    public String stateList(int plateState){
        for(int i=0;i<arrayVehi.size();i++){
            if(arrayVehi.get(i).getPlaca()==plateState){

            }
        }
        return null;

    
    }

    public int positionVehicle(int model){
        boolean flag=true;
        int colum=0;
        for (int i=0;i<arrayPosi.size() && flag==true;i++){
            Vehicle obj=arrayPosi.get(i);
            if(obj.getModel()<2015 && obj.getNewUsed()==true){    
                if(obj.getModel()==2014){
                    colum=0;

                }else if(obj.getModel()==2013){
                    colum=1;

                }else if(obj.getModel()==2012){
                    colum=2;

                }else if(obj.getModel()==2011){
                    colum=3;

                }else if(obj.getModel()<2011){
                    colum=4;
                }
            }
        }
        return colum;
    }
    

    public String mapMatrix(){
       for (int j=0;j<arrayVehi.size();j++){
           Vehicle obj=arrayVehi.get(j);
            for(int k=0;k<matriz[0].length&&!arrayPosi.contains(obj);k++){
                int columna=positionVehicle(obj.getModel());
                if(matriz[k][columna]==null ){
                    arrayPosi.add(obj);
                    matriz[k][columna]=obj;
                }
            }   
       }
        String message=showMatrix();
        return message;
    }
    
   
    public String showMatrix(){
        String message="";
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                    if(j+1<matriz[0].length){
                        if(matriz[i][j]!=null){
                            message+="|  Occupied |";
                        }else{ message+="|   Empty   |";}
                    }
                    else{
                        if(matriz[i][j]!=null){
                            message+="|  Occupied |"+" \n";
                        }else{ message+="|   Empty   |"+" \n";}
                    }
            }
        }
        return message;
    }
    public String generateOcupation(int answ, int rangeYear1, int rangeYear2){
        String mens="";
        int neww=0;
        int old=100000;
        int current=0;
        int currentOld=0;
        switch(answ){
            case 1:
            for(int i=0;i<arrayPosi.size();i++){
                if(arrayPosi.get(i).getModel()<=rangeYear2 && arrayPosi.get(i).getModel()>=rangeYear1){
                    mens+=arrayPosi.toString();
                }
            }
            break;
            case 2:
            //new
            for(int i=0;i<arrayPosi.size();i++){
                current=arrayPosi.get(i).getModel();
                currentOld=arrayPosi.get(i).getModel();
                if(current>neww){
                    neww=current;
                    mens+="The newest car is: "+arrayPosi.get(i).toString();
                    //old
                }else if(currentOld<old){
                    old=currentOld;
                    mens+=arrayPosi.get(i).toString();
                }
            }
            break;
            case 3: 
            int cars=0;
            for(int i=0;i<arrayPosi.size();i++){
                cars++;
            }
            mens="%"+(cars/50)*100;
        
            break;
        }
        return mens;}
}