package br.com.pagamento.interpreter;

public class ContextoPagamento {

    private String comando;

    public ContextoPagamento(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }
}