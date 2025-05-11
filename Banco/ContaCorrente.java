public class ContaCorrente extends ContaPF {
    private PessoaFisica titularSecundario;

    //Construtor - 1 titular
    public ContaCorrente(String numero, String agencia, String banco, PessoaFisica titular) {
        super(numero, agencia, banco, titular);
        this.titularSecundario = null;
    }

    //Construtor - ContaConjunta
    public ContaCorrente(String numero, String agencia, String banco, PessoaFisica titular, PessoaFisica titularSecundario) {
        super(numero, agencia, banco, titular);
        this.titularSecundario = titularSecundario;
    }

    //Getters e Setters
    public String getTitularSecundario() {
        return "Nome: " + titularSecundario.getNome() + "\nCPF: " + titularSecundario.getCpf();
    }

    public void setTitularSecundario(PessoaFisica titularSecundario) {
        this.titularSecundario = titularSecundario;
    }
}