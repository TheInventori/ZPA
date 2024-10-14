import java.time.LocalDate;
import java.util.Scanner;

public class Clovek {
  Scanner input = new Scanner(System.in);
  private String fname;
  private String lname;
  private int birthDate[];
  private float weight;
  private float height;

  public Clovek() {
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();
    System.out.print("Zadaj priezvisko: ");
    fname = input.nextLine();
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();

  }
  
  public int vek() {
    LocalDate date = LocalDate.now();
    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();

    int age = birthDate[2] - year;
    if (birthDate[1] > month) {
      age = age - 1;
    }
    if (birthDate[1] == month && birthDate[0] > day) {
      age = age - 1;
    }

    return age;
  }

  public String toString() {
    return "Meno: " + fname + 
    "\nPriezvisko: " + lname + 
    "Datum narodenia: " + birthDate[0] + ". " + birthDate[1] + ". " + birthDate[2] + 
    "\nVek: " + vek() + 
    "\nVaha: " + weight + 
    "\nVyska: " + height + 
    "\n" + super.toString();
  }

  public void info() {
    System.out.println("**** Clovek ****");
    System.out.println(toString() + "\n");
  }
}
