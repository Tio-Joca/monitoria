package objetosSimples;

import java.util.Scanner;

public class Banco {
    public static void main (String[] args) {
        Scanner teclado;
        Cliente clientes [];

        teclado = new Scanner (System.in);
        
        teclado.close();
    }
    public static void operacoes (Scanner teclado)  {

    }
    public static boolean criarConta (Cliente novoCliente, Cliente [] clientes, int [] quantClientes)  {
        boolean verificador = false;
        int count = 0;

        while (count < quantClientes[0] && !(verificador)) {
            if (clientes[count].getConta() == novoCliente.getConta())   {
                verificador = true;
            }   else    {
                count = count + 1;
            }
        }

        if (verificador)    {
            return false;
        }   else    {
            if (quantClientes[0] == clientes.length)   {
                Cliente aux [] = new Cliente [clientes.length * 2];
                for (int x = 0; x < clientes.length; x++)   {
                    aux[x] = clientes[x];
                }
                clientes = aux;
            }
            
            clientes[quantClientes[0]++] = novoCliente;

            return true;
        }
    }
    public void depositar (int conta, double quantia)  {

    }
}
