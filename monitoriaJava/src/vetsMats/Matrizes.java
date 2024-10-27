package vetsMats;

import java.util.Scanner;

public class Matrizes {
    public static void main (String[] args) {
        int [][] inteiros = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}};
        double [][] flutuantes = {{-445.1, 45.14, 455}, {3.14, 74.485, -4.4}, {48, 78, 17}};
        char [][] letras = {{'a', 'b', 'c'}, {'M', 'N', 'O'}, {'x', 'y', 'z'}};
        String [][] palavras = {{"aba", "ovo", "reviver"}, {"abacate", "oculos", "retrovisor"}, {"osso", "reter", "saias"}};
        boolean [][] booleanos = {{true, false, false}, {false, true, false}, {false, false, true}};

        System.out.println("Valores dentro da matriz de inteiros\n");

        for (int i = 0; i < inteiros.length; i++)   {
            for (int j = 0; j < inteiros[i].length; j++)    {
                if (j == inteiros.length - 1)   {
                    System.out.print(inteiros[i][j] + "\n");
                }   else    {
                    System.out.print(inteiros[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de doubles\n");

        for (int i = 0; i < flutuantes.length; i++)   {
            for (int j = 0; j < flutuantes[i].length; j++)    {
                if (j == flutuantes.length - 1)   {
                    System.out.print(flutuantes[i][j] + "\n");
                }   else    {
                    System.out.print(flutuantes[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de chars\n");

        for (int i = 0; i < letras.length; i++)   {
            for (int j = 0; j < letras[i].length; j++)    {
                if (j == letras.length - 1)   {
                    System.out.print(letras[i][j] + "\n");
                }   else    {
                    System.out.print(letras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de strings\n");

        for (int i = 0; i < palavras.length; i++)   {
            for (int j = 0; j < palavras[i].length; j++)    {
                if (j == palavras.length - 1)   {
                    System.out.print(palavras[i][j] + "\n");
                }   else    {
                    System.out.print(palavras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de booleanos\n");

        for (int i = 0; i < booleanos.length; i++)   {
            for (int j = 0; j < booleanos[i].length; j++)    {
                if (j == booleanos.length - 1)   {
                    System.out.print(booleanos[i][j] + "\n");
                }   else    {
                    System.out.print(booleanos[i][j] + ", ");
                }
            }
        }

        Scanner teclado;
        int lin, col;

        teclado = new Scanner (System.in);

        System.out.print("Digite a quantidade de linhas para as matrizes: ");
        lin = teclado.nextInt();

        while (lin <= 0)    {
            System.out.print("Voce digitou um valor menor ou igual a zero!\nDigite a quantidade de linhas para as matrizes: ");
        }

        System.out.print("Digite a quantidade de colunas para as matrizes: ");
        col = teclado.nextInt();

        while (col <= 0)    {
            System.out.print("Voce digitou um valor menor ou igual a zero!\nDigite a quantidade de colunas para as matrizes: ");
        }

        inteiros = new int [lin][col];
        flutuantes = new double [lin][col];
        letras = new char [lin][col];
        palavras = new String [lin][col];
        booleanos = new boolean [lin][col];

        System.out.println("\nValores dentro da matriz de inteiros\n");

        for (int i = 0; i < inteiros.length; i++)   {
            for (int j = 0; j < inteiros[i].length; j++)    {
                if (j == inteiros.length - 1)   {
                    System.out.print(inteiros[i][j] + "\n");
                }   else    {
                    System.out.print(inteiros[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de doubles\n");

        for (int i = 0; i < flutuantes.length; i++)   {
            for (int j = 0; j < flutuantes[i].length; j++)    {
                if (j == flutuantes.length - 1)   {
                    System.out.print(flutuantes[i][j] + "\n");
                }   else    {
                    System.out.print(flutuantes[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de chars\n");

        for (int i = 0; i < letras.length; i++)   {
            for (int j = 0; j < letras[i].length; j++)    {
                if (j == letras.length - 1)   {
                    System.out.print(letras[i][j] + "\n");
                }   else    {
                    System.out.print(letras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de strings\n");

        for (int i = 0; i < palavras.length; i++)   {
            for (int j = 0; j < palavras[i].length; j++)    {
                if (j == palavras.length - 1)   {
                    System.out.print(palavras[i][j] + "\n");
                }   else    {
                    System.out.print(palavras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de booleanos\n");

        for (int i = 0; i < booleanos.length; i++)   {
            for (int j = 0; j < booleanos[i].length; j++)    {
                if (j == booleanos.length - 1)   {
                    System.out.print(booleanos[i][j] + "\n");
                }   else    {
                    System.out.print(booleanos[i][j] + ", ");
                }
            }
        }

        System.out.println("\nEntrada de valores inteiros na matriz de inteiros\n");

        for (int i = 0; i < inteiros.length; i++)   {
            for (int j = 0; j < inteiros[i].length; j++)    {
                System.out.print("Digite um numero inteiro: ");
                inteiros[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nEntrada de valores flutuantes na matriz de doubles\n");

        for (int i = 0; i < flutuantes.length; i++)   {
            for (int j = 0; j < flutuantes[i].length; j++)    {
                System.out.print("Digite um numero decimal: ");
                flutuantes[i][j] = teclado.nextDouble();
            }
        }

        System.out.println("\nEntrada de caracteres na matriz de chars\n");

        for (int i = 0; i < letras.length; i++)   {
            for (int j = 0; j < letras[i].length; j++)    {
                System.out.print("Digite uma letra: ");
                letras[i][j] = teclado.next().charAt(0);
            }
        }

        System.out.println("\nEntrada de palavras na matriz de strings\n");

        for (int i = 0; i < palavras.length; i++)   {
            for (int j = 0; j < palavras[i].length; j++)    {
                System.out.print("Digite uma palavra: ");
                palavras[i][j] = teclado.next();
            }
        }

        System.out.println("\nEntrada de booleanos na matriz de booleans\n");

        for (int i = 0; i < booleanos.length; i++)   {
            for (int j = 0; j < booleanos[i].length; j++)    {
                System.out.print("Digite false para falso ou true para verdadeiro: ");
                booleanos[i][j] = teclado.nextBoolean();
            }
        }

        System.out.println("\nValores dentro da matriz de inteiros\n");

        for (int i = 0; i < inteiros.length; i++)   {
            for (int j = 0; j < inteiros[i].length; j++)    {
                if (j == inteiros.length - 1)   {
                    System.out.print(inteiros[i][j] + "\n");
                }   else    {
                    System.out.print(inteiros[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de doubles\n");

        for (int i = 0; i < flutuantes.length; i++)   {
            for (int j = 0; j < flutuantes[i].length; j++)    {
                if (j == flutuantes.length - 1)   {
                    System.out.print(flutuantes[i][j] + "\n");
                }   else    {
                    System.out.print(flutuantes[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de chars\n");

        for (int i = 0; i < letras.length; i++)   {
            for (int j = 0; j < letras[i].length; j++)    {
                if (j == letras.length - 1)   {
                    System.out.print(letras[i][j] + "\n");
                }   else    {
                    System.out.print(letras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de strings\n");

        for (int i = 0; i < palavras.length; i++)   {
            for (int j = 0; j < palavras[i].length; j++)    {
                if (j == palavras.length - 1)   {
                    System.out.print(palavras[i][j] + "\n");
                }   else    {
                    System.out.print(palavras[i][j] + ", ");
                }
            }
        }

        System.out.println("\nValores dentro da matriz de booleanos\n");

        for (int i = 0; i < booleanos.length; i++)   {
            for (int j = 0; j < booleanos[i].length; j++)    {
                if (j == booleanos.length - 1)   {
                    System.out.print(booleanos[i][j] + "\n");
                }   else    {
                    System.out.print(booleanos[i][j] + ", ");
                }
            }
        }

        teclado.close();
    }
}
