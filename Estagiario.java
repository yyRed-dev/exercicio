package exercicio;

public class Estagiario extends Funcionario implements Pagamento {

	public 	Estagiario (String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double calcularBonus() {
		return getSalario()*0.05;
	}

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamendo do Estagiario realizado. Valor: " + valor);
		
	}
	
}