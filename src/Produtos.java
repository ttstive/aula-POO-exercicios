public class Produtos {

    private String nome;
    private String codigo;
    private double preco;

    // Construtor
    public Produtos(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    // Método para exibir nome e código
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
    }

    // Método para exibir nome, código e preço
    public void exibirInformacoes(boolean detalhes) {
        if (detalhes) {
            System.out.println("Nome: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço: " + preco);
        }
    }
}
