package br.com.prowayBank.credito;

public class Veiculo {
	
	private Integer anoVeiculo;
	private Double valorVeiculo;
	private String marcaVeiculo;
	private TipoVeiculo tipoVeiculo;
	private SituacaoVeiculo situacaoVeiculo;
	
	public Veiculo(Integer anoVeiculo, Double valorVeiculo, String marcaVeiculo, TipoVeiculo tipoVeiculo,
			SituacaoVeiculo situacaoVeiculo) {
		this.anoVeiculo = anoVeiculo;
		this.valorVeiculo = valorVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.tipoVeiculo = tipoVeiculo;
		this.situacaoVeiculo = situacaoVeiculo;
	}
	
	/**
	 * Retorna o ano do ve�culo.
	 * @return
	 */
	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	/**
	 * Altera o ano do ve�culo.
	 * @param anoVeiculo
	 */
	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	/**
	 * Retorna o valor do ve�culo.
	 * @return
	 */	
	public Double getValorVeiculo() {
		return valorVeiculo;
	}

	/**
	 * Altera o valor do ve�culo.
	 * @param valorVeiculo
	 */
	public void setValorVeiculo(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	/**
	 * Retorna a marca do ve�culo. 
	 * @return
	 */
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	/**
	 * Altera a marca do ve�culo.
	 * @param marcaVeiculo
	 */
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	/**
	 * Retorna o tipo do ve�culo.
	 * @return
	 */
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	/**
	 * Altera o tipo do ve�culo.
	 * @param tipoVeiculo
	 */
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	/**
	 * Retorna a situa��o do ve�culo.
	 * @return
	 */
	public SituacaoVeiculo getSituacaoVeiculo() {
		return situacaoVeiculo;
	}

	/**
	 * Altera a situa��o do ve�culo.
	 * @param situacaoVeiculo
	 */
	public void setSituacaoVeiculo(SituacaoVeiculo situacaoVeiculo) {
		this.situacaoVeiculo = situacaoVeiculo;
	}
	
}
