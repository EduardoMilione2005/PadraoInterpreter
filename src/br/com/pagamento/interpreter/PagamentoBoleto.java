package br.com.pagamento.interpreter;

public class PagamentoBoleto implements Expressao {

    @Override
    public String interpretar(ContextoPagamento contexto) {

        if (contexto.getComando().contains("BOLETO")) {
            return "Pagamento realizado via Boleto";
        }

        return null;
    }
}