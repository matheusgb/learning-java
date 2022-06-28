import java.util.Scanner;

public class scannerCharAt {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char x;
    x = sc.next().charAt(0); // pega a primeira letra do input
    System.out.println("Você digitou: " + x);

    sc.close();
  }

}
