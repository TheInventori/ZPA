import java.time.LocalDate;
import java.util.Scanner;

public class Clovek {
  private Scanner input = new Scanner(System.in);
  private LocalDate date = LocalDate.now();
  private String fname;
  private String lname;
  private int birthDay;
  private int birthMonth;
  private int birthYear;
  private float weight;
  private float height;

  public Clovek() {
    System.out.print("Zadaj meno: ");
    fname = input.nextLine();
    System.out.print("Zadaj priezvisko: ");
    lname = input.nextLine();
    do {
    System.out.print("Zadaj rok narodenia [yyyy]: ");
    birthYear = input.nextInt();
    } while (birthYear > date.getYear());
    do {
    System.out.print("Zadaj mesiac narodenia [mm]: ");
    birthMonth = input.nextInt();
    } while (birthMonth > 12);
    do {
    System.out.print("Zadaj den narodenia [dd]: ");
    birthDay = input.nextInt();
    } while(birthDay > 31 || 
            (birthMonth == 2 && birthYear % 4 == 0 && birthDay > 29) || 
            (birthMonth == 2 && birthYear % 4 != 0 && birthDay > 28) || 
            ((birthMonth == 4 || birthMonth == 6 || birthMonth == 9 || birthMonth == 11) && birthDay > 30));
    System.out.print("Zadaj vahu (kg): ");
    weight = input.nextFloat();
    System.out.print("Zadaj vysku (cm): ");
    height = input.nextFloat();
  }

  public Clovek(String fname, String lname, int birthDay, int birthMonth, int birthYear, float weight, float height) {
    this.fname = fname;
    this.lname = lname;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthYear = birthYear;
    this.weight = weight;
    this.height = height;
  }

  public String getFname() {
    return fname;
  }
  public String getLname() {
    return lname;
  }
  public int getBirthDay() {
    return birthDay;
  }
  public int getBirthMonth() {
    return birthMonth;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public float getWeight() {
    return weight;
  }
  public float getHeight() {
    return height;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }
  public void setLname(String lname) {
    this.lname = lname;
  }
  public void setBirthDay(int birthDay) {
    this.birthDay = birthDay;
  }
  public void setBirthMonth(int birthMonth) {
    this.birthMonth = birthMonth;
  }
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }
  public void setWeight(float weight) {
    this.weight = weight;
  }
  public void setHeight(float height) {
    this.height = height;
  }
  
  public int vek() {
    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();

    if (birthMonth > month || (birthMonth == month && birthYear > day)) {
      return year - birthYear - 1;
    }

    return year - birthYear;
  }

  public String toString() {
    return "Meno: " + fname + 
    "\nPriezvisko: " + lname + 
    "Datum narodenia: " + birthDay + ". " + birthMonth + ". " + birthYear + 
    "\nVek: " + vek() + 
    "\nVaha: " + weight + 
    "\nVyska: " + height;
  }

  public void info() {
    System.out.println("**** Clovek ****");
    System.out.println(toString() + "\n");
  }
}
