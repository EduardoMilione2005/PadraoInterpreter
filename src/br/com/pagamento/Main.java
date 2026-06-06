package br.com.pagamento;

import br.com.pagamento.interpreter.InterpretadorPagamento;

public class Main {

    public static void main(String[] args) {

        InterpretadorPagamento interpretador =
                new InterpretadorPagamento();

        System.out.println(
                interpretador.interpretar("PAGAR PIX")
        );

        System.out.println(
                interpretador.interpretar("PAGAR CREDITO")
        );

        System.out.println(
                interpretador.interpretar("PAGAR BOLETO")
        );
    }
}