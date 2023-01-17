package com.algaworks.junit.utilidade;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class SimuladorEsperaTest {

    @Test
//    @Disabled("Não é mais aplicável")
    @EnabledIfEnvironmentVariable(named = "ENV", matches = "DEV")
    void deveEsperarENaoDarTimeout() {
//        assertTimeout(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofSeconds(10)));
//        Assumptions.assumeTrue("PROD".equals(System.getenv("ENV")), () -> "Abortando teste: não deve ser executado em PROD");
        assertTimeoutPreemptively(Duration.ofSeconds(1), () -> SimuladorEspera.esperar(Duration.ofMillis(10)));
    }
}