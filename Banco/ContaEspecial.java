public class ContaEspecial extends ContaPF {
    private double chequeEspecial;

    //Construtor
    public ContaEspecial(String numero, String agencia, String banco, PessoaFisica titular, double chequeEspecial) {
        super(numero, agencia, banco, titular);
        this.chequeEspecial = chequeEspecial;
    }

    //Getters e Setters
    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    //Métodos de Validação [Sobrescritos] (de Conta.java)
    @Override
    public boolean validarSaque(double valor) {
        if((super.getSaldo() + this.chequeEspecial) < valor || valor <= 0) {
            return false;

        } else {
            return true;
        }
    }

    @Override
    public boolean validarTransferencia(double valor) {
        if((super.getSaldo() + this.chequeEspecial) < valor || valor <= 0) {
            return false;

        } else {
            return true;
        }
    }
}
