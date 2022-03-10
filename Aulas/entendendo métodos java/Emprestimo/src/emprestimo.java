public class emprestimo {
    public static void main(String[] args) {
        float valor = 50.5F;
        System.out.println("Valor emprestado = " + valor);
        avista(valor);
        parcela1(valor);
        parcela2(valor);
        parcela3(valor);
    }

    public static void avista(float valor){
        float taxa = 1;
        float emprestimo = valor * taxa;
        System.out.println("Valor do Empréstimo à vista= "+ emprestimo);
    }

    public static void parcela1(float valor){
        float taxa = 1.2f;
        float emprestimo = valor * taxa;
        System.out.println("Valor do Empréstimo 2x = "+ emprestimo);
    }

    public static void parcela2(float valor){
        float taxa = 1.5f;
        float emprestimo = valor * taxa;
        System.out.println("Valor do Empréstimo 3x = "+ emprestimo);
    }

    public static void parcela3(float valor){
        float taxa = 1.75f;
        float emprestimo = valor * taxa;
        System.out.println("Valor do Empréstimo 3x = "+ emprestimo);
    }

}
