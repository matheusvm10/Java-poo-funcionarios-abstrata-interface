public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", 5000.0, "12345", 1500.0);
        Desenvolvedor dev = new Desenvolvedor("Mariana Oliveira", 4000.0, "Java");

        System.out.println("=== SISTEMA DE FUNCIONÁRIOS ===");
        gerente.exibirInfo();
        System.out.println("Autenticação Gerente: " + (gerente.autenticar("12345") ? "Sucesso" : "Falha"));
        System.out.println("----------------");
        dev.exibirInfo();
    }
}