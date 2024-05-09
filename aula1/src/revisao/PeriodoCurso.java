package revisao;

public enum PeriodoCurso {

	INTEGRAL("Seg e Qua", 40, 1500.), 
	MANHA("Ter e Qui", 80, 3000.),
	TARDE("Sex", 20, 1000.);

	private String dias;
	private Integer cargaHoraria;
	private Double valor;

	private PeriodoCurso(String dias, Integer cargaHoraria, Double valor) {
		this.dias = dias;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
}