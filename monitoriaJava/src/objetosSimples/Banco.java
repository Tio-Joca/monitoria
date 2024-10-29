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
        int [] quantClientes = new int [1];

        int aux;

        System.out.print("Digite quantos clientes o banco tera: ");
        aux = teclado.nextInt();

        while (aux <= 0)    {
            System.out.print("Digite quantos clientes o banco tera: ");
            aux = teclado.nextInt();
        }

        clientes = new Cliente[aux];

        do  {
            System.out.print("Qual operacao voce deseja fazer?\n\n1 para cadastrar\n2 para atualizar\n3 para deletar\n4 para mostrar depositar\n5 para sacar\n6 para mostrar saldo\n7 para mostrar cliente\n8 para mostrar clientes\n9 para sair\n\nOpcao: ");
            aux = teclado.nextInt();
            switch (aux)    {
                case 1:
                    criarConta(teclado, clientes, quantClientes);
                    break;
                case 2:
                    atualizarConta(teclado, clientes, quantClientes);
                    break;
                case 3:
                    deletarConta(teclado, clientes, quantClientes);
                    break;
                case 4:
                    depositar(teclado, clientes, quantClientes);
                    break;
                case 5:
                    sacar(teclado, clientes, quantClientes);
                    break;
                case 6:
                    mostrarSaldo(teclado, clientes, quantClientes);
                    break;
                case 7:
                    mostrarCliente(teclado, clientes, quantClientes);
                    break;
                case 8:
                    mostrarClientes(clientes, quantClientes);
                    break;
                case 9:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        }   while (aux != 9);
        
    }
    public static void criarConta (Scanner teclado, Cliente [] clientes, int [] quantClientes)  {
        String nome;
        int conta;
        boolean fisica;
        double saldo;

        System.out.print("Digite o numero da nova conta: ");
        conta = teclado.nextInt();
        if (quantClientes[0] == 0 ^ quantClientes[0] > 0)  {
            System.out.print("Digite o nome do novo cliente: ");
            nome = teclado.nextLine();
            teclado.nextLine();
            System.out.print("Digite false para pessoa juridica ou true para pessoa fisica: ");
            fisica = teclado.nextBoolean();
            System.out.print("Digite o saldo inicial da nova conta: ");
            saldo = teclado.nextDouble();

            while (saldo <= 0.0)    {
                System.out.print("Nao e possivel iniciar uma nova conta com um saldo menor ou igual a zero!\nDigite o saldo inicial da nova conta: ");
                saldo = teclado.nextDouble();
            }

            clientes[quantClientes[0]++] = new Cliente(nome, conta, fisica, saldo);
            System.out.println("Conta criada!");
        }   else    {
            System.out.println("Nao e possivel cadastrar uma nova conta com um numero de conta ja registrado!");
        }
    }
    public static void atualizarConta (Scanner teclado, Cliente [] clientes, int [] quantClientes)  {
        String nome;
        int conta;
        boolean fisica;
        int index;
        String [] opcoes = {"nome", "pessoa fisica", "idade"};
        int selecao [] = new int[3];

        if (quantClientes[0] > 0)   {
            System.out.print("Digite o numero da conta a ser atualizada: ");
            conta = teclado.nextInt();
            index = pesquisar(conta, clientes, quantClientes);
            mostrarCliente(teclado, clientes, quantClientes);
            if (index >= 0)  {
                for (int i = 0; i < opcoes.length; i++) {
                    System.out.print("Deseja atualizar o valor de " + opcoes[i] + " (Digite um para atualizar ou zero se nao quiser):");
                    selecao[i] = teclado.nextInt();

                    while (selecao[i] < 0 ^ selecao[i] > 1)   {
                        System.out.print("Valor invalido!\nDeseja atualizar o valor de " + opcoes[i] + " (Digite um para atualizar ou zero se nao quiser):");
                        selecao[i] = teclado.nextInt();
                    }
                }

                if (selecao[0] == 1)    {
                    System.out.print("Digite o nome do novo cliente: ");
                    nome = teclado.nextLine();
                    teclado.nextLine();
                    clientes[index].setNome(nome);
                }
                
                if (selecao[1] == 1)    {
                    System.out.print("Digite false para pessoa juridica ou true para pessoa fisica: ");
                    fisica = teclado.nextBoolean();
                    clientes[index].setFisica(fisica);
                }
                
                if (selecao[2] == 1)    {
                    clientes[index].setIdadeConta();
                }
                
                System.out.println("Conta atualizada!");
            }   else    {
                System.out.println("Nao e possivel atualizar uma conta inexistente!");
            }
        }   else    {
            System.out.println("Nao e possivel realizar essa operacao, nao ha clientes no banco!");
        }
    }
    public static void deletarConta (Scanner teclado, Cliente [] clientes, int [] quantClientes)  {
        int conta;
        int index;

        if (quantClientes[0] > 0)   {
            System.out.print("Digite o numero da conta a ser deletada: ");
            conta = teclado.nextInt();
            index = pesquisar(conta, clientes, quantClientes);
            mostrarCliente(teclado, clientes, quantClientes);
            if (index >= 0)  {
                System.out.println("Detalhes da conta a ser removida\n\n" + clientes[index].toString());
                while (index < quantClientes[0])    {
                    clientes[index] = clientes[index + 1];
                    index = index + 1;
                }
                quantClientes[0]--;
                System.out.println("Conta removida!");
            }   else    {
                System.out.println("Nao e possivel deletar uma conta que nunca foi registrada!");
            }
        }   else    {
            System.out.println("Nao e possivel realizar essa operacao, nao ha clientes no banco!");
        }
    }
    public static void depositar (Scanner teclado, Cliente [] clientes, int [] quantClientes)  {
        int conta;
        double quantia;
        int index;

        System.out.print("Digite o numero da conta: ");
        conta = teclado.nextInt();
        index = pesquisar(conta, clientes, quantClientes);

        if (index >= 0) {
            System.out.print("Digite o valor a ser depositado: ");
            quantia = teclado.nextDouble();

            while (quantia <= 0.0)  {
                System.out.print("Nao e possivel iniciar uma nova conta com um saldo menor ou igual a zero!\nDigite o valor a ser depositado: ");
                quantia = teclado.nextDouble();
            }

            clientes[index].depositar(quantia);
        }   else    {
            System.out.println("Nao e possivel depositar com um numero de conta nao registrada!");
        }
    }
    public static void sacar (Scanner teclado, Cliente [] clientes, int [] quantClientes)   {
        int conta;
        double quantia;
        int index;

        System.out.print("Digite o numero da conta: ");
        conta = teclado.nextInt();
        index = pesquisar(conta, clientes, quantClientes);

        if (index >= 0) {
            System.out.print("Digite o valor a ser sacado: ");
            quantia = teclado.nextDouble();

            while (quantia <= 0.0)  {
                System.out.print("Nao e possivel iniciar uma nova conta com um saldo menor ou igual a zero!\nDigite o valor a ser sacado: ");
                quantia = teclado.nextDouble();
            }

            if (clientes[index].sacar(quantia) > 0) {
                System.out.println("Saque realizado!");
            }   else    {
                System.out.println("Saldo insuficiente!");
            }
        }   else    {
            System.out.println("Nao e possivel depositar com um numero de conta nao registrada!");
        }
    }
    public static void mostrarSaldo (Scanner teclado, Cliente [] clientes, int [] quantClientes)    {
        int conta;
        int index;

        System.out.print("Digite o numero da nova conta: ");
        conta = teclado.nextInt();
        index = pesquisar(conta, clientes, quantClientes);

        if (index >= 0)  {
            System.out.println("Saldo da conta: " + clientes[index].getSaldo());
        }   else    {
            System.out.println("Nao e possivel consultar o saldo de uma conta inexistente!");
        }
    }
    public static void mostrarCliente (Scanner teclado, Cliente [] clientes, int [] quantClientes)    {
        int index;
        int conta;

        if (quantClientes[0] > 0)   {
            System.out.print("Digite o numero da conta a ser exibida: ");
            conta = teclado.nextInt();
            index = pesquisar(conta, clientes, quantClientes);
            if (index >= 0)  {
                System.out.println("Dados do cliente\n\n" + clientes[index].toString());
            }   else    {
                System.out.println("Nao e possivel mostrar uma conta que nunca foi registrada!");
            }
        }   else    {
            System.out.println("Nao e possivel realizar essa operacao, nao ha clientes no banco!");
        }
    }
    public static void mostrarClientes (Cliente [] clientes, int [] quantClientes)   {
        if (quantClientes[0] > 0)   {
            System.out.println("Lista de clientes do banco\n");
            for (int i = 0; i < quantClientes[0]; i++)  {
                System.out.println(clientes[i].toString() + "\n");
            }
        }   else    {
            System.out.println("Nao ha clientes no banco!");
        }
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
