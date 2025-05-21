package fila;

import dados.ItemInt;

public class FilaCircular {
    private ItemInt [] vet;
    private int primeiro;
    private int ultimo;
    private int tamanho;

    public FilaCircular (int tamanho)   {
        this.vet = new ItemInt [tamanho];
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
    }

    public FilaCircular ()  {
        this.vet = new ItemInt [100];
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
    }

    public ItemInt getItemInt ()    {
        return this.vet[this.primeiro];
    }

    public int getPrimeiro ()   {
        return this.primeiro;
    }

    public int getUltimo () {
        return this.ultimo;
    }

    public int getTamanho ()    {
        return this.tamanho;
    }

    public void setTamanho (int tamanho)   {
        this.tamanho = tamanho;
    }

    /**
     * Verifica se a fila está cheia
     * Retorna true se a fila estiver cheia, false caso contrário
     */
    public boolean eCheia ()    {
        return (this.tamanho == this.vet.length); // Se tamanho == capacidade do vetor, a fila está cheia
    }

    /**
     * Verifica se a fila está vazia
     * Retorna true se a fila estiver vazia, false caso contrário
     */
    public boolean eVazia ()    {
        return (this.tamanho == 0); // Se tamanho == 0, não há elementos na fila
    }

    /**
     * Insere um novo elemento no final da fila
     * Retorna true se o elemento foi inserido com sucesso, false caso a fila esteja cheia
     */
    public boolean emfileirar (ItemInt ref) {
        if (! (this.eCheia())) {                          // Verifica se a fila não está cheia
            this.ultimo = this.ultimo % this.vet.length;  // Usa operação módulo para garantir circularidade
                                                          // Se ultimo = tamanho do vetor, volta para posição 0
            this.vet[this.ultimo++] = ref;                // Insere o elemento e incrementa o índice ultimo
            this.tamanho++;                               // Incrementa o contador de elementos
            return true;                                  // Operação realizada com sucesso
        }
        return false;                                     // Não foi possível inserir, fila cheia
    }

    /**
     * Remove o elemento do início da fila
     * Retorna o elemento removido ou null se a fila estiver vazia
     */
    public ItemInt desemfileirar () {
        if (! (this.eVazia()))  {                           // Verifica se a fila não está vazia
            this.primeiro = this.primeiro % this.vet.length; // Usa operação módulo para garantir circularidade
                                                             // Se primeiro = tamanho do vetor, volta para posição 0
            this.tamanho--;                                  // Decrementa o contador de elementos
            return this.vet[this.primeiro++];                // Retorna o elemento e incrementa o índice primeiro
        }
        return null;                                         // Retorna null se a fila estiver vazia
    }
}
