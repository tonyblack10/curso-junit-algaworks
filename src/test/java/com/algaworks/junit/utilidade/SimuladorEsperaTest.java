package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class SimuladorEsperaTest {

    @Test
    @Disabled("Não é mais aplicável")
    void deveEsperarENaoDarTimeout() {
//        assertTimeout(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofSeconds(10)));
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }
}