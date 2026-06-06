package test.br.com.pagamento.interpreter;

import br.com.pagamento.interpreter.InterpretadorPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoPixTest {

    @Test
    void deveInterpretarPagamentoPix() {

        InterpretadorPagamento interpretador =
                new InterpretadorPagamento();

        String resultado =
                interpretador.interpretar("PAGAR PIX");

        assertEquals(
                "Pagamento realizado via PIX",
                resultado
        );
    }
}