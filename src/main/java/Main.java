import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("digite seu nome: ");
    String nome = sc.next();

    System.out.println("digite seu sobrenome: ");
    String sobrenome = sc.next();

    System.out.println("digite sua idade: ");
    int idade = sc.nextInt();

    System.out.println("digite sua altura: ");
    double altura = sc.nextDouble();

    System.out.println("digite seu sexo: ");
    String sexo = sc.next();

    System.out.println("*****************************");
    System.out.println("formula para calcular o IMC");
    System.out.println("masculino: (72.7 * altura)-58");
    System.out.println("feminino: (62.1 * altura)-44.7");

    
    sc.close();
  }

  
}