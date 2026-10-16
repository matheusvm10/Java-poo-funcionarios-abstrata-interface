public class Gerente extends Funcionario implements Autenticavel {
    private String senha;
    private double bonus;

    public Gerente(String nome, double salarioBase, String senha, double bonus) {
        super(nome, salarioBase);
        this.senha = senha;
        setBonus(bonus);
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            this.bonus = 0;
        }
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + this.bonus;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha != null && this.senha.equals(senha);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Bónus: R$ " + this.bonus);
    }
}