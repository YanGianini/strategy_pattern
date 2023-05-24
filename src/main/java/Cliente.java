public class Cliente {
    private float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void Depositar(float valor) {
        Transacao transacao = new Transacao(valor, getSaldo());
        this.saldo = transacao.efetuar(new OperacaoDepositar());
    }

    public void Retirar(float valor) {
        Transacao transacao = new Transacao(valor, getSaldo());
        this.saldo = transacao.efetuar(new OperacaoRetirar());
    }

}
