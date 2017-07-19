import java.util.Scanner;

public class Questao06A {
    public static void main(String[] args){
    double n1, n2, n3, n4, m1, m2, ex;
    Scanner digitar = new Scanner(System.in);

    System.out.println("Digite o valor da nota 01: ");
    n1 = digitar.nextFloat();
    System.out.println("Digite o valor da nota 02: ");
    n2 = digitar.nextFloat();
    System.out.println("Digite o valor da nota 03: ");
    n3 = digitar.nextFloat();
    System.out.println("Digite o valor da nota 04: ");
    n4 = digitar.nextFloat();

    m1 = (n1+n2+n3+n4)/4;

    if (m1 >= 7){
        System.out.println("Aluno Aprovado: " + m1);
    } else {
        System.out.println("Nota de Exame Final: ");
        ex = digitar.nextFloat();
        m2 = (m1 + ex)/2;
        if(m2 >= 5){
            System.out.println("Aluno Aprovado em Exame " + m2);
        } else {
            System.out.println("Aluno Reprovado " + m2);
        }
    }
}
            
}