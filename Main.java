package exercicio;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	private Scanner sc;
	public void main (String[] args) {
	
		sc = new Scanner(System.in);
		
		int opcao = -1;
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.println("Sistema de Salarios");
		
		try {
			while(opcao != 0) {
				
				System.out.println("O que deseja fazer? "
						+ "\n1.Adicionar Funcionario."
						+ "\n2.Mostrar Funcionarios."
						+ "\n3.Pagar Salarios."
						+ "0. Finalizar.");
				opcao = sc.nextInt();
				
				switch(opcao) {
					case 1: // add funcionario
						System.out.println("Qual tipo de Funcionario deseja adicionar?"
								+ "\n1. Gerente."
								+ "\n2. Estagiario."
								+ "\n0. Voltar");
						int subOpcao = sc.nextInt();
						
						switch (subOpcao) {
							case 1: // gerente
								System.out.println("Qual o nome dele?");
								String nome = sc.nextLine();
								while (nome == "") {
									System.out.println("O nome não pode ser vazio. Coloque um nome valido!");
									nome = sc.nextLine();
								}
								System.out.println("Qual o salario dele?");
								double salario = sc.nextDouble();
								while (salario < 0) {
									System.out.println("O salario não pode ser inferior a 1. Por favor, coloque um valor adequado.");
									salario = sc.nextDouble();
								}
								
								funcionarios.add( new Gerente(nome,salario) );
								System.out.println("Gerente adicionado.");
								break;
								
							case 2: // estagiario
								System.out.println("Qual o nome dele?");
								nome = sc.nextLine();
								while (nome == "") {
									System.out.println("O nome não pode ser vazio. Coloque um nome valido!");
									nome = sc.nextLine();
								}
								System.out.println("Qual o salario dele?");
								salario = sc.nextDouble();
								while (salario < 0) {
									System.out.println("O salario não pode ser inferior a 1. Por favor, coloque um valor adequado.");
									salario = sc.nextDouble();
								}
								
								funcionarios.add( new Estagiario(nome,salario) );
								System.out.println("Estagiario adicionado.");
								break;
								
							default: // voltar
								break;
						}
						break;
					
					case 2: // mostrar funcionarios
						if ( funcionarios.isEmpty() ) {
							System.out.println("Sua lista de Funcionarios esta vazia, adicione um para podermos começar.");
							break;
							
						} else {
							System.out.println("Lista de Funcionarios: ");
							for (int i=0; i<funcionarios.size(); i++) {
								System.out.println("Funcionario " + i+1 +": ");
								System.out.print("Nome: " + ( funcionarios.get(i) ).getNome() + " | Salario: " + ( funcionarios.get(i) ).getSalario() );
							}
						}
						break;
					
					case 3: // fazer pagamento
						System.out.println("Realizando pagamentos...");
						for (int j=0; j< funcionarios.size(); j++) {
							((Pagamento) funcionarios.get(j)).realizarPagamento(
									funcionarios.get(j).getSalario()
								);
						}
						
						break;
					
					case 0: // morte
						System.out.println("Finalizando programa. Obrigado por utilizar!");
						break;
					
					default: // default
						System.out.println("Por favor, digite apenas valores validos para o sistema!");
						System.out.println("O que deseja fazer? "
							+ "\n1.Adicionar Funcionario."
							+ "\n2.Mostrar Funcionarios."
							+ "\n3.Pagar Salarios."
							+ "0. Finalizar.");
					
						opcao = sc.nextInt();
						break;
			}
				
			}
			
			
		}
		
		catch(Exception erro) {
			System.out.println("Um erro inesperado ocorreu. Reinicie o programa.");
		}
		
		
		
	}
}