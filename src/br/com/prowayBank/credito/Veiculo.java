package br.com.prowayBank.credito;

public class Veiculo {
	
	Integer anoVeiculo;
	Double valorVeiculo;
	String marcaVeiculo;
	TipoVeiculo tipoVeiculo;
	SituacaoVeiculo situacaoVeiculo;
	
	public Veiculo(Integer anoVeiculo, Double valorVeiculo, String marcaVeiculo, TipoVeiculo tipoVeiculo,
			SituacaoVeiculo situacaoVeiculo) {
		this.anoVeiculo = anoVeiculo;
		this.valorVeiculo = valorVeiculo;
		this.marcaVeiculo = marcaVeiculo;
		this.tipoVeiculo = tipoVeiculo;
		this.situacaoVeiculo = situacaoVeiculo;
	}

	public Integer getAnoVeiculo() {
		return anoVeiculo;
	}

	public void setAnoVeiculo(Integer anoVeiculo) {
		this.anoVeiculo = anoVeiculo;
	}

	public Double getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(Double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public SituacaoVeiculo getSituacaoVeiculo() {
		return situacaoVeiculo;
	}

	public void setSituacaoVeiculo(SituacaoVeiculo situacaoVeiculo) {
		this.situacaoVeiculo = situacaoVeiculo;
	}
	
}
