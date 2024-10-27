package vetsMats;

import java.util.Scanner;

public class ExemplosVets {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);

        int [] a = {2, 3, 9, 10, 19};
        boolean primo;

        int [] valores;
        int [] c;
        boolean [] fibonacci;
        int count;

        System.out.println("Verificacao de numeros primos dentro de um vetor\n");

        for (int h = 0; h < a.length; h++)  {
            primo = true;

            if (a[h] > 1)   {
                for (int i = 2; i < a[h] && primo; i++)  {
                    if (a[h] % i == 0)  {
                        primo = false;
                    }
                }
            }   else    {
                primo = false;
            }

            if (primo)  {
                System.out.println("O numero inteiro " + a[h] + " e primo");
            }   else    {
                System.out.println("O numero inteiro " + a[h] + " nao e primo");
            }
        }

        System.out.println("\nTermos dentro da sequencia de fibonacci, usando um vetor\n");

        System.out.print("Informe a quantidade de termos que voce deseja verificar: ");
        valores = new int [teclado.nextInt()];
        fibonacci = new boolean [valores.length];

        count = 0;

        while (count < valores.length)  {
            System.out.print("Digite um valor inteiro para colocar no vetor: ");
            valores[count] = teclado.nextInt();
            count++;
        }

        count = 0;
        c = new int [3];

        while (count < valores.length)    {
            if (valores[count] < 0) {
                fibonacci[count] = false;
            }   else if (valores[count] >= 0 && valores[count] <= 3)    {
                fibonacci[count] = true;
            }   else    {
                c[0] = 2;
                c[1] = 3;
                c[2] = 5;

                while (c[2] < valores[count])  {
                    c[0] = c[1];
                    c[1] = c[2];
                    c[2] = c[0] + c[1];
                }

                if (valores[count] == c[2])    {
                    fibonacci[count] = true;
                }   else    {
                    fibonacci[count] = false;
                }
            }
            count = count + 1;
        }

        count = 0;

        while (count < fibonacci.length)    {
            if (fibonacci[count])   {
                System.out.println("O numero " + valores[count] + " faz parte da sequencia de fibonacci.");
            }   else    {
                System.out.println("O numero " + valores[count] + " nao faz parte da sequencia de fibonacci.");
            }
            count++;
        }

        teclado.close();
    }
}
