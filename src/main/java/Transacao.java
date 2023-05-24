public class Transacao {

    private float valor;
    private float saldoConta;

    public Transacao(Float valor, Float saldo) {
        this.valor = valor;
        this.saldoConta = saldo;
    }

    public float efetuar(Operacao operacao) {
        return operacao.efetuar(valor, saldoConta);
    }
}
