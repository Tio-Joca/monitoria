package modular;

import java.util.Scanner;
import acervo.Metodos;

public class Principal {
    public static void main (String[] args) {
        System.out.println(Metodos.somar(21, 2));
        System.out.println(Metodos.subtrair(77, 30));
        System.out.println(Metodos.multiplicar(1024, 1024));
        System.out.println(Metodos.dividir(55, 11) + "\n");

        System.out.println(Metodos.somar(1.0, 2.14));
        System.out.println(Metodos.subtrair(7.56, 0.56));
        System.out.println(Metodos.multiplicar(12.2, 1.1));
        System.out.println(Metodos.dividir(0.0, 3.14) + "\n");

        Scanner teclado = new Scanner (System.in);

        Metodos.mensagem();
        Metodos.mensagem(teclado);
        Metodos.mensagem("Gabriela");

        System.out.println(Metodos.palidromo("palavra") + "\n");
        Metodos.palidromo();

        teclado.close();
    }
}
