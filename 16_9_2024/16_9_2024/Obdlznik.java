import java.util.Scanner;


public class Obdlznik {
    //datove polozky
    float stranaA;
    float stranaB;
    String farba;
    
    //metody
    public Obdlznik(float stranaA, float stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;    
    }

    public Obdlznik(float stranaA) { //pretazenie konstruktora v pripade stvorca
        this(stranaA, stranaA); //-> tento zapis vie nahradit tie pod nim
        //this.stranaA = stranaA;
        //stranaB = stranaA; (stranaB je rovnaka ako stranaA pretoze ide o stvorec)
    }

    public Obdlznik(float stranaA,float stranaB, String  farba) {
        this(stranaA, stranaB);
        this.farba = farba;
    }

    public Obdlznik(float  stranaA, String farba) {
        this(stranaA, stranaA,  farba);
    }

    public Obdlznik(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zadajte stranu a: ");
        stranaA = input.nextFloat();

        System.out.println("Zadajte stranu b: ");
        stranaB = input.nextFloat();

        System.out.println("Zadajte farbu: ");
        farba = input.nextLine();
        
    }

    public void Obvod(){
        System.out.println("Obvod: "+(stranaA+stranaB)*2);
    }

    public void Obsah(){
        System.out.println("Obsah: "+stranaA*stranaB);
    }

    public static void main(String[] args) {
        
    }





}