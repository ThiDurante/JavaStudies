import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        char w;
        x = sc.next();
        w = sc.next().charAt(1);
        y = sc.nextInt();
        z = sc.nextDouble();
        // this way you can get all info on the same line separeted by spaces
        System.out.println("Voce digitou: ");
        System.out.println(x);
        System.out.println(w);
        System.out.println(y);
        System.out.println(z);
        // separated by enters
        // System.out.println("Voce digitou: " + x);
        // System.out.println("Voce digitou: " + w);
        // System.out.println("Voce digitou: " + y);
        // System.out.println("Voce digitou: " + z);

        // sc.nextLine() to read a text up untill line break
        // if theres any other than nextLine() before another nextLine()
        // there will be an empty string after the user presses enter
        // so you will need an extra nextLine() to absorb the extra line

        sc.close();
    }
}
