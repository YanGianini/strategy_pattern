public class OperacaoDepositar implements Operacao{
    public float efetuar(float valor, float saldo) {
        return saldo + valor;
    }
}
