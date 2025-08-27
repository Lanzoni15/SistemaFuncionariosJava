public class Estagiario extends Funcionario {

    double salarioComBonus;

    public void bonusEstagiario() {
        double bonus = getSalario() * 0.05;
        salarioComBonus = getSalario() + bonus;
        System.out.println("Salário + bônus: " + salarioComBonus);
    }
}
