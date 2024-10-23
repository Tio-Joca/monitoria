package decisao;

import java.util.Scanner;
import java.lang.Math;

public class SelecaoUnica {
    public static void main(String[] args) {
        Scanner teclado;
        int num, tempoContrib, idade;
        char sexo;
        boolean verificador, idoso, estudante;

        teclado = new Scanner (System.in);

        System.out.println("Verificacao de par ou impar\n");

        System.out.print("Digite um numero inteiro: ");
        num = teclado.nextInt();

        if (num % 2 == 0)   {
            System.out.println("O numero " + num + " e par!\n");
        }   else    {
            System.out.println("O numero " + num + " e impar!\n");
        }

        System.out.println("Verificacao de par ou impar junto com verdade ou mentira\n");

        System.out.print("Digite um novo numero inteiro: ");
        num = teclado.nextInt();

        System.out.print("Digite false para falso ou true para verdadeiro: ");
        verificador = teclado.nextBoolean();

        if ((num % 2 == 0) && verificador)  {
            System.out.println("O numero inteiro " + num + " e par!\nO verificador " + verificador + " indica verdade!\n");
        }   else if ((num % 2 == 0) && !(verificador))  {
            System.out.println("O numero inteiro " + num + " e par!\nO verificador " + verificador + " indica mentira!\n");
        }   else if (!(num % 2 == 0) && verificador)    {
            System.out.println("O numero inteiro " + num + " e impar!\nO verificador " + verificador + " indica verdade!\n");
        }   else    {   //else, nesse caso o else e equivalente a utilizar o else if (!(num % 2 ==) && !(verificador))
            System.out.println("O numero inteiro " + num + " e impar!\nO verificador " + verificador + " indica mentira!\n");
        }

        System.out.println("Verificacao de desconto em cinema\n");

        System.out.print("Digite false se voce nao for idoso ou true se voce for idoso: ");
        idoso = teclado.nextBoolean();

        System.out.print("Digite false se voce nao for estudante ou true se voce for estudante: ");
        estudante = teclado.nextBoolean();

        if (idoso || estudante) {
            System.out.println("O desconto deve ser concedido!\n");
        }   else    {
            System.out.println("O desconto nao deve ser concedido!\n");
        }

        System.out.println("Verificacao de aposentadoria\n");

        System.out.print("Digite o seu sexo (M para masculino ou F para feminino): ");
        sexo = teclado.next().toUpperCase().charAt(0);

        System.out.print("Digite o seu tempo de contribuicao: ");
        tempoContrib = Math.abs(teclado.nextInt());

        System.out.print("Digite a sua idade: ");
        idade = Math.abs(teclado.nextInt());

        if ((sexo == 'M' && tempoContrib >= 20 && idade >= 65) || (sexo == 'F' && tempoContrib >= 15 && idade >= 62))   {
            System.out.println("Voce pode se aposentar!");
        }   else    {   //else, nesse caso o else e equivalente a utilizar o else if (!(sexo == 'M' && tempoContrib >= 20 && idade >= 65) || !(sexo == 'F' && tempoContrib >= 15 && idade >= 62))
            System.out.println("Voce precisa continuar trabalhando!");
        }

        teclado.close();
    }
}
