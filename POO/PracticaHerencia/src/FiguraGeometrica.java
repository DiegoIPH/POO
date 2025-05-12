public abstract class FiguraGeometrica implements IMedible{

    Color color;

    public FiguraGeometrica(){}
    public FiguraGeometrica(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    final public void mostrarColor(){
        System.out.println("Color: " + color);
    }

    public abstract double calcularArea();
}
