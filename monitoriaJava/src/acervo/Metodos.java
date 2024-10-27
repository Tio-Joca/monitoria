package acervo;

import java.util.Scanner;

public class Metodos {
    public static int somar (int x, int y)  {
        return x + y;
    }
    public static int subtrair (int x, int y)   {
        return x - y;
    }
    public static int multiplicar (int x, int y)    {
        return x * y;
    }
    public static int dividir (int x, int y)    {
        return x / y;
    }
    public static double somar (double x, double y)  {
        return x + y;
    }
    public static double subtrair (double x, double y)   {
        return x - y;
    }
    public static double multiplicar (double x, double y)    {
        return x * y;
    }
    public static double dividir (double x, double y)    {
        return x / y;
    }
    public static void mensagem ()  {
        Scanner teclado;
        String nome;

        teclado = new Scanner (System.in);

        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();

        while (nome.equals(""))  {
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
        }

        System.out.println("Ola " + nome + "!\n");
    }
    public static void mensagem (Scanner teclado)   {
        String nome;

        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();

        while (nome.equals(""))  {
            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();
        }

        System.out.println("Ola " + nome + "!\n");
    }
    public static void mensagem (String nome) {
        System.out.println("Ola " + nome + "!\n");
    }
    public static boolean palidromo (String palavra)    {
        boolean verificador;

        verificador = true;

        for (int x = 0; x < palavra.length() / 2 && verificador; x++)    {
            if (palavra.charAt(x) != palavra.charAt(palavra.length() - (x + 1)))    {
                verificador = false;
            }
        }

        return verificador;
    }
    public static void palidromo ()    {
        boolean verificador;
        Scanner teclado;
        String palavra;
        int x;

        teclado = new Scanner (System.in);

        System.out.print("Digite a palavra: ");
        palavra = teclado.nextLine();

        while (palavra.equals(""))  {
            System.out.print("Digite a palavra: ");
            palavra = teclado.nextLine();
        }

        verificador = true;
        x = 0;

        while (x < palavra.length() / 2 && verificador) {
            if (palavra.charAt(x) != palavra.charAt(palavra.length() - (x + 1)))    {
                verificador = false;
            }   else    {
                x = x + 1;
            }
        }

        if (verificador) {
            System.out.println("A palavra " + palavra + " e um palindromo!");
        }   else    {
            System.out.println("A palavra " + palavra + " nao e um palindromo!");
        }
    }
}
