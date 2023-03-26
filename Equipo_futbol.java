public class Equipo_futbol implements Equipo{
    
    //Nombre del equipo
    private String nombreEquipo;
    //Goles del equipo
    private int goles;
    //Partidos jugados por el equipo
    private int partidosJugados;
    //Goles a favor del equipo
    private int golesFavor;
    //Goles en contra del equipo
    private int golesContra;
    //Victorias a favor del equipo
    private int victorias;
    //Derrotas en contra del equipo
    private int derrotas;
    //Empates del equipo
    private int empates;
    //Puntuación del equipo
    private int puntuacion;

    Equipo_futbol() {
    }

    Equipo_futbol(String nombre) {
        this.nombreEquipo=nombre;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo=nombreEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setGoles() {
        int goles = (int) (Math.random() * (4-0+1) + 0);
        setGolesFavor(goles);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setPartidosJugados() {
        partidosJugados++;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setGolesFavor(int goles) {
        this.golesFavor += goles;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra=golesContra;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setVictorias() {
        victorias++;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setDerrotas() {
        derrotas++;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setEmpates() {
        empates++;
    }

    public int getEmpates() {
        return empates;
    }

    public void setPuntuacion() {
        puntuacion++;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}