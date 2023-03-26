public interface Equipo {
    /**
     * Devuelve el nombre del equipo
     * @return Nombre del equipo
     */
    String getNombreEquipo();

    ///Decide los goles del equipo
    void setGoles();

    /**
     * Devuelve los goles del equipo
     * @return Goles del equipo
     */
    int getGoles();

    //Marca los partidos jugados por el equipo
    void setPartidosJugados();

    /**
     * Devuelve los partidos jugados
     * @return Partidos jugados
     */
    int getPartidosJugados();

    //Marca los goles marcados por el equipo
    void setGolesFavor(int golesFavor);

    /**
     * Devuelve los goles a favor
     * @return Goles a favor
     */
    int getGolesFavor();

    //Marca los goles recibidos por el equipo
    void setGolesContra(int golesContra);

    /**
     * Devuelve los goles en contra
     * @return Goles en contra
     */
    int getGolesContra();

    //Marca las victorias del equipo
    void setVictorias();

    /**
     * Devuelve las victorias
     * @return Victorias
     */
    int getVictorias();

    //Marca las derrotas del equipo
    void setDerrotas();

    /**
     * Devuelve las derrotas
     * @return Derrotas
     */
    int getDerrotas();

    //Marca los empates del equipo
    void setEmpates();

    /**
     * Devuelve los empates
     * @return Empates
     */
    int getEmpates();

    //Marca la puntuación del equipo
    void setPuntuacion();

    /**
     * Devuelve la puntuacion
     * @return Puntuacion
     */
    int getPuntuacion();
}