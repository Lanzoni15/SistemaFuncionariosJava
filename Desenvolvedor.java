public class Desenvolvedor extends Funcionario{

    double salarioComBonus;

    public void bonusDesenvolvedor() {
        double bonus = getSalario() * 0.05;
        salarioComBonus = getSalario() + bonus;
        System.out.println("Salário + bônus: " + salarioComBonus);
    }

}
