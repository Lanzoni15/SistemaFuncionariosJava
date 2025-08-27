public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Estagiario estagiario = new Estagiario();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        System.out.println("=============");
        gerente.setNome("Arthur");
        gerente.setSalario(2300);

        System.out.println(gerente.getNome());
        gerente.bonusGerente();

        System.out.println("=============");
        estagiario.setNome("Nadia");
        estagiario.setSalario(1900);

        System.out.println(estagiario.getNome());
        estagiario.bonusEstagiario();
        System.out.println("=============");

        desenvolvedor.setNome("Pablo");
        desenvolvedor.setSalario(3100);

        System.out.println(desenvolvedor.getNome());
        desenvolvedor.bonusDesenvolvedor();
        System.out.println("=============");

    }
}