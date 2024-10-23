package saidaEntrada;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int numInt;
        double numDouble;
        boolean verificador;
        char letra;
        String frase;

        System.out.print("Digite um numero inteiro: ");
        numInt = teclado.nextInt();

        System.out.print("Digite um numero flutuante: ");
        numDouble = teclado.nextDouble();

        System.out.print("Digite false para falso ou true para verdadeiro: ");
        verificador = teclado.nextBoolean();

        System.out.print("Digite um caractere: ");
        letra = teclado.next().charAt(0);

        teclado.nextLine();

        System.out.print("Digite uma frase: ");
        frase = teclado.nextLine();
        
        System.out.println("\n" + numInt);
        System.out.println(numDouble);
        System.out.println(verificador);
        System.out.println(letra);
        System.out.println(frase);

        teclado.close();
    }
}
