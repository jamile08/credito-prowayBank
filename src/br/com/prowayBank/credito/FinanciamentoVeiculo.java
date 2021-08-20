package br.com.prowayBank.credito;

public class FinanciamentoVeiculo {
	
	private Integer scoreSerasa;
	private Veiculo veiculo;	

	public FinanciamentoVeiculo(Integer scoreSerasa, Veiculo veiculo) {
		this.scoreSerasa = scoreSerasa;
		this.veiculo = veiculo;
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
