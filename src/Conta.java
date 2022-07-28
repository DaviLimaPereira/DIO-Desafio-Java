public class Conta implements IConta {
    
    protected static final int AGENCIA_PADRAO = 1;
    private static int sequencia = 1;
    
    protected int agencia;
    protected int numero;
    private double saldo;

    

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = sequencia++;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta ContaDestino){
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }
        
    public int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}