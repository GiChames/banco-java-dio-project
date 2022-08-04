import javax.sound.midi.Sequence;

public abstract class  Conta implements IConta{

    protected int agencia;
    protected int numConta;
    protected double saldo;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    public Conta() {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.saldo = 0;
    }

    @Override
    public void sacar(double valor) {
    this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
    this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void imprimeDados(){
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("NUMERO DA CONTA: %d", this.numConta));
        System.out.println(String.format("SALDO:  %.2f", this.saldo));
    }
}
