public class casting {

  public static void main(String[] args) {
    int a, b;
    double resultado;

    a = 5;
    b = 2;
    resultado = (double) a / b; // Se não adicionar o double, o resultado será 2.0 pois a e b são inteiros.

    System.out.println(resultado);
  }
}
