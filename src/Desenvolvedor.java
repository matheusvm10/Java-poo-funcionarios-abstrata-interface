public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salarioBase, String linguagem) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return this.linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Linguagem: " + this.linguagem);
    }
}