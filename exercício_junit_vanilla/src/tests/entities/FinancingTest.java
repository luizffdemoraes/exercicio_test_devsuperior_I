package tests.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

class FinancingTest {

	@Test
	void verificarValorEntrada() {

		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double valorEsperado = 100000.0 * 0.2;

		// A��o
		double entrada = financing.entry();

		// Verifica��o
		Assertions.assertEquals(valorEsperado, entrada);

	}

	@Test
	void verificarValorDasParcelas() {
		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double valorEsperado = (100000.0 * 0.80 ) / 80;

		// A��o
		double parcela = financing.quota();

		// Verifica��o
		Assertions.assertEquals(valorEsperado, parcela);

	}

	@Test
	void verificarContructorComValoresValidos() {

		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// Verifica��o
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());

	}

	@Test
	void verificarSetTotalAmount() {

		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// A��o
		financing.setTotalAmount(80000.0);

		// Verifica��o
		Assertions.assertEquals(80000.0, financing.getTotalAmount());

	}

	@Test
	void verificarSetIncome() {

		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// A��o
		financing.setIncome(3000.0);

		// Verifica��o
		Assertions.assertEquals(3000.0, financing.getIncome());

	}

	@Test
	void verificarSetMonths() {

		// Cen�rio
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// A��o
		financing.setMonths(90);

		// Verifica��o
		Assertions.assertEquals(90, financing.getMonths());

	}

	@Test
	void verificarExceptioContructorIlegal() {

		// Assertion Verifica��o
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cen�rio
			Financing financing = new Financing(100000.0, 2000.0, 20);

		});

	}

	@Test
	void verificarExceptioSetTotalAmountIlegal() {

		// Assertion Verifica��o
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cen�rio
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(200000.0);

		});

	}

	@Test
	void verificarExceptioSetIncomeIlegal() {

		// Assertion Verifica��o
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cen�rio
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setIncome(1000.0);

		});

	}

	@Test
	void verificarExceptioSetMonthsIlegal() {

		// Assertion Verifica��o
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cen�rio
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(5);

		});

	}

}
