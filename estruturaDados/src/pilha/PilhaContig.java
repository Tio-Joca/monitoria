package pilha;

import dados.ItemInt; // Importa a classe que representa os itens que serão armazenados na pilha

/**
 * Implementação de uma pilha usando estrutura contígua (vetor)
 * Segue o princípio LIFO (Last-In-First-Out): o último elemento inserido é o primeiro a ser retirado
 */
public class PilhaContig {
    private ItemInt [] vet; // Vetor que armazena os elementos da pilha
    private int topo;       // Índice que indica a posição do elemento no topo da pilha

    /**
     * Construtor que permite especificar o tamanho máximo da pilha
     */
    public PilhaContig (int tamanho)    {
        this.vet = new ItemInt [tamanho]; // Aloca memória para o vetor com o tamanho especificado
        this.topo = -1;                   // Inicializa topo com -1, indicando que a pilha está vazia
    }

    /**
     * Construtor padrão que cria uma pilha com tamanho 100
     */
    public PilhaContig ()   {
        this.vet = new ItemInt [100]; // Cria um vetor com tamanho padrão de 100 elementos
        this.topo = -1;               // Inicializa a pilha como vazia
    }

    /**
     * Retorna o elemento no topo da pilha sem removê-lo
     */
    public ItemInt getItemInt ()    {
        return this.vet[this.topo]; // Acessa e retorna o elemento na posição do topo
    }

    /**
     * Retorna o valor atual do índice do topo da pilha
     */
    public int getTopo ()   {
        return this.topo; // Retorna o valor atual do índice do topo
    }

    /**
     * Verifica se a pilha está vazia
     * Retorna true se a pilha estiver vazia, false caso contrário
     */
    public boolean eVazia ()    {
        return (this.topo == -1); // Se topo == -1, não há elementos na pilha
    }

    /**
     * Verifica se a pilha está cheia
     * Retorna true se a pilha estiver cheia, false caso contrário
     */
    public boolean eCheia ()    {
        return (this.topo == (this.vet.length - 1)); // Se topo == tamanho-1, o vetor está cheio
    }

    /**
     * Insere um novo elemento no topo da pilha
     * Retorna true se o elemento foi inserido com sucesso, false caso a pilha esteja cheia
     */
    public boolean empilhar (ItemInt ref)    {
        if (! (eCheia()))   {            // Verifica se a pilha não está cheia
            this.vet[++this.topo] = ref; // Incrementa o topo e depois insere o elemento na nova posição
            return true;                 // Operação realizada com sucesso
        }
        return false;                    // Não foi possível inserir, pilha cheia
    }

    /**
     * Remove o elemento do topo da pilha
     * Retorna o elemento removido ou null se a pilha estiver vazia
     */
    public ItemInt desempilhar ()   {
        if (! (eVazia()))   {              // Verifica se a pilha não está vazia
            return this.vet[this.topo--];  // Retorna o elemento do topo e depois decrementa o topo
        }
        return null;                       // Retorna null se a pilha estiver vazia
    }
}
