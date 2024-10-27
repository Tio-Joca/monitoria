package vetsMats;

import java.util.Scanner;

public class ExemplosMats {
    public static void main (String[] args) {
        String palavras [][] = {{"osso", "passo"}, {"pata", "reviver"}, {"assa", "girafa"}};

        System.out.println("Verificacao de palindromos dentro da matriz palavras");

        int count, limite;
        boolean palindromo;

        for (int i = 0; i < palavras.length; i++)   {
            for (int j = 0; j < palavras[i].length; j++)    {
                palindromo = true;
                count = 0;
                limite = palavras[i][j].length() / 2;
                while (count < limite && palindromo)  {
                    if (palavras[i][j].charAt(count) != palavras[i][j].charAt(palavras[i][j].length() - (count + 1)))    {
                        palindromo = false;
                    }   else    {
                        count = count + 1;
                    }
                }
                if (palindromo) {
                    System.out.println("\nA palavra " + palavras[i][j] + " e um palindromo!\n");
                }   else    {
                    System.out.println("\nA palavra " + palavras[i][j] + " nao e um palindromo!\n");
                }
            }
        }

        Scanner teclado;
        double investimentos [][];
        double juros [];

        teclado = new Scanner (System.in);

        int quant;
        int anos;

        System.out.println("Calculo de retorno de investimentos com base em juros compostos\n");
        
        System.out.print("Digite quantos investimentos voce possui: ");
        quant = teclado.nextInt();

        while (quant <= 0)  {
            System.out.print("Voce digitou um valor menor ou igual a zero!\nDigite quantos investimentos voce possui: ");
            quant = teclado.nextInt();
        }

        juros = new double[quant];

        for (int i = 0; i < juros.length; i++)  {
            System.out.print("Digite os juros do investimento: ");
            juros[i] = teclado.nextDouble();

            while (juros[i] == 0.0) {
                System.out.print("Valor de juros invalido!\nDigite os juros do investimento: ");
                juros[i] = teclado.nextDouble();
            }
        }

        System.out.print("Digite quantos anos os seus investimentos ficarao retidos: ");
        anos = teclado.nextInt();

        while (anos <= 0)   {
            System.out.print("Voce digitou um valor menor ou igual a zero!\nDigite quantos anos os seus investimentos ficarao retidos: ");
            anos = teclado.nextInt();
        }

        investimentos = new double[quant][anos + 1];

        for (int i = 0; i < investimentos.length; i++)  {
            System.out.print("Digite o valor de aporte: ");
            investimentos[i][0] = teclado.nextDouble();

            while (investimentos[i][0] <= 0.0)    {
                System.out.print("Valor de aporte invalido!\nDigite o valor de aporte: ");
                investimentos[i][0] = teclado.nextDouble();
            }
        }

        for (int i = 0; i < investimentos.length; i++)  {
            for (int j = 1; j < investimentos[i].length; j++)   {
                investimentos[i][j] = investimentos[i][j - 1] * (juros[i] * 0.01 + 1.0);
            }
        }

        System.out.println("\nRetorno dos investimentos\n");
        
        for (int i = 0; i < investimentos.length; i++)  {
            System.out.println("Investimento de " + investimentos[i][0] + " reais com juros de " + juros[i] + "%");
            for (int j = 1; j < investimentos[i].length; j++)   {
                System.out.println("Ano " + j + ": " + investimentos[i][j]);
            }
        }

        teclado.close();
    }
}
