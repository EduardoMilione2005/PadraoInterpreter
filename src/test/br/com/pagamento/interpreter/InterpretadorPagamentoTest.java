package test.br.com.pagamento.interpreter;

import br.com.pagamento.interpreter.InterpretadorPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterpretadorPagamentoTest {

    @Test
    void deveRetornarErroParaPagamentoInvalido() {

        InterpretadorPagamento interpretador =
                new InterpretadorPagamento();

        assertEquals(
                "Forma de pagamento inválida",
                interpretador.interpretar("PAGAR DINHEIRO")
        );
    }
}