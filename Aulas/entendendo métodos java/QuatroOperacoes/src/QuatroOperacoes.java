import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = leitor.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = leitor.nextInt();

        int adicao = QuatroOperacoes.soma(valor1, valor2);
        int subtracao = QuatroOperacoes.subtrai(valor1,  valor2);
        double divisao = QuatroOperacoes.divide(valor1, valor2);
        int multiplicacao = QuatroOperacoes.multiplica(valor1, valor2);

        System.out.println("A adição de " + valor1 + " + " + valor2 + " é: " + adicao);
        System.out.println("A subtração de " + valor1 + " + "  + valor2 + " é: " + subtracao);
        System.out.println("A divisão de " + valor1 + " + "  + valor2 + " é: " + divisao);
        System.out.println("A multilicação de " + valor1 + " + "  + valor2 + " é: " + multiplicacao);

    }
    public static int soma(int valor1, int valor2){
        int total = valor1 + valor2;
        return total;
    }

    public static int subtrai(int valor1, int valor2){
        int total = valor1 - valor2;
        return total;
    }

    public static double divide(double valor1, double valor2){
        double totalDiv = valor1 / valor2;
        System.out.println(totalDiv);
        return totalDiv;
    }

    public static int multiplica(int valor1, int valor2){
        int total = valor1 * valor2;
        return total;
    }


}
