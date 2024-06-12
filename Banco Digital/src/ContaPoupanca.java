public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numeroConta, double taxaRendimento) {
        super(numeroConta);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}
