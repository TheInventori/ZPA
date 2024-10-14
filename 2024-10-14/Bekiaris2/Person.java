import java.util.Scanner;
public class Person {
    public String forname;
    public String surname;

    public int birthDay;
    public int birthMonth;
    public int birthYear;

    public float weight;
    public float height;

    Scanner sc = new Scanner(System.in);
    
    public Person(){
        //Zadavanie personalnych informacii
        //Meno
        System.out.print("Zadajte krstne meno: ");
        forname = sc.nextLine();
        System.out.print("Zadajte priezvisko: ");
        surname = sc.nextLine();
        //Datum narodenia
        System.out.print("Zadajte den narodenia: ");
        birthDay = sc.nextInt();
        System.out.print("Zadajte mesiac narodenia: ");
        birthMonth = sc.nextInt();
        System.out.print("Zadajte rok narodenia: ");
        birthYear = sc.nextInt();
        //Fyzicke vlastnosti
        System.out.print("Zadajte hmotnost: ");
        weight = sc.nextFloat();
        System.out.print("Zadajte vysku: ");
        height = sc.nextFloat();
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

    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setHeight(float height){
        this.height = height;
    }

    //getters
    public String getForname(){
        return this.forname;
    }
    public String getSurname(){
        return this.surname;
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

    public float getWeight(){
        return this.weight;
    }
}