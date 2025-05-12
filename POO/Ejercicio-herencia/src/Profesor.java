public class Profesor extends Personina{

    private String especialidad;

    public Profesor(){}
    public Profesor(String especialidad, String nombre, int edad, boolean sexo){
        this.especialidad = especialidad;
        this.setNombre(nombre);
        this.setAnioNac(edad);
        this.setSexo(sexo);
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando doctorado...");
    }

    public void ensenar(){
        System.out.println("Ensenando pal parcial de " + especialidad);
    }
}
