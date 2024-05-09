package revisao;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
		alunos.add("Bruna");
		alunos.add("Luis");
		alunos.add("Apolo");
		alunos.add("Matheus");
		alunos.add("Guilherme");
		alunos.add("Sávio");
		alunos.add("Vitória");
		
		for (Object object : alunos) {
			System.out.println(object);
		}

	}

}
