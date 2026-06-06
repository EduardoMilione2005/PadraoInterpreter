package br.com.pagamento.interpreter;

public class PagamentoCredito implements Expressao {

    @Override
    public String interpretar(ContextoPagamento contexto) {

        if (contexto.getComando().contains("CREDITO")) {
            return "Pagamento realizado via Cartão de Crédito";
        }

        return null;
    }
}