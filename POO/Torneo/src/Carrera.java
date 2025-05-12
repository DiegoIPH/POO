import java.util.List;
import java.util.Map;

public class Carrera extends Competencia{

    private String tipoCamino;
    private int tiempoLimite;
//    private int tiempoCarro1;
//    private int tiempoCarro2;
    Map<String, Integer>carroxtiempo;

    public Carrera(){}
    public Carrera(List<String> competidores, EstadoCompetencia estadoCompetencia,String tipoCamino,
                   int tiempoLimite, Map<String, Integer>carroxtiempo) {
        super(competidores, estadoCompetencia);
        this.tipoCamino = tipoCamino;
        this.tiempoLimite = tiempoLimite;
        this.carroxtiempo = carroxtiempo;
//        this.tiempoCarro1 = tiempoCarro1;
//        this.tiempoCarro2 = tiempoCarro2;
    }

    public String getTipoCamino() {
        return tipoCamino;
    }

    public void setTipoCamino(String tipoCamino) {
        this.tipoCamino = tipoCamino;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(int tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

//    public int getTiempoCarro1() {
//        return tiempoCarro1;
//    }
//
//    public void setTiempoCarro1(int tiempoCarro1) {
//        this.tiempoCarro1 = tiempoCarro1;
//    }
//
//    public int getTiempoCarro2() {
//        return tiempoCarro2;
//    }
//
//    public void setTiempoCarro2(int tiempoCarro2) {
//        this.tiempoCarro2 = tiempoCarro2;
//    }

    public Map<String, Integer> getCarroxtiempo() {
        return carroxtiempo;
    }

    public void setCarroxtiempo(Map<String, Integer> carroxtiempo) {
        this.carroxtiempo = carroxtiempo;
    }

    @Override
    public String daterminarGanador(){
        /*String ganador = "tremendo_ganador";
        if (tiempoCarro1 < tiempoCarro2){
            return getCompetidores().get(0);
        }else{
            return getCompetidores().get(1);
       }*/
        String ganador = "";
        for(Map.Entry<String, Integer> i : carroxtiempo.entrySet()){

            if (i.getValue()<tiempoLimite){
                ganador= i.getKey() + " " + i.getValue();
            }
        }
        return ganador;
    }

/* public int detMenortiempo(){
        if (tiempoCarro1 < tiempoCarro2){
            return tiempoCarro1;
        }else{
            return tiempoCarro2;
        }
    }*/

    @Override
    public void mostrarCompetencia(){
        System.out.println("Carrera en camino: " + getTipoCamino());
        System.out.println("Limite tiempo: " + getTiempoLimite() + " minutos");
        System.out.println("Participantes: " + getCompetidores());
        System.out.println("Tiempos por corredor: " + getCarroxtiempo());
    }

    @Override
    public void iniciarTorneo() {
        System.out.println("---Iniciando Carrera---");
    }
}
