import classes.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    System.out.println("Enter 3 measures for triangle X: ");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    System.out.println("Enter 3 measures for triangle Y: ");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.calculateArea();
    double areaY = y.calculateArea();

    System.out.printf("Triangle X has an area of: %.4f%n", +areaX);
    System.out.printf("Triangle Y has an area of: %.4f%n", +areaY);

    if (areaX > areaY) {
      System.out.println("X has a bigger area");
    } else {
      System.out.println("Y has a bigger area");
    }
    sc.close();
  }
}
