package firstpackage;

public class ContaPoupanca extends Conta  {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void ContaPoupnca(Cliente ana) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato Conta Poupança ===");
		super.imprimirInfosComuns();

    }
	
	
}
