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
	 * Retorna o ano do veículo.
	 * @return
	 */
	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	/**
	 * Altera o ano do veículo.
	 * @param anoVeiculo
	 */
	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	/**
	 * Retorna o valor do veículo.
	 * @return
	 */	
	public Double getValorVeiculo() {
		return valorVeiculo;
	}

	/**
	 * Altera o valor do veículo.
	 * @param valorVeiculo
	 */
	public void setValorVeiculo(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	/**
	 * Retorna a marca do veículo. 
	 * @return
	 */
	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	/**
	 * Altera a marca do veículo.
	 * @param marcaVeiculo
	 */
	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	/**
	 * Retorna o tipo do veículo.
	 * @return
	 */
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	/**
	 * Altera o tipo do veículo.
	 * @param tipoVeiculo
	 */
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	/**
	 * Retorna a situação do veículo.
	 * @return
	 */
	public SituacaoVeiculo getSituacaoVeiculo() {
		return situacaoVeiculo;
	}

	/**
	 * Altera a situação do veículo.
	 * @param situacaoVeiculo
	 */
	public void setSituacaoVeiculo(SituacaoVeiculo situacaoVeiculo) {
		this.situacaoVeiculo = situacaoVeiculo;
	}
	
}
