package tests.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class FinancingTest {

	@Test
	void verificarValorEntrada() {

		// Cen�rio
		Financing financing = new Financing(15000.0, 2000.0, 20);
		double valorEsperado = 15000.0 * 0.2;

		// A��o
		double entrada = financing.entry();

		// Verifica��o
		Assertions.assertEquals(valorEsperado, entrada);

	}

	@Test
	void verificarValorDasParcelas() {
		// Cen�rio
		Financing financing = new Financing(15000.0, 2000.0, 20);
		double valorEsperado = (15000.0 - 15000.0 * 0.2) / 20;

		// A��o
		double parcela = financing.quota();

		// Verifica��o
		Assertions.assertEquals(valorEsperado, parcela);

	}

}
