package repeticao;

import java.util.Scanner;

public class Enquanto {
    public static void main (String[] args) {
        Scanner teclado;
        int num;
        boolean verificador;

        teclado = new Scanner (System.in);

        System.out.print("Digite um valor inteiro positivo maior que 1: ");
        num = Math.abs(teclado.nextInt());

        while (num <= 1)    {
            System.out.print("Entrada invalida.\nDigite um valor inteiro positivo maior que 1: ");
            num = Math.abs(teclado.nextInt());
        }

        verificador = false;

        for (int divisor = 2; divisor < num && !(verificador); divisor++)    {
            if (num % divisor == 0) {
                verificador = true;
            }
        }

        if (verificador)    {
            System.out.println("O numero inteiro " + num + " nao e primo");
        }   else    {
            System.out.println("O numero inteiro " + num + " e primo");
        }


        teclado.close();
    }
}
