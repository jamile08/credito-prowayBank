package br.com.prowayBank.credito;

public class FinanciamentoVeiculo {
	
	Integer scoreSerasa;
	Veiculo veiculo;	

	public FinanciamentoVeiculo(Integer scoreSerasa, Veiculo veiculo) {
		this.scoreSerasa = scoreSerasa;
		this.veiculo = veiculo;
	}

	/**
	 * Método que analisa se é possível realizar o financiamento de um veículo de
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

		if ((this.scoreSerasa < 301 && (this.veiculo.tipoVeiculo != TipoVeiculo.MOTO && this.veiculo.situacaoVeiculo == SituacaoVeiculo.NOVO))
				|| (this.scoreSerasa < 701 && (this.veiculo.tipoVeiculo == TipoVeiculo.IATE || this.veiculo.tipoVeiculo == TipoVeiculo.LIMOUSINE))) {
			resultado = "Nao e possivel realizar o financiamento do veiculo.";
		}

		return resultado;
	}
}
