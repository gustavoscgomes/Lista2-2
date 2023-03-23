public class Aluno {
    private double n1, n2, n3, soma;

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }
    public double calcularMedia() {
        double soma = this.n1 + this.n2 + this.n3;
        return soma / 3;
    }
    public void exibirMedia() {
        double media = calcularMedia();
        System.out.println("A media do aluno foi: " + media);
        if (media < 40) {
            System.out.println("Você está reprovado.");

        } else if (media >= 40 && media < 70) {
            System.out.println("Você está na final.");
            
        } else if (media >= 70) {
            System.out.println("você está aprovado.");

        }
    }
}

