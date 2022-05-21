package ui;
import model.*;
import java.util.Random;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
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
            System.out.println (" (4) register motorcycle");
            System.out.println (" (4) ");
            System.out.println (" (5) To get out");
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
                    entry=true;
                break;

            }
    }
}
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
    System.out.println("Enter the sell price of the vehicle");
        double sellPrice=lect.nextDouble();
    System.out.println("Enter the mark of the vehicle");
        String mark=lect.nextLine();
        lect.nextLine();
    System.out.println("Enter the model of the vehicle ");
        String model=lect.nextLine();
    System.out.println("Enter the cylinder capacity of the vehicle");
        int cylinder=lect.nextInt();
    System.out.println("Enter the mileage of the vehicle");
        double mileage=lect.nextDouble();
        System.out.println("The car is a :(1)sedan (2)pickup truck");
            int typeCar =lect.nextInt();
        lect.nextLine();
        System.out.println("Number of doors");
            int doors=lect.nextInt();
        System.out.println("is the car polarized? (1) YES (2)NO ");
            int polarized=lect.nextInt();
    
        System.out.println("Enter the plate of the vehicle");
            int plate=lect.nextInt();
    
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
        System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
        int typeGasoline=lect.nextInt();
        System.out.println("Type the levels of gas that the car threw");
        double gas=lect.nextDouble();
        lect.nextLine();
        double gasoConsume=0;
        gasoConsume=gasoCapa*(cylinder / 150);
        LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
        LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
        message=vehi.addGasolineCar(newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat,damageCover,valueTec,dateSoat,dateTechno, gasoCapa,typeGasoline,gas,docs);
        System.out.println(message);
            }
        
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
    boolean newUsed=true;
    if(newUsedI==1){
      newUsed=false;
    }
    System.out.println("Enter the base price of the vehicle");
        double basePrice=lect.nextDouble();
    System.out.println("Enter the sell price of the vehicle");
        double sellPrice=lect.nextDouble();
    System.out.println("Enter the mark of the vehicle");
        String mark=lect.nextLine();
        lect.nextLine();
    System.out.println("Enter the model of the vehicle ");
        String model=lect.nextLine();
    System.out.println("Enter the cylinder capacity of the vehicle");
        int cylinder=lect.nextInt();
    System.out.println("Enter the mileage of the vehicle");
        double mileage=lect.nextDouble();
        System.out.println("The car is a: (1)sedan (2)pick up truck");
            int typeCar =lect.nextInt();
        lect.nextLine();
        System.out.println("Number of doors");
            int doors=lect.nextInt();
        System.out.println("is the car polarized? (1) YES (2)NO ");
            int polarized=lect.nextInt();
    
        System.out.println("Enter the plate of the vehicle");
            int plate=lect.nextInt();
    
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
        System.out.println("Enter the type of the charger (1)Fast (2)Normal");
        int typeCharger=lect.nextInt();
        lect.nextLine();    
        double consume=0;
        if (typeCharger==1){
            consume=(bateryDuration+13)*(cylinder/100);}
        else{consume=(bateryDuration+18)+(cylinder/100);}
        LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
        LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
        message=vehi.addElectricCar(newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat,damageCover,bateryDuration,typeCharger,consume,valueTec,dateSoat,dateTechno,docs);
        System.out.println(message);
    }
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
        System.out.println("Do you want to register a (1) Gasoline car (2) Electric car (3) Hybrid car");
        int answ=lect.nextInt();
        System.out.println("ENTER THE FEATURES OF THE VEHICLE");
        System.out.println("The vehicle is: \n (1)new \n (2)used?");
        int newUsedI=lect.nextInt();
        boolean newUsed=true;
        if(newUsedI==1){
          newUsed=false;
        }
        System.out.println("Enter the base price of the vehicle");
            double basePrice=lect.nextDouble();
        System.out.println("Enter the sell price of the vehicle");
            double sellPrice=lect.nextDouble();
        System.out.println("Enter the mark of the vehicle");
            String mark=lect.nextLine();
            lect.nextLine();
        System.out.println("Enter the model of the vehicle ");
            String model=lect.nextLine();
        System.out.println("Enter the cylinder capacity of the vehicle");
            int cylinder=lect.nextInt();
        System.out.println("Enter the mileage of the vehicle");
            double mileage=lect.nextDouble();
            System.out.println("The car is a (1)sedan or (2) pickup truck?");
                int typeCar =lect.nextInt();
            lect.nextLine();
            System.out.println("Number of doors");
                int doors=lect.nextInt();
            System.out.println("is the car polarized? (1) YES (2)NO ");
                int polarized=lect.nextInt();
            System.out.println("Enter the plate of the vehicle");
                int plate=lect.nextInt();
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
                System.out.println("Enter the type of the charger (1)Fast (2)Normal");
                int typeCharger=lect.nextInt();
                lect.nextLine();
                double consume=0;
                if (typeCharger==1){
                    consume=bateryDuration* (cylinder / 200);}
                else{consume=(bateryDuration + 7) * (cylinder / 200) ;}
                System.out.println("Enter the gasoline capacity");
                double gasoCapa=lect.nextDouble();
                System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
                int typeGasoline=lect.nextInt();
                System.out.println("Enter the levels of gas");
                double gas=lect.nextDouble();
                lect.nextLine();
                LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
                 LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
                message=vehi.addHybridCar(vehicle, newUsed, basePrice,  sellPrice,  mark,  model,
                cylinder,  mileage,  typeCar, doors,  polarized,  plate, valueSoat,
                 damageCover,  valueTec,  gasoCapa, typeGasoline, gas,  dateSoat,
                dateTechno, bateryDuration,  typeCharger,  consume, docs);
                System.out.println(message);
            }
           
    public static void registerMotorcycle(){
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
        System.out.println("Do you want to register a (1) Gasoline car (2) Electric car (3) Hybrid car");
        int answ=lect.nextInt();
        System.out.println("ENTER THE FEATURES OF THE VEHICLE");
        System.out.println("The vehicle is: \n (1)new \n (2)used?");
        int newUsedI=lect.nextInt();
        boolean newUsed=true;
        if(newUsedI==1){
          newUsed=false;
        }
        System.out.println("Enter the base price of the vehicle");
            double basePrice=lect.nextDouble();
        System.out.println("Enter the sell price of the vehicle");
            double sellPrice=lect.nextDouble();
        System.out.println("Enter the mark of the vehicle");
            String mark=lect.nextLine();
            lect.nextLine();
        System.out.println("Enter the model of the vehicle ");
            String model=lect.nextLine();
        System.out.println("Enter the cylinder capacity of the vehicle");
            int cylinder=lect.nextInt();
        System.out.println("Enter the mileage of the vehicle");
            double mileage=lect.nextDouble();
            System.out.println("The car is a sedan or a pickup truck?");
                String typeCar =lect.nextLine();
            lect.nextLine();
            System.out.println("Number of doors");
                int doors=lect.nextInt();
            System.out.println("is the car polarized? (1) YES (2)NO ");
                int polarized=lect.nextInt();
        
            System.out.println("Enter the plate of the vehicle");
                int plate=lect.nextInt();
        
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
        System.out.println("Enter the gasoline capacity");
        double gasoCapa=lect.nextDouble();
        System.out.println("Enter the type of gasoline (1) Extra (2) Corriente (3) Diesel");
        int typeGasoline=lect.nextInt();
        System.out.println("Type the levels of gas that the car threw");
        double gas=lect.nextDouble();
        lect.nextLine();
        LocalDate dateSoat=LocalDate.of(yearSoat,monthSoat,daySoat);
        LocalDate dateTechno=LocalDate.of(yearTech,monthThech,dayThech);
        message=vehi.addMotorcycle(vehicle,newUsed,basePrice,sellPrice,mark,model,cylinder,mileage,typeCar,doors,polarized,plate,valueSoat,damageCover,valueTec,gasoCapa,typeGasoline,typeMoto,gas,dateSoat,dateTechno,docs);
        System.out.println(message);
    }
    }
    
    
    
    