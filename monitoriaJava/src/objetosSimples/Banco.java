package objetosSimples;

import java.util.Scanner;

public class Banco {
    public static void main (String[] args) {
        Scanner teclado;

        teclado = new Scanner (System.in);

        operacoes(teclado);
        
        teclado.close();
    }
    public static void operacoes (Scanner teclado)  {
        Cliente [] clientes;
        int aux;

        System.out.print("Digite quantos clientes o banco tera: ");
        aux = teclado.nextInt();

        while (aux <= 0)    {
            System.out.print("Digite quantos clientes o banco tera: ");
            aux = teclado.nextInt();
        }

        clientes = new Cliente[aux];

        do  {
            System.out.print("Qual operacao voce deseja fazer?\n\n1 para cadastrar\n2 para atualizar\n3 para deletar\n4 para mostrar depositar\n5 para sacar\n6 para mostrar cliente\n7 para sair)");

            switch (aux)    {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }

        }   while (aux != 6);
        
    }
    public static boolean criarConta (Cliente novoCliente, Cliente [] clientes, int [] quantClientes)  {
        int index = pesquisar(novoCliente.getConta(), clientes, quantClientes);

        if (index >= 0)    {
            return false;
        }   else    {
            clientes[quantClientes[0]++] = novoCliente;
            return true;
        }
    }
    public static boolean depositar (int conta, double quantia, Cliente [] clientes, int [] quantClientes)  {
        boolean verificador = false;
        int index = 0;

        for (int x = 0; x < quantClientes[0] && !(verificador); x++)  {
            if (clientes[x].getConta() == conta)    {
                index = x;
                verificador = true;
            }
        }

        if (verificador)    {
            clientes[index].depositar(quantia);
        }

        return verificador;
    }
    public static double sacar (int conta, double quantia, Cliente [] clientes, int [] quantClientes)   {
        boolean verificador = false;
        int index = 0;

        for (int x = 0; x < quantClientes[0] && !(verificador); x++)  {
            if (clientes[x].getConta() == conta)    {
                index = x;
                verificador = true;
            }
        }

        return clientes[index].sacar(quantia);
    }
    public static double mostrarSaldo (int conta, Cliente [] clientes, int [] quantClientes)    {
        int index = pesquisar(conta, clientes, quantClientes);

        return clientes[index].getSaldo();
    }
    public static String mostrarCliente (int index, Cliente [] clientes, int [] quantClientes)    {
        return null;
    }
    public static int pesquisar (int conta, Cliente [] clientes, int [] quantClientes)  {
        boolean verificador = false;
        int index = 0;

        for (int x = 0; x < quantClientes[0] && !(verificador); x++)  {
            if (clientes[x].getConta() == conta)    {
                index = x;
                verificador = true;
            }
        }

        if (verificador)    {
            return index;
        }   else    {
            return -1;
        }
    }
}
