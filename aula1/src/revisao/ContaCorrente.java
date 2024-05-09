package revisao;

public class ContaCorrente implements Conta{
	private String titular;
	private double saldo;
	
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [titular=" + titular + ", saldo=" + saldo + "]";
	}

	public ContaCorrente(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public void saque(double valor) {
		if (saldo < valor) {
			throw new RuntimeException("Saldo insuficiente");
		}
		
	}

	@Override
	public void deposito(double valor) {
		// TODO Auto-generated method stub
		
	}

}
