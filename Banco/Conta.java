public abstract class Conta {
    private double saldo;
    private String numero;
    private String agencia;
    private String banco;

    //Construtor
    public Conta(String numero, String agencia, String banco) {
        this.saldo = 0.0;
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
    }

    //Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    //Métodos de Validação
    boolean validarDeposito(double valor) {
        if(valor <= 0) {
            return false;

        } else {
            return true;
        }
    }

    boolean validarSaque(double valor) {
        if(this.saldo < valor || valor <= 0) {
            return false;

        } else {
            return true;
        }
    }
    
    boolean validarTransferencia(double valor) {
        if(this.saldo < valor || valor <= 0) {
            return false;

        } else {
            return true;
        }
    }

    //Metodos de Ação
    public void depositar(double valor) {
        if(validarDeposito(valor)) {
            this.saldo = this.saldo + valor;
        }
    }

    public void sacar(double valor) {
        if(validarSaque(valor)) {
            this.saldo = this.saldo - valor;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if(validarTransferencia(valor)) {
            contaDestino.depositar(valor);
            this.saldo = this.saldo - valor;
        }
    }

    public boolean buscarNumero(String numero) {
        if(this.numero.equals(numero)) {
            return true;

        } else {
            return false;
        }
    }
}
