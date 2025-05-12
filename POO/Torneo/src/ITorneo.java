import java.util.List;
public interface ITorneo {
    List<String> agregarParticipante(String nombre);
    void iniciarTorneo();
    String daterminarGanador();
}
