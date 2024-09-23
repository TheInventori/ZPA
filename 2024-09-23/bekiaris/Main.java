import java.util.Scanner;

public class Main {
  
  
  public static void main(String[] args) {
    int volba;
    Scanner input = new Scanner(System.in);
    System.out.print("Zvolte jednu z možností (1 -> Obdlznik) (2 -> Trojuholnik): ");
    volba = input.nextInt();

    if (volba == 1){
      Obdlznik obd = new Obdlznik();
      obd.info();
    }

    else if (volba  == 2){
      Trojuholnik trh = new Trojuholnik();
      trh.info();
    }

    else{
      System.out.println("Nesprávná volba");
    }
    
    
  }
}
