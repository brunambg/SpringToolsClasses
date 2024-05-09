package revisao;

import java.util.Arrays;
import java.util.List;

public class ExemploLista2 {

	public static void main(String[] args) {
		List<String> setores = Arrays.asList("Rh","Compras","Dp","CPD","Financeiro");
		
		for (String setor : setores) {
			System.out.println(setor);
		}
	}

}
