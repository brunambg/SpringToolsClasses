package revisao;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.INTEGRAL);
		System.out.println(curso + "Período: "
				+curso.getPeriodo().getDias());

	}

}
