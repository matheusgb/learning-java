import java.util.Scanner;

public class scanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next(); // para número inteiro é nextInt(), o mesmo vale para os outros tipos da
                   // variáveis
    System.out.println("Você digitou: " + x);

    sc.close();
  }
}
