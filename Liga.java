public interface Liga {
    //Array que almacena los equipos
    Equipo_futbol[] equipos = new Equipo_futbol[22];

    //Calcula los resultados de los partidos
    void calcularJornada(int jornada);

    //Muestra los resultados de los partidos
    void consultarTabla();
}