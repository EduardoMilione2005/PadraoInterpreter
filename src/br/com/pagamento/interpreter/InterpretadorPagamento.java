package br.com.pagamento.interpreter;

import java.util.List;

public class InterpretadorPagamento {

    private final List<Expressao> expressoes;

    public InterpretadorPagamento() {

        expressoes = List.of(
                new PagamentoPix(),
                new PagamentoCredito(),
                new PagamentoBoleto()
        );
    }

    public String interpretar(String comando) {

        ContextoPagamento contexto =
                new ContextoPagamento(comando.toUpperCase());

        for (Expressao expressao : expressoes) {

            String resultado =
                    expressao.interpretar(contexto);

            if (resultado != null) {
                return resultado;
            }
        }

        return "Forma de pagamento inválida";
    }
}