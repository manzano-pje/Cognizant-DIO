/*
Author? PJEM
Date: 20/01/2022
 */
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int  a = 0;
        int  b = 0;
        int  c = 0;
        int  d = 0;
        int  e = 0;
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int valor = 0;

//continue a solução

        for (int i=1 ; i<=5 ; i++) {
            valor = leitor.nextInt();
            if (valor % 2 == 0) par ++;
            else impar ++;

            if (valor > 0 ) positivo ++;
            else if (valor < 0) negativo ++;

        }
//insira suas variaveis corretamente
        System.out.println( par + " par(es)");
        System.out.println( impar + " impar(es)");
        System.out.println( positivo + " positivo(s)");
        System.out.println( negativo + " negativo(s)");
    }

}