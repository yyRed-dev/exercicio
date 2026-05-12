package exercicio;

public class Gerente extends Funcionario implements Pagamento {

	public Gerente (String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularBonus() {
		return getSalario()*0.2;
	}

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamendo do Gerente realizado. Valor: " + valor);
	
	}
	
}