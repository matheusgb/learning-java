import java.util.Scanner;

public class variosScanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    int y;
    double z;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();

    System.out.println("Dados digitados:");
    System.out.println("String: " + x);
    System.out.println("Int: " + y);
    System.out.println("Double: " + z);

    sc.close();
  }
}
