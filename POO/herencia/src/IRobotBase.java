abstract public class IRobotBase implements IRobot {

    private boolean encendido;


    final public void apagar(){ //"final" evita que el metodo pueda ser sobreescrito en otra clase
        System.out.println("Apagado");
    }
    public void mover(){
        System.out.println("Menea la cadera");
    }
    final public void abierto(){
        System.out.println("Encendido");
    }

    abstract public void realizarTarea();


}
