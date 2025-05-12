import java.util.List;
import java.util.Scanner;

public class Alumno extends Personina{

    Scanner sc = new Scanner(System.in);
    private double cum;
    private List<Double> notas;

    public Alumno(){}
    public Alumno(double cum, String nombre, int edad, boolean sexo){
        this.setNombre(nombre);
        this.setAnioNac(edad);
        this.setSexo(sexo);
        this.cum=cum;
    }

    public double getCum() {
        return cum;
    }
    public void setCum(double cum) {
        this.cum = cum;
    }

    public List<Double> getNotas() {
        return notas;
    }
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public void estudiar(){
        System.out.println("Estudiando pal  parcial...");
    }

    public void calcularCUM(List<Double> n){
        for(int i=0; i<n.size(); i++){
            System.out.println(n.get(i));
            cum+=n.get(i);
        }
        System.out.println("El cum del estudiante es de: " + (cum/n.size()));
    }

}
