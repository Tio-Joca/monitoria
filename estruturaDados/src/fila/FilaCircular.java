package fila;

import dados.ItemInt;

public class FilaCircular {
    private ItemInt [] vet;
    private int primeiro;
    private int ultimo;

    public FilaCircular (int tamanho)   {
        this.vet = new ItemInt [tamanho];
        this.primeiro = -1;
        this.ultimo = -1;
    }

    public FilaCircular ()  {
        this.vet = new ItemInt [100];
        this.primeiro = -1;
        this.ultimo = -1;
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

    
}
