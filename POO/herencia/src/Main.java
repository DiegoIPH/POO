//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
        Informatico inf = new Informatico();
        inf.setNombre("Paco");
        inf.setEdad(21);

        System.out.println(inf.getNombre() + " " + inf.getEdad());
        inf.programar();
        inf.correr();
        **/

        IRobotIndustrial robo = new IRobotIndustrial();
        robo.abierto();
        robo.realizarTarea();
        robo.mover();
        System.out.println("---------------------------");
        IRobotDomestico robo1 = new IRobotDomestico();
        robo1.abierto();
        robo1.realizarTarea();
        robo1.mover();
    }
}