public class Liga_futbol implements Liga {

    private String nombreLiga;

    Liga_futbol() {
    }

    Liga_futbol(String nombre) {
        this.nombreLiga=nombre;
        rellenarEquipos();
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    private void rellenarEquipos() {
        Equipo_futbol equipo1 = new Equipo_futbol("FC Barcelona");
        Equipo_futbol equipo2 = new Equipo_futbol("Sevilla FC");
        Equipo_futbol equipo3 = new Equipo_futbol("Real Betis Balompié");
        Equipo_futbol equipo4 = new Equipo_futbol("Real Sociedad de Futbol");
        Equipo_futbol equipo5 = new Equipo_futbol("Villareal CF");
        Equipo_futbol equipo6 = new Equipo_futbol("Getafe CF");
        Equipo_futbol equipo7 = new Equipo_futbol("RCD Mallorca");
        Equipo_futbol equipo8 = new Equipo_futbol("Athletic Club");
        Equipo_futbol equipo9 = new Equipo_futbol("CA Osasuna");
        Equipo_futbol equipo10 = new Equipo_futbol("Rayo Vallecano de Madrid");
        Equipo_futbol equipo11 = new Equipo_futbol("RCD Espanyol de Barcelona");
        Equipo_futbol equipo12 = new Equipo_futbol("Cádiz CF");
        Equipo_futbol equipo13 = new Equipo_futbol("UD Almería");
        Equipo_futbol equipo14 = new Equipo_futbol("RC Celta de Vigo");
        Equipo_futbol equipo15 = new Equipo_futbol("Levante UD");
        Equipo_futbol equipo16 = new Equipo_futbol("Granada CF");
        Equipo_futbol equipo17 = new Equipo_futbol("Deportivo Alavés");
        Equipo_futbol equipo18 = new Equipo_futbol("Real Madrid CF");
        Equipo_futbol equipo19 = new Equipo_futbol("Club Atlético de Madrid");
        Equipo_futbol equipo20 = new Equipo_futbol("Girona");
        Equipo_futbol equipo21 = new Equipo_futbol("Valladolid");
        Equipo_futbol equipo22 = new Equipo_futbol("Elche CF");

        equipos[0] = equipo1;
        equipos[1] = equipo2;
        equipos[2] = equipo3;
        equipos[3] = equipo4;
        equipos[4] = equipo5;
        equipos[5] = equipo6;
        equipos[6] = equipo7;
        equipos[7] = equipo8;
        equipos[8] = equipo9;
        equipos[9] = equipo10;
        equipos[10] = equipo11;
        equipos[11] = equipo12;
        equipos[12] = equipo13;
        equipos[13] = equipo14;
        equipos[14] = equipo15;
        equipos[15] = equipo16;
        equipos[16] = equipo17;
        equipos[17] = equipo18;
        equipos[18] = equipo19;
        equipos[19] = equipo20;
        equipos[20] = equipo21;
        equipos[21] = equipo22;
    }

    public void calcularJornada(int jornada) {

        if ((jornada % 2)==0) {
            System.out.println("\n"+"Ida"+"\n");
        } else {
            System.out.println("\n"+"Vuelta"+"\n");
        }

        for (int i = 0; i<=21; i = i + 2) {

            equipos[i].setPartidosJugados();
            equipos[i+1].setPartidosJugados();

            equipos[i].setGoles();
            equipos[i+1].setGoles();

            equipos[i].setGolesContra(equipos[i+1].getGoles());
            equipos[i+1].setGolesContra(equipos[i].getGoles());

            if (equipos[i].getGoles()>equipos[i+1].getGoles()) {
                System.out.println("Ganó el "+equipos[i].getNombreEquipo() + " al " + equipos[i+1].getNombreEquipo() + " con un resultado de " + equipos[i].getGoles() + " - " + equipos[i+1].getGoles());
                System.out.println("--------------------------------------------------------------------------------------------");
                equipos[i].setVictorias();
                equipos[i].setPuntuacion();
                equipos[i+1].setDerrotas();

            } else if (equipos[i].getGoles()<equipos[i+1].getGoles()) {
                System.out.println("Ganó el "+equipos[i+1].getNombreEquipo() + " al " + equipos[i].getNombreEquipo() + " con un resultado de " + equipos[i+1].getGoles() + " - " + equipos[i].getGoles());
                System.out.println("--------------------------------------------------------------------------------------------");
                equipos[i+1].setVictorias();
                equipos[i+1].setPuntuacion();
                equipos[i].setDerrotas();

            } else {
                System.out.println("Empataron el " + equipos[i].getNombreEquipo() + " y el " + equipos[i+1].getNombreEquipo() + " con un resultado de: " + equipos[i].getGoles() + " - " + equipos[i+1].getGoles());
                System.out.println("--------------------------------------------------------------------------------------------");
                equipos[i].setEmpates();
                equipos[i+1].setEmpates();
            }
        }
    }

    public void consultarTabla() {
        Equipo_futbol aux = new Equipo_futbol();
        for (int i = 0;i<22;i++) {
            for (int j = 0; j < 22 - 1; j++) {
                if (equipos[j].getVictorias() < equipos[j + 1].getVictorias()) {
                    aux = equipos[j];
                    equipos[j] = equipos[j + 1];
                    equipos[j + 1] = aux;
                }
            }
        }

        for (Equipo_futbol e:equipos) {
            System.out.println(e.getNombreEquipo()+ "\n----------------------------------------" + "\nPartidos jugados: " + e.getPartidosJugados() + "\nVictorias: "+e.getVictorias() + "\nEmpates: "+e.getEmpates() + "\nDerrotas: "+e.getDerrotas() + "\nGoles a favor: " + e.getGolesFavor() + "\nGoles en contra: " + e.getGolesContra() + "\nPuntuación: "+e.getPuntuacion());
            System.out.println("----------------------------------------");
        }
    }
}