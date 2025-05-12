import java.util.ArrayList;
import java.util.List;

public abstract class Competencia implements ITorneo {
    private List<String> competidores;
    private EstadoCompetencia estadoCompetencia; // Finalizado, en curso, pendiente, cancelado


    public Competencia() {}
    public Competencia(List<String>competidores,EstadoCompetencia estadoCompetencia) {
        this.competidores = competidores;
        this.estadoCompetencia = estadoCompetencia;
    }

    public List<String> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<String> competidores) {
        this.competidores = competidores;
    }

    public EstadoCompetencia getEstadoCompetencia() {
        return estadoCompetencia;
    }

    public void setEstadoCompetencia(EstadoCompetencia estadoCompetencia) {
        this.estadoCompetencia = estadoCompetencia;
    }

    /// /////////////////////////////////////////////////////////////////////
    public List<String> agregarParticipante(String nombre){
        this.competidores.add(nombre);
        return this.competidores;
    };

    public abstract void iniciarTorneo();

    public abstract String daterminarGanador();

    public abstract void mostrarCompetencia();

}
