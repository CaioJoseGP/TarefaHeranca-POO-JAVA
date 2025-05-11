public abstract class ContaPJ extends Conta {
    private PessoaJuridica titular;

    //Construtor
    public ContaPJ(String numero, String agencia, String banco, PessoaJuridica titular) {
        super(numero, agencia, banco);
        this.titular = titular;
    }

    //Getters e Setters
    public String getTitular() {
        return "Nome: " + titular.getNome() + "\nCNPJ: " + titular.getCnpj();
    }

    public void setTitular(PessoaJuridica titular) {
        this.titular = titular;
    }
}
