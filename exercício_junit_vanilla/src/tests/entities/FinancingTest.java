package tests.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

class FinancingTest {

	@Test
	void verificarValorEntrada() {

		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double valorEsperado = 100000.0 * 0.2;

		// Ação
		double entrada = financing.entry();

		// Verificação
		Assertions.assertEquals(valorEsperado, entrada);

	}

	@Test
	void verificarValorDasParcelas() {
		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);
		double valorEsperado = (100000.0 * 0.80 ) / 80;

		// Ação
		double parcela = financing.quota();

		// Verificação
		Assertions.assertEquals(valorEsperado, parcela);

	}

	@Test
	void verificarContructorComValoresValidos() {

		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// Verificação
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());

	}

	@Test
	void verificarSetTotalAmount() {

		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// Ação
		financing.setTotalAmount(80000.0);

		// Verificação
		Assertions.assertEquals(80000.0, financing.getTotalAmount());

	}

	@Test
	void verificarSetIncome() {

		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// Ação
		financing.setIncome(3000.0);

		// Verificação
		Assertions.assertEquals(3000.0, financing.getIncome());

	}

	@Test
	void verificarSetMonths() {

		// Cenário
		Financing financing = new Financing(100000.0, 2000.0, 80);

		// Ação
		financing.setMonths(90);

		// Verificação
		Assertions.assertEquals(90, financing.getMonths());

	}

	@Test
	void verificarExceptioContructorIlegal() {

		// Assertion Verificação
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cenário
			Financing financing = new Financing(100000.0, 2000.0, 20);

		});

	}

	@Test
	void verificarExceptioSetTotalAmountIlegal() {

		// Assertion Verificação
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cenário
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(200000.0);

		});

	}

	@Test
	void verificarExceptioSetIncomeIlegal() {

		// Assertion Verificação
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cenário
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setIncome(1000.0);

		});

	}

	@Test
	void verificarExceptioSetMonthsIlegal() {

		// Assertion Verificação
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// Arrange cenário
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(5);

		});

	}

}
