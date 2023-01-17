package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void assercaoAgrupada() {
        var pessoa = new Pessoa("Tony", "Costa");

        assertAll("Asserções de pessoa",
            () -> assertEquals("Tony", pessoa.getNome()),
            () -> assertEquals("Costa", pessoa.getSobrenome())
        );
    }

}