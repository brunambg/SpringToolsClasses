package revisao;

public class ExemploVetor {

	
	public static void main(String[] args) {
		//String[] cores = new String[5];
		//cores[0] = "Laranja";
		//cores[3] = "Branco";
		
		//System.out.println(cores[2]);
		
		//String[] times = {"Flamengo","Bangu","Vasco"};
		
		ContaCorrente[] cc = new ContaCorrente[2];
		cc[0] = new ContaCorrente("Mariana", 2000.);
		cc[1] = new ContaCorrente("Marcos", 1900.);
		
		for (int i = 0; i < cc.length; i++) {
			System.out.println(cc[i]);
		}
	}

}
