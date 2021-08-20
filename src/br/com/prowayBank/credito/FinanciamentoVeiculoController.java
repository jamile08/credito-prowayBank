package br.com.prowayBank.credito;

public class FinanciamentoVeiculoController {
	
	FinanciamentoVeiculo financiamentoVeiculo;

	public FinanciamentoVeiculoController(FinanciamentoVeiculo financiamentoVeiculo) {
		this.financiamentoVeiculo = financiamentoVeiculo;
	}
	

	/**
	 * M�todo que analisa se � poss�vel realizar o financiamento de um ve�culo de
	 * acordo com os dados fornecidos.
	 * 
	 * @param tipoVeiculo
	 * @param anoVeiculo
	 * @param valorVeiculo
	 * @param marcaVeiculo
	 * @param situacaoVeiculo
	 * @return
	 */
	public String financiarVeiculo() {
		String resultado = "Pedido de financiamento aceito.";

		if ((this.financiamentoVeiculo.getScoreSerasa() < 301 && (this.financiamentoVeiculo.getVeiculo().getTipoVeiculo() == TipoVeiculo.MOTO && this.financiamentoVeiculo.getVeiculo().getSituacaoVeiculo() == SituacaoVeiculo.NOVO))
				|| (this.financiamentoVeiculo.getScoreSerasa() < 701 && (this.financiamentoVeiculo.getVeiculo().getTipoVeiculo() == TipoVeiculo.IATE || this.financiamentoVeiculo.getVeiculo().getTipoVeiculo() == TipoVeiculo.LIMOUSINE))) {
			resultado = "N�o e poss�vel realizar o financiamento do ve�culo.";
		}

		return resultado;
	}

}
