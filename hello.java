import java.util.Locale;

public class hello {
  public static void main(String[] args) {
    int a = 10;
    double b = 50.53215;
    System.out.println(a);
    System.out.println(b);
    System.out.printf("%.2f%n", b); // delimita as casas decimais
    Locale.setDefault(Locale.GERMAN); // define a nacionalidade padrão dos outputs da aplicação
    System.out.printf("%.2f%n", b);
    System.out.println("Concatenando " + a + " e " + b);
    System.out.printf("Concatenando %d e %.2f%n", a, b); // %d = inteiro, %.2f = duas casas decimais

    System.out.println("Olá, mundo!");
  }
}