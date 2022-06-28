import java.util.Scanner;

public class quebraLinha {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    String x, y, z;

    n = sc.nextInt();
    sc.nextLine(); // limpa o buffer da quebra de linha
    x = sc.nextLine(); // next() só lê uma linha, nextLine() lê até o fim da linha
    y = sc.nextLine();
    z = sc.nextLine();

    System.out.println("Dados digitados:");
    System.out.println(n);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    sc.close();
  }
}