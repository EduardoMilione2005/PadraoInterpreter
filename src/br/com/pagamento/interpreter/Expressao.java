package br.com.pagamento.interpreter;

public interface Expressao {
    String interpretar(ContextoPagamento contexto);
}