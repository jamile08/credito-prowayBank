package br.com.prowayBank.credito;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FinanciamentoVeiculoTest {

	@Test
	void testFinanciarVeiculo() {
		Veiculo veiculo = new Veiculo(2000, 25000.00, "Toyota", TipoVeiculo.CARRO, SituacaoVeiculo.USADO);
		FinanciamentoVeiculo financiamentoVeiculo =  new FinanciamentoVeiculo(500, veiculo);
		Assert.assertEquals("Pedido de financiamento aceito.", financiamentoVeiculo.financiarVeiculo());
	}

}
