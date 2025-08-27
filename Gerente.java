public class Gerente extends Funcionario {

    double salarioComBonus;

    public void bonusGerente() {
        double bonus = getSalario() * 0.20;
        salarioComBonus = getSalario() + bonus;
        System.out.println("Salário + bônus: " + salarioComBonus);
    }
}
