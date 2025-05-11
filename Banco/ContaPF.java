public abstract class ContaPF extends Conta {
    private PessoaFisica titular;

    //Construtor
    public ContaPF(String numero, String agencia, String banco, PessoaFisica titular) {
        super(numero, agencia, banco);
        this.titular = titular;
    }

    //Getters e Setters
    public String getTitular() {
        return "Nome: " + titular.getNome() + "\nCPF: " + titular.getCpf();
    }

    public void setTitular(PessoaFisica titular) {
        this.titular = titular;
    }
}
