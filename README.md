# Sistema de Funcionários em Java

Este projeto é um sistema simples para cadastrar diferentes tipos de funcionários de uma empresa e calcular seus salários finais com base em bônus específicos.

## Funcionalidades

- Cadastro de funcionários do tipo Gerente, Desenvolvedor ou Estagiário.
- Cada tipo de funcionário possui um cálculo de bônus diferente:
  - **Gerente:** 20% de bônus
  - **Desenvolvedor:** 10% de bônus
  - **Estagiário:** 5% de bônus
- Impressão de uma lista com o nome, cargo e salário final de cada funcionário.
- Uso de **herança** e **polimorfismo** para cálculo do salário final.

## Estrutura de Classes

- `Funcionario`: classe base com atributos `nome` e `salario`.
- `Gerente`, `Desenvolvedor`, `Estagiario`: subclasses que sobrescrevem o método de cálculo do salário com bônus.

## Como Usar

1. Clone o repositório:

   ```bash
   git clone https://github.com/Lanzoni15/SistemaFuncionariosJava.git
   cd SistemaFuncionariosJava
   ```

2. Compile o projeto:

   ```bash
   javac src/**/*.java
   ```

3. Execute o projeto:

   ```bash
   java -cp src Main
   ```
4. Siga as instruções no terminal para cadastrar os funcionários.

## Autor

Arthur Lanzoni