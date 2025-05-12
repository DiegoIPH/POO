abstract public class Personina implements IPersona {

    private String nombre;
    private int anioNac;
    private boolean sexo;

    public Personina(){}

    public Personina(String nombre, int anioNac, boolean sexo){
        this.nombre = nombre;
        this.anioNac = anioNac;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNac() {
        return anioNac;
    }
    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }

    public boolean getSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    final public int calcularEdad() {
        return 2025-anioNac;
    }
    abstract public void estudiar();
}
