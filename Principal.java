public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        gerente.setNome("Arthur");
        gerente.setSalario(2300);

        gerente.bonusGerente();

    }
}