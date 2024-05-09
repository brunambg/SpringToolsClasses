package revisao;

public class Curso {
	private String nome;
	private PeriodoCurso periodo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public PeriodoCurso getPeriodo() {
		return periodo;
	}
	public void setPeriodo(PeriodoCurso periodo) {
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", periodo=" + periodo + "]";
	}
	public Curso(String nome, PeriodoCurso periodo) {
		super();
		this.nome = nome;
		this.periodo = periodo;
	}
}
