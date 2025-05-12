import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> listaCompetidores = new ArrayList<>();
        Map<String, Integer> participantes = new HashMap<>();
        //Carrera f1 = new Carrera(listaCompetidores, EstadoCompetencia.EN_CURSO, "rocoso", 30,);
    /* f1.setCompetidores(f1.agregarParticipante("Miku"));
       f1.setCompetidores(f1.agregarParticipante("Josepe"));

       f1.setTiempoCarro1(40);
       f1.setTiempoCarro2(56);
       f1.mostrarCompetencia();
       System.out.println("-------------------------------");
       f1.iniciarTorneo();
       System.out.println(f1.daterminarGanador() + " tremend@ ganad@r");
       System.out.print("tiempo: " + f1.detMenortiempo());

    */

        Carrera carrera = new Carrera(listaCompetidores, EstadoCompetencia.EN_CURSO, "Senda arcoiris",
                60, participantes);

        carrera.agregarParticipante("El Pepe");
        carrera.agregarParticipante("Potaxio");
        carrera.agregarParticipante("Eso Tilin");
        //Antes de empezar la cerrera
        carrera.mostrarCompetencia();
        //La carrera ha iniciado
        carrera.iniciarTorneo();
        participantes.put("Mauricio", 50);
        participantes.put("Potaxio", 64);
        participantes.put("Pepsiman",55);
        //La carrera ha terminado
        carrera.setEstadoCompetencia(EstadoCompetencia.FINALIZADA);
        carrera.mostrarCompetencia();
        System.out.println("Ganador de la carrera: " + carrera.daterminarGanador());

    }
}