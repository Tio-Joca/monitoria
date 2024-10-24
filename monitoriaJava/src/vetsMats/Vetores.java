package vetsMats;

import java.util.Scanner;

public class Vetores {
    public static void main (String[] args) {
        // Vets com valores e tamanhos definidos previamente pelo programador
        int a [] = {1, 2, 3, 4, 5};
        double b [] = {3.41, 4.44, -5.984, -45.7841, 5.15};
        char c [] = {'A', 'b', 'c', 'd', 'E'};
        boolean d [] = {true, false, true, false, false};
        String e [] = {"teste", "ovo", "aba", "abacate", "odeio salada de fruta"};

        System.out.println("Valores dentro do vetor de inteiros a:");

        for (int f = 0; f < a.length; f++)  {
            System.out.print(a[f] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de doubles b:");

        for (int g = 0; g < b.length; g++)  {
            System.out.print(b[g] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de caracteres c:");

        for (int h = 0; h < c.length; h++)  {
            System.out.print(c[h] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de booleanos d:");

        for (int i = 0; i < d.length; i++)  {
            System.out.print(d[i] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de strings e:");

        for (int j = 0; j < e.length; j++)  {
            System.out.print(e[j] + " ");
        }

        // Vets com tamanhos e valores definidos pelo usuario

        int k [];
        double l [];
        char m [];
        boolean n [];
        String o [];

        int tam;
        Scanner teclado;

        teclado = new Scanner (System.in);

        System.out.print("\n\nDigite um valor inteiro maior que zero para definir o tamanho dos vetores: ");
        tam = teclado.nextInt();

        while (tam == 0)    {
            System.out.print("Voce digitou zero.\nDigite um valor inteiro maior que zero para definir o tamanho dos vetores: ");
            tam = teclado.nextInt();
        }

        k = new int [tam];
        l = new double [tam];
        m = new char [tam];
        n = new boolean [tam];
        o = new String [tam];

        System.out.println("\n\nValores dentro do vetor de inteiros k:");

        for (int p = 0; p < k.length; p++)  {
            System.out.print(k[p] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de doubles l:");

        for (int q = 0; q < l.length; q++)  {
            System.out.print(l[q] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de caracteres m:");

        for (int r = 0; r < m.length; r++)  {
            System.out.print(m[r] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de booleanos n:");

        for (int s = 0; s < n.length; s++)  {
            System.out.print(n[s] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de strings o:");

        for (int t = 0; t < o.length; t++)  {
            System.out.print(o[t] + " ");
        }

        System.out.println("\n");
        for (int u = 0; u < k.length; u++)  {
            System.out.print("Digite um numero inteiro: ");
            k[u] = teclado.nextInt();
        }

        for (int v = 0; v < l.length; v++)  {
            System.out.print("Digite um numero decimal: ");
            l[v] = teclado.nextDouble();
        }

        for (int w = 0; w < m.length; w++)  {
            System.out.print("Digite um caractere: ");
            m[w] = teclado.next().charAt(0);
        }

        for (int x = 0; x < n.length; x++)  {
            System.out.print("Digite false para falso ou true para verdadeiro: ");
            n[x] = teclado.nextBoolean();
        }

        teclado.nextLine();

        for (int y = 0; y < o.length; y++)  {
            System.out.print("Digite uma frase: ");
            o[y] = teclado.nextLine();
        }

        System.out.println("\n\nValores dentro do vetor de inteiros k:");

        for (int um = 0; um < k.length; um++)  {
            System.out.print(k[um] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de doubles l:");

        for (int dois = 0; dois < l.length; dois++)  {
            System.out.print(l[dois] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de caracteres m:");

        for (int tres = 0; tres < m.length; tres++)  {
            System.out.print(m[tres] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de booleanos n:");

        for (int quatro = 0; quatro < n.length; quatro++)  {
            System.out.print(n[quatro] + " ");
        }

        System.out.println("\n\nValores dentro do vetor de strings o:");

        for (int cinco = 0; cinco < o.length; cinco++)  {
            System.out.print(o[cinco] + " ");
        }

        teclado.close();
    }
}
