package objetosSimples;

public class Cliente {
    private String nome;
    private int conta;
    private int idadeConta;
    private int categoria;
    private boolean fisica;
    private double saldo;

    public Cliente (String nome, int conta, boolean fisica, double saldo)  {
        this.nome = nome;
        this.conta = conta;
        this.idadeConta = 0;
        setCategoria(saldo);
        this.fisica = fisica;
        this.saldo = saldo;
    }
    public void setNome (String nome)   {
        this.nome = nome;
    }
    public void setConta (int conta)    {
        this.conta = conta;
    }
    public void setIdadeConta ()    {
        this.idadeConta = idadeConta + 1;
        setCategoria(saldo);
    }
    private void setCategoria (double saldo) {
        if (saldo >= 1000000)   {
            this.categoria = 1;
        }   else if (saldo >= 100000)   {
            this.categoria = 2;
        }   else if (saldo >= 10000)    {
            this.categoria = 3;
        }   else if (saldo >= 0)    {
            this.categoria = 4;
        }   else    {
            return;
        }
    }
    public void setFisica (boolean fisica)  {
        this.fisica = fisica;
    }
    public String getNome ()   {
        return this.nome;
    }
    public int getConta ()  {
        return this.conta;
    }
    public int getIdadeConta () {
        return this.idadeConta;
    }
    public int getCategoria ()  {
        return this.categoria;
    }
    public boolean getFisica () {
        return this.fisica;
    }
    public double getSaldo ()   {
        return this.saldo;
    }
    public void depositar (double quantia)  {
        this.saldo = this.saldo + quantia;
    }
    public double sacar (double quantia)    {
        double aux;
        if (categoria == 1) {
            aux = saldo - quantia;
            if (aux < -100000)  {
                return 0;
            }   else    {
                saldo = aux;
                return quantia;
            }
        }   else if (categoria == 2) {
            aux = saldo - quantia;
            if (aux < -10000)  {
                return 0;
            }   else    {
                saldo = aux;
                return quantia;
            }
        }   else if (categoria == 3) {
            aux = saldo - quantia;
            if (aux < -1000)  {
                return 0;
            }   else    {
                saldo = aux;
                return quantia;
            }
        }   else    {
            aux = saldo - quantia;
            if (aux < -500)  {
                return 0;
            }   else    {
                saldo = aux;
                return quantia;
            }
        }
    }
    @Override
    public String toString ()   {
        return "Nome: " + this.nome 
            + "\nConta: " + this.conta 
            + "\nCorrentista desde: " + this.idadeConta 
            + "\nCategoria: " + this.categoria 
            + "\nPessoa fisica: " + this.fisica 
            + "\nSaldo: " + this.saldo;
    }
}
