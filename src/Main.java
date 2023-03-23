import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Digite a 1º nota: ");
        a.setN1(sc.nextDouble());

        System.out.print("Digite a 2º nota: ");
        a.setN2(sc.nextDouble());

        System.out.print("Digite a 3º nota: ");
        a.setN3(sc.nextDouble());

        a.exibirMedia();





        }

}
