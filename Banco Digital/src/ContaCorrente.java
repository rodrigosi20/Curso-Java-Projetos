public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(int numeroConta, double taxaManutencao) {
        super(numeroConta);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor - taxaManutencao);
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor + taxaManutencao) {
            setSaldo(getSaldo() - valor - taxaManutencao);
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
