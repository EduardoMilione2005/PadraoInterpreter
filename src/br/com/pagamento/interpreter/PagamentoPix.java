package br.com.pagamento.interpreter;

public class PagamentoPix implements Expressao {

    @Override
    public String interpretar(ContextoPagamento contexto) {

        if (contexto.getComando().contains("PIX")) {
            return "Pagamento realizado via PIX";
        }

        return null;
    }
}