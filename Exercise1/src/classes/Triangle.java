package classes;

public class Triangle {

  public double a;
  public double b;
  public double c;

  public double calculateArea() {
    double p = (this.a + this.b + this.c) / 2.0;
    double result = Math.sqrt(p * (p - a) * (p - b) * (p - b));
    return result;
  }
}
