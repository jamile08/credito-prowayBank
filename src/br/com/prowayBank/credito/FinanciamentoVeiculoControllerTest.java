package br.com.prowayBank.credito;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FinanciamentoVeiculoControllerTest {

	@Test
	void testFinanciamentoVeiculoControllerAceito() {
		Veiculo veiculo = new Veiculo(2000, 25000.00, "Toyota", TipoVeiculo.CARRO, SituacaoVeiculo.USADO);
		FinanciamentoVeiculo financiamentoVeiculo =  new FinanciamentoVeiculo(500, veiculo);
		FinanciamentoVeiculoController financiamentoVeiculoController = new FinanciamentoVeiculoController(financiamentoVeiculo);
		Assert.assertEquals("Pedido de financiamento aceito.", financiamentoVeiculoController.financiarVeiculo());
	}
	
	@Test
	void testFinanciamentoVeiculoControllerRecusado() {
		Veiculo veiculo = new Veiculo(2013, 13000.00, "Honda", TipoVeiculo.MOTO, SituacaoVeiculo.NOVO);
		FinanciamentoVeiculo financiamentoVeiculo =  new FinanciamentoVeiculo(250, veiculo);
		FinanciamentoVeiculoController financiamentoVeiculoController = new FinanciamentoVeiculoController(financiamentoVeiculo);
		Assert.assertEquals("Não e possível realizar o financiamento do veículo.", financiamentoVeiculoController.financiarVeiculo());
	}

}
