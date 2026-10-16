public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            this.salarioBase = 0;
        }
    }

    public abstract double calcularSalario();

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Base: R$ " + this.salarioBase);
        System.out.println("Salário Final: R$ " + calcularSalario());
    }
}