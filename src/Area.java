public class Area {

    public double calculaArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean isCirculo) {
        if (isCirculo) {
            return 3.14 * raio * raio;
        }
        return 0;

    }



}
