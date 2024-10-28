import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    public String forname;
    public String surname;

    public int birthDay;
    public int birthMonth;
    public int birthYear;
    
    public double weight;
    public double height;



    Scanner sc = new Scanner(System.in);
    LocalDate date;
    LocalDate birthDate;


    //konstruktor nefunguje
    // public Person(String forname, String surname, int  birthDay, int birthMonth, int birthYear, float weight, float height) {
    //     date = LocalDate.now();
    //     //preberanie mena zadaneho v kode
    //     this.forname = forname;
    //     this.surname = surname;
    //     //preberanie datumu narodenia v kode
    //     this.birthDay = birthDay;
    //     this.birthMonth = birthMonth;
    //     this.birthYear = birthYear;
    //     //preberanie fyzickych vlastnosti v kode
    //     this.weight = weight;
    //     this.height = height;
    //     birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
    // }
    
    public Person(){
        date = LocalDate.now();

        
        //Zadavanie personalnych informacii
        //Meno
        System.out.print("Zadajte krstne meno: ");
        forname = sc.nextLine();
        forname =  forname.substring(0,1).toUpperCase() + forname.substring(1).toLowerCase();

        System.out.print("Zadajte priezvisko: ");
        surname = sc.nextLine();
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1).toLowerCase();
        //Datum narodenia

        do {
        System.out.print("Zadajte rok narodenia: ");
        birthYear = sc.nextInt();
        } while(birthYear >= date.getYear());
        do {
        System.out.print("Zadajte mesiac narodenia: ");
        birthMonth = sc.nextInt();
        } while(birthMonth < 1 || birthMonth > 12);
        if (birthMonth == 2 && birthYear % 4 == 0){
            do { 
                System.out.print("Zadajte den narodenia: ");
                birthDay = sc.nextInt();
            } while(birthDay >= 29);
        }
        else if (birthMonth == 2 && birthYear % 4 != 0){
            do { 
                System.out.print("Zadajte den narodenia: ");
                birthDay = sc.nextInt();
            } while(birthDay >= 28);
        }
        else if (birthMonth == 4  || birthMonth == 6 || birthMonth == 9 || birthMonth == 11){
                do { 
                System.out.print("Zadajte den narodenia: ");
                birthDay = sc.nextInt();
            } while(birthDay >= 30);
        }
        else{
            do { 
                System.out.print("Zadajte den narodenia: ");
                birthDay = sc.nextInt();
            } while(birthDay >= 31);
        }
        
        //Fyzicke vlastnosti
        System.out.print("Zadajte hmotnost v kg: ");
        weight = sc.nextDouble();
        System.out.print("Zadajte vysku v cm: ");
        height = sc.nextDouble();

        birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
    }

    //setters
    public void setForname(String forname){
        this.forname = forname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }
    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }

    //getters
    public String getForname(){
        return this.forname;
    }
    public String getSurname(){
        return this.surname;
    }

    public String getName(){
        return this.forname + ' ' + this.surname;
    }

    public int getBirthDay(){
        return this.birthDay;
    }
    public int getBirthMonth(){
        return this.birthMonth;
    }
    public int getBirthYear(){
        return this.birthYear;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public int vek(){
        Period age = Period.between(birthDate,date);
        return age.getYears();
    }

    public String toString(){
        return "Name: " + this.forname + " " + this.surname +
                "\nBirthdate: " + this.birthDate +
                "\nAge: " + this.vek() +
                "\nWeight: " + this.weight + " kg" +
                "\nHeight: " + this.height + " cm";
    }

    public void info(){
        System.out.println("Person: ");
        System.out.println(toString());
        System.out.println("///////////////////////////////");
    }
}