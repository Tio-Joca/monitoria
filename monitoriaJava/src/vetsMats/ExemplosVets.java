package vetsMats;

import java.util.Scanner;

public class ExemplosVets {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);

        int [] a = {2, 3, 9, 10, 19};
        int [] b;
        boolean primo;

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

        System.out.println("\nTermos dentro da sequencia de valornacci, usando um vetor\n");

        

        teclado.close();
    }
}
