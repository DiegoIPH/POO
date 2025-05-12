public class Informatico extends Persona{ //extends para heredar la clase

    private String especialidad;

    public Informatico(){}
    public Informatico(String especialidad){
        this.especialidad = especialidad;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void programar(){
        System.out.println("*Programo asterisco");
    }

    @Override
    //Cuando una clase use un metodo de una calse abstracta, se necesita sobreescribir
    public void correr(){
        System.out.println("*Correr");
    }

}
