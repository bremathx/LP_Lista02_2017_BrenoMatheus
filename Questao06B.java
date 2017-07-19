import java.util.Scanner;

public class Questao06B {

    public static void main(String[] args) {
        int n;
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite um número: ");

        n = digitar.nextInt();

        if ((n%2) == 0){
            System.out.println("O valor " + n + " é Par.");
        } else {
            System.out.println("O valor " + n + " é Impar.");
        }
    }
    
}