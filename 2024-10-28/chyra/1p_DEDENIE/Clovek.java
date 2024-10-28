import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Clovek {
  private String fname;
  private String lname;
  private int day;
  private int month;
  private int year;
  private float weight;
  private float height;
  private int vek;

  public Clovek() {
    Scanner input = new Scanner(System.in);
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MM. yyyy");

    do {
      System.out.print("Zadaj meno: ");
      fname = input.nextLine();
    } while (fname.length() == 0);

    fname = fname.substring(0, 1).toUpperCase() + fname.substring(1);
    
    do {
      System.out.print("Zadaj priezvisko: ");
      lname = input.nextLine();
    } while (lname.length() == 0);

    lname = lname.substring(0, 1).toUpperCase() + lname.substring(1);

    do {
      System.out.print("Zadaj rok narodenia [yyyy]: ");
      year = input.nextInt();
    } while (year > date.getYear() || year < (date.getYear() - 100));
    do {
      System.out.print("Zadaj mesiac narodenia [mm]: ");
      month = input.nextInt();
    } while (month > 12);
    do {
      System.out.print("Zadaj den narodenia [dd]: ");
      day = input.nextInt();
    } while(day > 31 || 
            (month == 2 && year % 4 == 0 && day > 29) || 
            (month == 2 && year % 4 != 0 && day > 28) || 
            ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30));

    // do {
    //   System.out.print("Zadaj den narodenia: ");
    //   int day = input.nextInt();
    //   System.out.print("Zadaj mesiac narodenia: ");
    //   int month = input.nextInt();
    //   System.out.print("Zadaj rok narodenia: ");
    //   int year = input.nextInt();

    // } while (year > date.getYear() || year < (date.getYear() - 100) || month > 12 || 
    //         (month > 31 || (month == 2 && date.getYear() % 4 == 0 && month > 29) || 
    //         (month == 2 && date.getYear() % 4 != 0 && day > 28) || ((month == 4 || 
    //         month == 6 || month == 9 || month == 11) && day > 30)));
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

  public Clovek(String fname, String lname, int day, int month, int year, float weight, float height) {
    this.fname = fname;
    this.lname = lname;
    this.day = day;
    this.month = month;
    this.year = year;
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
    return day;
  }
  public int getBirthMonth() {
    return month;
  }
  public int getBirthYear() {
    return year;
  }
  public String getBirthDate() {
    return day + ". " + month + ". " + year;
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
  public void setBirthDay(int day) {
    this.day = day;
  }
  public void setBirthMonth(int month) {
    this.month = month;
  }
  public void setBirthYear(int year) {
    this.year = year;
  }
  public void setWeight(float weight) {
    this.weight = weight;
  }
  public void setHeight(float height) {
    this.height = height;
  }
  
  public int vek() {
    LocalDate date = LocalDate.now();

    int day1 = date.getDayOfMonth();
    int month1 = date.getMonthValue();
    int year1 = date.getYear();

    if (month > month1 || (month == month1 && day > day1)) {
      return year1 - year - 1;
    }

    return year1 - year;
  }

  public String toString() {
    return "Meno: " + fname + 
    "\nPriezvisko: " + lname + 
    "\nDatum narodenia: " + getBirthDate() + 
    "\nVek: " + vek() + 
    "\nVaha: " + weight + 
    "\nVyska: " + height;
  }

  public void info() {
    System.out.println("**** Clovek ****");
    System.out.println(toString() + "\n");
  }
}
