package test.br.com.pagamento.interpreter;

import br.com.pagamento.interpreter.InterpretadorPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoCreditoTest {

    @Test
    void deveInterpretarCredito() {

        InterpretadorPagamento interpretador =
                new InterpretadorPagamento();

        assertEquals(
                "Pagamento realizado via Cartão de Crédito",
                interpretador.interpretar("PAGAR CREDITO")
        );
    }
}