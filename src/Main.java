public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Area
        Area areaCalculator = new Area();
        Area areaCalculator2 = new Area();
        Area areaCalculator3 = new Area();
        areaCalculator.calculaArea(5);
        areaCalculator.calcularArea(5,7);
        areaCalculator.calcularArea(4, true);
        System.out.println("Quadrado " + areaCalculator);
        System.out.println("Retangulo " + areaCalculator2);
        System.out.println("Circulo " + areaCalculator3);
    }
}
