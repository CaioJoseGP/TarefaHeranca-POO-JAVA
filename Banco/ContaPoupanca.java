public class ContaPoupanca extends ContaPF {
    private double taxaRendimento;

    //Construtor
    public ContaPoupanca(String numero, String agencia, String banco, PessoaFisica titular) {
        super(numero, agencia, banco, titular);
        this.taxaRendimento = 0.5;
    }

    //Getters e Setters
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    //Métodos de Ação
    private double calcularRendimento() {
        return getSaldo() * (this.taxaRendimento / 100);
    }

    public void renderSaldo() {
        depositar(calcularRendimento());
    }
}
