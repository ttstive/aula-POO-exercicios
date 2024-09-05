public class ImpostoRenda {

    private double salario;

    // Método para definir o salário
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
    }

    // Método para obter o salário
    public double getSalario() {
        return salario;
    }

    // Método para calcular o imposto de renda
    public double calcularImposto() {
        double imposto;
        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 5000) {
            imposto = salario * 0.1;
        } else {
            imposto = salario * 0.2;
        }
        return imposto;
    }
}
