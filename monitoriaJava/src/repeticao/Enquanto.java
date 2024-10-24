package repeticao;

import java.util.Scanner;

public class Enquanto {
    public static void main (String[] args) {
        Scanner teclado;
        int numUm, numDois, fatorial, countUm, base, exp, potencia, antPenul, penul, valor, fibo;
        boolean verificador, afirma;

        teclado = new Scanner (System.in);

        System.out.println("Verificacao de numero primo\n");

        System.out.print("Digite um valor inteiro positivo maior que 1: ");
        numUm = Math.abs(teclado.nextInt());

        while (numUm <= 1)    {
            System.out.print("Entrada invalida.\nDigite um valor inteiro positivo maior que 1: ");
            numUm = Math.abs(teclado.nextInt());
        }

        verificador = false;

        for (int divisor = 2; divisor < numUm && !(verificador); divisor++)    {
            if (numUm % divisor == 0) {
                verificador = true;
            }
        }

        if (verificador)    {
            System.out.println("O numero inteiro " + numUm + " nao e primo\n");
        }   else    {
            System.out.println("O numero inteiro " + numUm + " e primo\n");
        }

        System.out.println("Operacao de fatorial\n");

        System.out.print("Digite um numero inteiro referente ao fatorial que voce deseja obter: ");
        numDois = teclado.nextInt();

        if (numDois == 0)  {
            fatorial = 0;
        }   else if (numDois == 1)  {
            fatorial = 1;
        }   else    {
            fatorial = 2;
            countUm = 3;
            while (countUm <= numDois)  {
                fatorial = fatorial * countUm;
                countUm++;
            }
        }

        System.out.println("O fatorial de " + numDois + " e " + fatorial + "!\n");

        System.out.println("Operacao de potencia\n");

        System.out.print("Digite o valor inteiro referente a base da potencia: ");
        base = teclado.nextInt();

        System.out.print("Digite o valor inteiro referente ao expoente da potencia ");
        exp = teclado.nextInt();

        switch (exp)    {
            case 0:
                potencia = 0;
                break;
            case 1:
                potencia = base;
                break;
            default:
                potencia = base;
                for (int countDois = 2; countDois < exp + 1; countDois++)   {
                    potencia = potencia * base;
                }
                break;
        }

        System.out.println("O potencia de base " + base + " e expoente " + exp + " e igual a " + potencia + "!\n");

        System.out.println("Termo dentro da sequencia de valornacci\n");
        
        System.out.print("Digite um valor inteiro positivo para verificar se ele dentro da sequencia de fibonacci: ");
        valor = teclado.nextInt();

        if (valor == 0 || valor == 1)  {
            afirma = true;
        }   else    {
            afirma = false;
            antPenul = 1;
            penul = 1;
            fibo = 2;
            while (!afirma && fibo <= valor)    {
                if (valor == fibo)  {
                    afirma = true;
                }   else    {
                    antPenul = penul;
                    penul = fibo;
                    fibo = antPenul + penul;
                }
            }
        }

        if (afirma) {
            System.out.println("O numero " + valor + " faz parte da sequencia de fibonacci!");
        }   else    {
            System.out.println("O numero " + valor + " nao faz parte da sequencia de fibonacci!");
        }

        teclado.close();
    }
}