package revisao;

import javax.swing.JOptionPane;

public class ExemploExcessao {

	public static void main(String[] args) {
	//Calcular c = new Calcular();
	
		try {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º num."));	
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º num."));
			//System.out.println(Calcular.calcularDivisao(10,0));
		JOptionPane.showMessageDialog(null, Calcular.calcularDivisao(a, b));
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Erro na divisão");
		}
		

	}

}