public class OperacaoRetirar implements Operacao {
    public float efetuar(float valor, float saldo) {
        return saldo - valor;
    }
}
