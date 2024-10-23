import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Clovek {
  private String fname;
  private String lname;
  private LocalDateTime birthDate;
  private float weight;
  private float height;
  private int vek;

  public Clovek() {
    try (Scanner input = new Scanner(System.in)) {
      LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MM. yyyy");
      do {
        System.out.print("Zadaj meno: ");
        fname = input.nextLine();
      } while (fname.length() == 0);
      do {
        System.out.print("Zadaj priezvisko: ");
        lname = input.nextLine();
      } while (lname.length() == 0);
      do {

        System.out.print("Zadaj datum narodenia [DD. MM. YYYY]: ");
        birthDate = LocalDateTime.parse(input.nextLine(), formatter);
      } while (birthDate.getYear() > date.getYear() || birthDate.getYear() < (date.getYear() - 100) || birthDate.getMonthValue() > 12 || 
              (birthDate.getDayOfMonth() > 31 || (birthDate.getMonthValue() == 2 && date.getYear() % 4 == 0 && birthDate.getDayOfMonth() > 29) || 
              (birthDate.getMonthValue() == 2 && date.getYear() % 4 != 0 && birthDate.getDayOfMonth() > 28) || ((birthDate.getMonthValue() == 4 || 
              birthDate.getMonthValue() == 6 || birthDate.getMonthValue() == 9 || birthDate.getMonthValue() == 11) && birthDate.getDayOfMonth() > 30))
              || ValidateDate(birthDate, formatter));
      do {
        System.out.print("Zadaj vahu (kg): ");
        weight = input.nextFloat();
      } while (weight < 0);
      do {
        System.out.print("Zadaj vysku (cm): ");
        height = input.nextFloat();
      } while (height < 0);

      vek = vek();
    }
  }

  public Clovek(String fname, String lname, LocalDateTime birthDate, float weight, float height) {
    this.fname = fname;
    this.lname = lname;
    this.birthDate = birthDate;
    this.weight = weight;
    this.height = height;
    vek = vek();
  }

  public String getFname() {
    return fname;
  }
  public String getLname() {
    return lname;
  }
  public int getBirthDay() {
    return birthDate.getDayOfMonth();
  }
  public int getBirthMonth() {
    return birthDate.getMonthValue();
  }
  public int getBirthYear() {
    return birthDate.getYear();
  }
  public LocalDateTime getBirthDate() {
    return birthDate;
  }
  public float getWeight() {
    return weight;
  }
  public float getHeight() {
    return height;
  }
  public int getVek() {
    return vek;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }
  public void setLname(String lname) {
    this.lname = lname;
  }
  public void setBirthDate(LocalDateTime birthDate) {
    this.birthDate = birthDate;
  }
  public void setWeight(float weight) {
    this.weight = weight;
  }
  public void setHeight(float height) {
    this.height = height;
  }
  
  public int vek() {
    LocalDate date = LocalDate.now();

    int day = date.getDayOfMonth();
    int month = date.getMonthValue();
    int year = date.getYear();

    if (birthDate.getMonthValue() > month || (birthDate.getMonthValue() == month && birthDate.getDayOfMonth() > day)) {
      return year - birthDate.getYear() - 1;
    }

    return year - birthDate.getYear();
  }

  public String toString() {
    return "Meno: " + fname + 
    "\nPriezvisko: " + lname + 
    "\nDatum narodenia: " + birthDate + 
    "\nVek: " + vek() + 
    "\nVaha: " + weight + 
    "\nVyska: " + height;
  }

  public void info() {
    System.out.println("**** Clovek ****");
    System.out.println(toString() + "\n");
  }
}
