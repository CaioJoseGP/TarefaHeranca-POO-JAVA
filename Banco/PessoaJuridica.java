public class PessoaJuridica extends Titular {
    private String cnpj;

    //Construtor
    public PessoaJuridica(String nome, String telefone, Endereco endereco, String cnpj) {
        super(nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    //Getters e Setters
    public String getCnpj() {
        return cnpj;
    }
}