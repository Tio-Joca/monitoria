package dados; // Define o pacote onde a classe está localizada

/**
 * Classe que encapsula um valor inteiro
 * Utilizada para armazenar elementos na estrutura de dados
 */
public class ItemInt {
    private int valor; // Atributo que armazena o valor inteiro encapsulado

    /**
     * Construtor que inicializa o objeto com um valor específico
     */
    public ItemInt (int valor)  {
        this.valor = valor; // Atribui o valor recebido ao atributo da classe
    }
    
    /**
     * Método para modificar o valor armazenado
     */
    public void setValor (int valor)    {
        this.valor = valor; // Atualiza o valor do atributo com o novo valor recebido
    }

    /**
     * Método para obter o valor armazenado
     * Retorna o valor inteiro atual do objeto
     */
    public int getValor ()  {
        return this.valor; // Retorna o valor atual armazenado no objeto
    }
}
