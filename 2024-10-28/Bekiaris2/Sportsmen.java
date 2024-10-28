import java.util.Scanner;

public class Sportsmen extends Person{
    public String sport;
    public double bmi;
    
    Scanner sc = new Scanner(System.in);

    public Sportsmen(String sport){
        this.sport = sport;
        bmi = Bmi.calculationBMI(super.getWeight(), super.getHeight());
    }


    public Sportsmen(){
        System.out.print("Zadaj nazov sportu: ");
        sport = sc.nextLine();
        bmi = Bmi.calculationBMI(super.getWeight(), super.getHeight());
    }

    public String toString(){
        return super.toString() +
                "\nBmi: " + bmi +
                "\nSport: " + sport;
    }


    //setters
    public void setSport(String sport){
        this.sport = sport;
    }

    public void setBmi(double bmi){
        this.bmi = bmi;
    }
    //getters
    public String getSport(){
        return sport;
    }

    public double getBmi(){
        return bmi;
    }



}
