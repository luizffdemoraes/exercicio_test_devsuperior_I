package tests.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FinancingTest {

	@Test
	void verificarValorEntrada() {

		// Cenário
		Financing financing = new Financing(15000.0, 2000.0, 20);
		double valorEsperado = 15000.0 * 0.2;

		// Ação
		double entrada = financing.entry();

		// Verificação
		Assertions.assertEquals(valorEsperado, entrada);

	}

	@Test
	void verificarValorDasParcelas() {
		// Cenário
		Financing financing = new Financing(15000.0, 2000.0, 20);
		double valorEsperado = (15000.0 - 15000.0 * 0.2) / 20;

		// Ação
		double parcela = financing.quota();

		// Verificação
		Assertions.assertEquals(valorEsperado, parcela);

	}

}
