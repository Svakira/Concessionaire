package ui;
import model.*;
import java.util.Random;
import java.time.LocalDate;
import java.util.Scanner;
/** 
 *clase Main <b>
 *Main generates the menssages for the user to register and receive data or show the concessionaire info  <b>
 *@author sara cardona 
 *@date 22/05/2022
 */
public class Main {
    /**
	 *name main <b>
	 *executable method of java and allows to enter the inputs and display the outputs on the screen 
	 *inputs: answEntry
	 *output : registerGasoline(),registerElectric(),registerHybrid(),registerMotorcycle().
	 *@param args String[]
	 */
    public static  Scanner lect= new Scanner(System.in);
    public static Concessionaire vehi=new Concessionaire();
    public static void main(String[] args){
       boolean entry=false;
        int answEntry;
        while (!entry ){
            System.out.println("WELCOME TO OUR CONCESSIONAIRE");
            System.out.println (" (1) To register a gasoline car");
            System.out.println (" (2) To register a electric car");
            System.out.println (" (3) To register hybrid");
            System.out.println (" (4) To register motorcycle");
            System.out.println (" (5) To calculate the total sell price of a vehicle");
            System.out.println (" (6) Generate report");
            System.out.println (" (7) State of the documents, SOAT, technomecanic and property card of the vehicle");
            System.out.println (" (8) Generate parcking map");
            System.out.println (" (9) Generate parcking ocupation report ");
            System.out.println (" (10) To get out");
            answEntry=lect.nextInt();
            lect.nextLine();
            switch(answEntry){
                case 1:
                registerGasoline();
                break;
                case 2:
                registerElectric();
                break;
                case 3:
                registerHybrid();
                break;
                case 4:
                registerMotorcycle();
                break;
                case 5:
                carSellPrice();
                break;
                case 6:
                generateReport();
                break;
                case 7:
                stateList();
                break;
                case 8:
                generateParckingMap();
                break;
                case 9:
                generateOcupation();
                break;
                case 10:
                entry=true;
            break;

            }
    }
}
/**
	 *registerGasoline
	 *register the car that functions with gasoline
	 *@return void
	 */
public static void registerGasoline(){
    int[][] docs=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<docs.length;i++){
            for(int j=0;j<docs[0].length;j++){
                docs[i][j]=rand.nextInt(maxNum);
            }
        }
    String message=" ";
    System.out.println("ENTER THE FEATURES OF THE VEHICLE");
    boolean newUsed=true;
    System.out.println("The vehicle is: \n (1)new \n (2)used?");
    int newUsedI=lect.nextInt();
        if(newUsedI==1){
          newUsed=false;
        }
    System.out.println("Enter the base price of the vehicle");
    double basePrice=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the sell price of the vehicle");
    double sellPrice=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the mark of the vehicle");
    String mark=lect.nextLine();
    System.out.println("Enter the model of the vehicle ");
    int model=lect.nextInt();
    System.out.println("Enter the cylinder capacity of the vehicle");
    int cylinder=lect.nextInt();
    lect.nextLine();
    System.out.println("Enter the mileage of the vehicle");
    double mileage=lect.nextDouble();
    lect.nextLine();
    System.out.println("The car is a :(1)sedan (2)pickup truck");
    int typeCar =lect.nextInt();
    lect.nextLine();
    System.out.println("Number of doors");
    int doors=lect.nextInt();
    lect.nextLine();
    System.out.println("is the car polarized? (1) YES (2)NO ");
    int polarized=lect.nextInt();
    lect.nextLine();
    System.out.println("Enter the plate of the vehicle");
    int plate=lect.nextInt();
    lect.nextLine();
    System.out.println("Enter the value of the soat");
    double valueSoat=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the value of the owner card");
    double valueOwnerCard=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the expiration day/month/year of the owner card");
    int dayOwn=lect.nextInt();
    lect.nextLine();
    int monthOwn=lect.nextInt();
    lect.nextLine();
    int yearOwn=lect.nextInt();
    System.out.println("Enter the damage coverage of the soat");
    double damageCover=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the expiration day/month/year of the soat");
    int daySoat=lect.nextInt();
    lect.nextLine();
    int monthSoat=lect.nextInt();
    lect.nextLine();
    int yearSoat=lect.nextInt();
    System.out.println("Enter the value of the technomechanic");
    double valueTec=lect.nextDouble();
    lect.nextLine();
    System.out.println("Type the expiration day/month/year");
    int dayThech=lect.nextInt();
    lect.nextLine();
    int monthThech=lect.nextInt();
    lect.nextLine();
    int yearTech=lect.nextInt();
    lect.nextLine();
    System.out.println("Enter the gasoline capacity");
    double gasoCapa=lect.nextDouble();
    lect.nextLine();
    System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
    int typeGasoline=lect.nextInt();
    lect.nextLine();
    System.out.println("Type the levels of gas that the car threw");
    double gas=lect.nextDouble();
    lect.nextLine();
    double gasoConsume=0;
    gasoConsume=gasoCapa*(cylinder / 150);
    LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
    LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
    LocalDate dateOwnerCard=LocalDate.of(yearOwn,monthOwn,dayOwn);
    message=vehi.addGasolineCar(newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat,damageCover,valueTec, dateSoat,dateTechno, gasoCapa,typeGasoline,gas,docs,valueOwnerCard,dateOwnerCard);
    System.out.println(message);
            }
        

         /**
	 *registerElectric
	 *register the car that functions electric
	 *@return void
	 */   
        public static void registerElectric(){
            int[][] docs=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<docs.length;i++){
            for(int j=0;j<docs[0].length;j++){
                docs[i][j]=rand.nextInt(maxNum);
            }
        }
            String message=" ";
    System.out.println("ENTER THE FEATURES OF THE VEHICLE");
    System.out.println("The vehicle is: \n (1)new \n (2)used?");
    int newUsedI=lect.nextInt();
    lect.nextLine();
    boolean newUsed=true;
    if(newUsedI==1){
      newUsed=false;
    }
    System.out.println("Enter the base price of the vehicle");
        double basePrice=lect.nextDouble();
        lect.nextLine();
    System.out.println("Enter the sell price of the vehicle");
        double sellPrice=lect.nextDouble();
        lect.nextLine();
    System.out.println("Enter the mark of the vehicle");
        String mark=lect.nextLine();
    System.out.println("Enter the model of the vehicle ");
        int model=lect.nextInt();
    System.out.println("Enter the cylinder capacity of the vehicle");
        int cylinder=lect.nextInt();
        lect.nextLine();
    System.out.println("Enter the mileage of the vehicle");
        double mileage=lect.nextDouble();
        lect.nextLine();
        System.out.println("The car is a: (1)sedan (2)pick up truck");
            int typeCar =lect.nextInt();
        lect.nextLine();
        System.out.println("Number of doors");
            int doors=lect.nextInt();
            lect.nextLine();
        System.out.println("is the car polarized? (1) YES (2)NO ");
            int polarized=lect.nextInt();
            lect.nextLine();
        System.out.println("Enter the plate of the vehicle");
            int plate=lect.nextInt();
            lect.nextLine();
    System.out.println("Enter the value of the soat");
        double valueSoat=lect.nextDouble();
        lect.nextLine();
    System.out.println("Enter the damage coverage of the soat");
        double damageCover=lect.nextDouble();
        lect.nextLine();
    System.out.println("Enter the expiration day/month/year ");
        int daySoat=lect.nextInt();
        lect.nextLine();
        int monthSoat=lect.nextInt();
        lect.nextLine();
        int yearSoat=lect.nextInt();
        System.out.println("Enter the value of the owner card");
        double valueOwnerCard=lect.nextDouble();
        lect.nextLine();
        System.out.println("Enter the expiration day/month/year of the owner card");
        int dayOwn=lect.nextInt();
        lect.nextLine();
        int monthOwn=lect.nextInt();
        lect.nextLine();
        int yearOwn=lect.nextInt();
    System.out.println("Enter the value of the technomechanic");
        double valueTec=lect.nextDouble();
        lect.nextLine();
    System.out.println("Type the expiration day/month/year");
        int dayThech=lect.nextInt();
        lect.nextLine();
        int monthThech=lect.nextInt();
        lect.nextLine();
        int yearTech=lect.nextInt();
        lect.nextLine();
            System.out.println("Enter the batery duration");
        double bateryDuration=lect.nextDouble();
        lect.nextLine();
        System.out.println("Enter the type of the charger (1)Fast (2)Normal");
        int typeCharger=lect.nextInt();
        lect.nextLine();    
        double consume=0;
        if (typeCharger==1){
            consume=(bateryDuration+13)*(cylinder/100);}
        else{consume=(bateryDuration+18)+(cylinder/100);}
        LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
        LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
        LocalDate dateOwnerCard=LocalDate.of(yearOwn,monthOwn,dayOwn);
        message=vehi.addElectricCar(newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat, damageCover,bateryDuration,typeCharger,consume,valueTec,dateSoat,dateTechno,docs,valueOwnerCard,dateOwnerCard);
        System.out.println(message);
    }
    /**
	 *registerHybrid
	 *register the car that functions hybrid
	 *@return void
	 */
        public static void registerHybrid(){
            int[][] docs=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<docs.length;i++){
            for(int j=0;j<docs[0].length;j++){
                docs[i][j]=rand.nextInt(maxNum);
            }
        }
            String message=" ";
            System.out.println("What kind of vehicle do you want to register? \n (1)Car\n (2)Motorcycle");
        int vehicle=lect.nextInt();
        lect.nextLine();
        System.out.println("Do you want to register a (1) Gasoline car (2) Electric car (3) Hybrid car");
        int answ=lect.nextInt();
        lect.nextLine();
        System.out.println("ENTER THE FEATURES OF THE VEHICLE");
        System.out.println("The vehicle is: \n (1)new \n (2)used?");
        int newUsedI=lect.nextInt();
        lect.nextLine();
        boolean newUsed=true;
        if(newUsedI==1){
          newUsed=false;
        }
        System.out.println("Enter the base price of the vehicle");
            double basePrice=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the sell price of the vehicle");
            double sellPrice=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the mark of the vehicle");
            String mark=lect.nextLine();
        System.out.println("Enter the model of the vehicle ");
            int model=lect.nextInt();
            lect.nextLine();
        System.out.println("Enter the cylinder capacity of the vehicle");
            int cylinder=lect.nextInt();
            lect.nextLine();
        System.out.println("Enter the mileage of the vehicle");
            double mileage=lect.nextDouble();
            lect.nextLine();
            System.out.println("The car is a (1)sedan or (2) pickup truck?");
                int typeCar =lect.nextInt();
            lect.nextLine();
            System.out.println("Number of doors");
                int doors=lect.nextInt();
                lect.nextLine();
            System.out.println("is the car polarized? (1) YES (2)NO ");
                int polarized=lect.nextInt();
                lect.nextLine();
            System.out.println("Enter the plate of the vehicle");
                int plate=lect.nextInt();
                lect.nextLine();
        System.out.println("Enter the value of the soat");
            double valueSoat=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the damage coverage of the soat");
            double damageCover=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the expiration day/month/year ");
            int daySoat=lect.nextInt();
            lect.nextLine();
            int monthSoat=lect.nextInt();
            lect.nextLine();
            int yearSoat=lect.nextInt();
            lect.nextLine();
            System.out.println("Enter the value of the owner card");
            double valueOwnerCard=lect.nextDouble();
            lect.nextLine();
            System.out.println("Enter the expiration day/month/year of the owner card");
            int dayOwn=lect.nextInt();
            lect.nextLine();
            int monthOwn=lect.nextInt();
            lect.nextLine();
            int yearOwn=lect.nextInt();
        System.out.println("Enter the value of the technomechanic");
            double valueTec=lect.nextDouble();
            lect.nextLine();
        System.out.println("Type the expiration day/month/year");
            int dayThech=lect.nextInt();
            lect.nextLine();
            int monthThech=lect.nextInt();
            lect.nextLine();
            int yearTech=lect.nextInt();
            lect.nextLine();
                System.out.println("Enter the batery duration");
                double bateryDuration=lect.nextDouble();
                lect.nextLine();
                System.out.println("Enter the type of the charger (1)Fast (2)Normal");
                int typeCharger=lect.nextInt();
                lect.nextLine();
                double consume=0;
                if (typeCharger==1){
                    consume=bateryDuration* (cylinder / 200);}
                else{consume=(bateryDuration + 7) * (cylinder / 200) ;}
                System.out.println("Enter the gasoline capacity");
                double gasoCapa=lect.nextDouble();
                lect.nextLine();
                System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
                int typeGasoline=lect.nextInt();
                lect.nextLine();
                System.out.println("Enter the levels of gas");
                double gas=lect.nextDouble();
                lect.nextLine();
                LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
                 LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
                 LocalDate dateOwnerCard=LocalDate.of(yearOwn,monthOwn,dayOwn);
                message=vehi.addHybridCar(vehicle, newUsed, basePrice,  sellPrice,  mark,  model,
                cylinder,  mileage, doors,  polarized,  plate, valueSoat,
                 damageCover,  valueTec,  gasoCapa, typeGasoline, gas,  dateSoat,
                dateTechno, bateryDuration,  typeCharger,  consume, docs,valueOwnerCard,dateOwnerCard,typeCar);
                System.out.println(message);
            }
           
        /**
	 *registerMotorcycle
	 *register the motorcycle
	 *@return void
	 */
    public static void registerMotorcycle(){
        int[][] docs=new int[4][4];
        Random rand=new Random();
        int maxNum=99;
        for(int i=0;i<docs.length;i++){
            for(int j=0;j<docs[0].length;j++){
                docs[i][j]=rand.nextInt(maxNum);
            }
        }
        System.out.println("What kind of vehicle do you want to register? \n (1)Car\n (2)Motorcycle");
        int vehicle=lect.nextInt();
        lect.nextLine();
        System.out.println("Do you want to register a (1) Gasoline car (2) Electric car (3) Hybrid car");
        int answ=lect.nextInt();
        lect.nextLine();
        System.out.println("ENTER THE FEATURES OF THE VEHICLE");
        System.out.println("The vehicle is: \n (1)new \n (2)used?");
        int newUsedI=lect.nextInt();
        lect.nextLine();
        boolean newUsed=true;
        if(newUsedI==1){
          newUsed=false;
        }
        System.out.println("Enter the base price of the vehicle");
            double basePrice=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the sell price of the vehicle");
            double sellPrice=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the mark of the vehicle");
            String mark=lect.nextLine();
        System.out.println("Enter the model of the vehicle ");
            int model=lect.nextInt();
        System.out.println("Enter the cylinder capacity of the vehicle");
            int cylinder=lect.nextInt();
            lect.nextLine();
        System.out.println("Enter the mileage of the vehicle");
            double mileage=lect.nextDouble();
            System.out.println("The car is a sedan or a pickup truck?");
                String typeCar =lect.nextLine();
            lect.nextLine();
            System.out.println("Number of doors");
                int doors=lect.nextInt();
                lect.nextLine();
            System.out.println("is the car polarized? (1) YES (2)NO ");
                int polarized=lect.nextInt();
                lect.nextLine();
            System.out.println("Enter the plate of the vehicle");
                int plate=lect.nextInt();
                lect.nextLine();
        System.out.println("Enter the value of the soat");
            double valueSoat=lect.nextDouble();
            lect.nextLine();
            System.out.println("Enter the value of the owner card");
            double valueOwnerCard=lect.nextDouble();
            lect.nextLine();
            System.out.println("Enter the expiration day/month/year of the owner card");
            int dayOwn=lect.nextInt();
            lect.nextLine();
            int monthOwn=lect.nextInt();
            lect.nextLine();
            int yearOwn=lect.nextInt();
        System.out.println("Enter the damage coverage of the soat");
            double damageCover=lect.nextDouble();
            lect.nextLine();
        System.out.println("Enter the expiration day/month/year ");
            int daySoat=lect.nextInt();
            lect.nextLine();
            int monthSoat=lect.nextInt();
            lect.nextLine();
            int yearSoat=lect.nextInt();
        System.out.println("Enter the value of the technomechanic");
            double valueTec=lect.nextDouble();
            lect.nextLine();
        System.out.println("Type the expiration day/month/year");
            int dayThech=lect.nextInt();
            lect.nextLine();
            int monthThech=lect.nextInt();
            lect.nextLine();
            int yearTech=lect.nextInt();
            lect.nextLine();
        System.out.println("Enter the type of the motorcycle: (1) Standar (2) Sport (3) Scooter (4) Cross");
        int typeMoto=lect.nextInt();
        lect.nextLine();
        System.out.println("Enter the gasoline capacity");
        double gasoCapa=lect.nextDouble();
        lect.nextLine();
        System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
        int typeGasoline=lect.nextInt();
        lect.nextLine();
        System.out.println("Type the levels of gas that the car threw");
        double gas=lect.nextDouble();
        lect.nextLine();
        LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
        LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
        LocalDate dateOwnerCard=LocalDate.of(yearOwn,monthOwn,dayOwn);
        String mens="";
        mens=vehi.addMotorcycle(vehicle,newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat,damageCover,valueTec,gasoCapa,typeGasoline,typeMoto,gas,dateSoat,dateTechno,docs,valueOwnerCard,dateOwnerCard);
        System.out.println(mens);
    }
       /**
	 *calculateSellPrice
	 *calculates the sell price of a car depending the type of vehicle that the user selects
	 *@return void
	 */
    public static void carSellPrice(){
        System.out.println("Enter the plate of the vehicle");
        int plateSell=lect.nextInt();
        lect.nextLine();
        String mens="";
        System.out.println("Enter current date day/month/year");
        int dayC=lect.nextInt();
        lect.nextLine();
        int monthC=lect.nextInt();
        lect.nextLine();
        int yearC=lect.nextInt();
        lect.nextLine();
        System.out.println("Enter the vehicle");
        System.out.println(vehi.showSellCar());
        int showCar=lect.nextInt();
        lect.nextLine();
        LocalDate currentDate=LocalDate.of(yearC,monthC,dayC);
        System.out.println(vehi.calculateSellPrice(showCar,currentDate));
        }
    
        /**
	 *generateReport
	 *displays the information registered
	 *@return void
	 */
    public static void generateReport(){
        String mens="";
        System.out.println("Generate report of (1)Type vehicle (2)Type of fuel (3)New or used cars");
        int answ=lect.nextInt();
        lect.nextLine();
        int answ2=0;
        switch(answ){
            case 1:System.out.println("What kind of vehicle is: (1)Sedan (2)pickup truck");
            answ2=lect.nextInt();
            lect.nextLine();
            break;
            case 2:System.out.println("What kind of fuel does the vehicle contains (1) Extra (2)Corriente (3)Diesel");
            answ2=lect.nextInt();
            lect.nextLine();
            break;
            case 3:System.out.println("Is the vehicle (1)new (2) used");
            answ2=lect.nextInt();
            lect.nextLine();
            break;
        }
        mens=vehi.generateReport(answ, answ2);
        System.out.println(mens);

    }

       /**
	 *stateList
	 *shows the state of the documents of the vehicle, also generates a list with the numbers of the SOAT, technomechanical review and property card
	 *@return void
	 */
    public static void stateList(){
        String mens="";
        System.out.println("Enter the plate of the vehicle");
        int plateState=lect.nextInt();
        lect.nextLine();
        mens=vehi.stateList(plateState);
    }
    /**
	 *generateOcupation
	 *generate ocupation in the parking zone
	 *@return void
	 */
    public static void generateOcupation(){
        String mens="";
        System.out.println("Generate report ocupation of (1)List of vehicles given a range of years (2) Data of the oldest and recent vehicle (3)Percentage of parcking ocupation");
        int answ=lect.nextInt();
        lect.nextLine();
        if(answ==1){
            System.out.println("Enter the range of years");
            int rangeYear1=lect.nextInt();
            lect.nextLine();
            int rangeYear2=lect.nextInt();
            lect.nextLine();
            mens=vehi.generateOcupation(answ,rangeYear1,rangeYear2);
        }else {
            mens=vehi.generateOcupation(answ,0,0);
        }
        System.out.println(mens);

    }
    /**
	 *generateParkingMap
	 *show the map of the parking
	 *@return void
	 */
    public static void generateParckingMap(){
        System.out.println(vehi.mapMatrix());
    }
}
    
    
    
    
    
    