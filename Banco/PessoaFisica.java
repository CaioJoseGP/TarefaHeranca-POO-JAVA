public class PessoaFisica extends Titular {
    private String cpf;

    //Construtor
    public PessoaFisica(String nome, String telefone, Endereco endereco, String cpf) {
        super(nome, telefone, endereco);
        this.cpf = cpf;
    }

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }
}
