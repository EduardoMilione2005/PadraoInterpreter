package test.br.com.pagamento.interpreter;

import br.com.pagamento.interpreter.InterpretadorPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoBoletoTest {

    @Test
    void deveInterpretarBoleto() {

        InterpretadorPagamento interpretador =
                new InterpretadorPagamento();

        assertEquals(
                "Pagamento realizado via Boleto",
                interpretador.interpretar("PAGAR BOLETO")
        );
    }
}