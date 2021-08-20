package br.com.prowayBank.credito;

public class FinanciamentoVeiculo {
	
	private Integer scoreSerasa;
	private Veiculo veiculo;	

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

		if ((this.scoreSerasa < 301 && (this.veiculo.getTipoVeiculo() != TipoVeiculo.MOTO && this.veiculo.getSituacaoVeiculo() == SituacaoVeiculo.NOVO))
				|| (this.scoreSerasa < 701 && (this.veiculo.getTipoVeiculo() == TipoVeiculo.IATE || this.veiculo.getTipoVeiculo() == TipoVeiculo.LIMOUSINE))) {
			resultado = "Nao e possivel realizar o financiamento do veiculo.";
		}

		return resultado;
	}

	
	/**
	 * Retorna o score do serasa da pessoa que deseja financiar.
	 * @return
	 */	
	public Integer getScoreSerasa() {
		return scoreSerasa;
	}
	/**
	 * Altera o score do serasa da pessoa que deseja financiar.	
	 * @param scoreSerasa
	 */
	public void setScoreSerasa(Integer scoreSerasa) {
		this.scoreSerasa = scoreSerasa;
	}
	
	/**
	 * Retorna o veiculo que será financiado.
	 * @return
	 */
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	/**
	 * Altera o veiculo que será financiado.
	 * @param veiculo
	 */
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
