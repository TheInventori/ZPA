import java.util.Scanner;

public class Kruh {
  Scanner input = new Scanner(System.in);
  private float radius;

  public Kruh() {
    System.out.print("Zadaj polomer: ");
    radius = input.nextFloat();
  }
  public Kruh(float radius) {
    this.radius = radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

  public float getRadius() {
    return radius;
  }

  public float obsahKruhu() {
    return (float) Math.PI * (float) Math.pow(radius, 2);
  }

  public float obvodKruhu() {
    return (float) Math.PI * radius * 2;
  }

  public String toString() {
    return "Polomer = " + radius + "\nObsah = " + obsahKruhu() + "\nObvod = " + obvodKruhu() + "\n" + super.toString();
  }

  public void info() {
    System.out.println("****    Kruh    ****");
    System.out.println(toString() + "\n");
  }
}