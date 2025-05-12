public class Circulo extends FiguraGeometrica{

    double radio;

    public Circulo(){}
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (3.1416*(radio*radio));
    }
}
