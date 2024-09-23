import java.math.*;
import java.util.Scanner;

public class Trojuholnik {
    
    private float stranaA;
    private float stranaB;
    private float stranaC;

    public Trojuholnik(float stranaA, float stranaB, float stranaC) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.stranaC = stranaC;
    }

    public Trojuholnik(float stranaA){
        this(stranaA,stranaA,stranaA);
    }

    public Trojuholnik(){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj stranu A: ");
        stranaA = input.nextFloat();
        System.out.print("Zadaj stranu B: ");
        stranaB = input.nextFloat();
        System.out.print("Zadaj stranu C: ");
        stranaC = input.nextFloat();
    }


    public float getStranaA(){
        return stranaA;
    }

    public float getStranaB(){
        return stranaB;
    }

    public float getStranaC(){
        return stranaC;
    }

    public void setStranaA(float stranaA){
        this.stranaA = stranaA;
    }
    
    public void setStranaB(float stranaB){
        this.stranaB = stranaB;
    }

    public void setStranaC(float setStranaC){
        this.stranaC = stranaC;
    }

    public String toString(){
        return "a = " + this.getStranaA() +
                "\nb = " + this.getStranaB() +
                "\nc = " + this.getStranaC() +
                "\nobvod = " + obvod() + 
                "\nobsah = " + obsah() +
                "\n" + 
                super.toString();
    }

    public void info(){
        System.out.println("Trojuholnik: ");
        System.out.println(toString());
        System.out.println("//////////////////////////////");
    }
    
    public float obvod(){
        return (stranaA + stranaB + stranaC);
    }

    public double obsah(){
        float s  = (obvod()/2);
        return (Math.sqrt(s*(s-stranaA)*(s-stranaB)*(s-stranaC)));
    }

    public float kontrola(){
        return = Math.max(stranaA, stranaB, stranaC);
    }

}
