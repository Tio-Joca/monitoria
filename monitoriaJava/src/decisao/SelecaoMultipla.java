package decisao;

import java.util.Scanner;

public class SelecaoMultipla {
    public static void main(String[] args) {
        Scanner teclado;
        char sexo;
        int tempoContrib, idade;

        teclado = new Scanner (System.in);

        System.out.print("Digite o seu sexo (M para masculino ou F para feminino): ");
        sexo = teclado.next().toUpperCase().charAt(0);

        switch (sexo)   {
            case 'M':
                System.out.print("Ok, agora digite a sua idade: ");
                idade = Math.abs(teclado.nextInt());
                System.out.print("Digite o seu tempo de contribuicao: ");
                tempoContrib = Math.abs(teclado.nextInt());
                if (idade >= 65 && tempoContrib >= 20)  {
                    System.out.println("Voce pode se aposentar!");
                }   else    {
                    System.out.println("Voce precisa continuar trabalhando!");
                }
                break;
            case 'F':
                System.out.print("Ok, agora digite a sua idade: ");
                idade = Math.abs(teclado.nextInt());
                System.out.print("Digite o seu tempo de contribuicao: ");
                tempoContrib = Math.abs(teclado.nextInt());
                if (idade >= 62 && tempoContrib >= 15)  {
                    System.out.println("Voce pode se aposentar!");
                }   else    {
                    System.out.println("Voce precisa continuar trabalhando!");
                }
                break;
            default:
                System.out.print("O que raios voce esta fazendo aqui?\nEsse e o caso padrao. "
                                 + "Se voce esta aqui foi porque voce digitou um caractere que nao se encaixa em algum dos cases definidos");
        }

        teclado.close();
    }
}
