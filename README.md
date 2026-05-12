# exercicio

Uma empresa deseja desenvolver um sistema para gerenciar pagamentos de funcionários. Para isso, implemente uma hierarquia de classes em Java seguindo os requisitos abaixo:

a) Crie uma interface Pagamento contendo o método:

realizarPagamento(double valor)

b) Crie uma classe abstrata Funcionario com os atributos privados:
- nome
- salario

A classe deve possuir:
- construtor;
- métodos de acesso (getters/setters);
- método abstrato calcularBonus().

c) Crie as subclasses:
- Gerente
- Estagiario

As duas classes devem:
- herdar de Funcionario;
- implementar a interface Pagamento.

Além disso:
- o bônus do Gerente deve ser equivalente a 20% do salário;
- o bônus do Estagiario deve ser equivalente a 5% do salário.

d) Implemente o método realizarPagamento() em cada subclasse exibindo mensagens apropriadas para cada tipo de funcionário.

e) Na classe principal:
- utilize uma coleção ArrayList<Funcionario> para armazenar os funcionários;
- permita cadastrar funcionários;
- exiba nome, salário e bônus de cada funcionário;
- demonstre o polimorfismo chamando os métodos sobrescritos através da lista.

f) Utilize tratamento de exceções (try-catch) para:
- entradas inválidas;
- salário negativo;
- nome vazio.
