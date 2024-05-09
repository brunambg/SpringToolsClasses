package revisao;

public class TesteConta {

	public static void main(String[] args) {
		try {
			ContaCorrente cc = new ContaCorrente("João", 1000.);
			cc.saque(2000);
			System.out.println(cc);
		} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}

	}

}
