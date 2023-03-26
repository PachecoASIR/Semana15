/*
 * Cambios a realizar en el código para mejorarlo:
 * 1. Actualmente para puntuación solo cuentas las victorias, hay que hacer que cada victoria sume 3 y cada empate sume 1
 * 2. No hay límite de partidos en la Liga, establecer un límite de 42 partidos
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Liga_futbol liga1 = null;
        boolean existeLiga = false; // Comprueba si la liga existe
        int jornada = 1; // Variable utilizada para decidir si es ida o vuelta
        int opcion = 0; // Eleccion del switch

        do {
            System.out.println("¿Qué desea hacer?"+"\n"+"1. Crear una liga"+"\n"+"2. Jugar una liga"+"\n"+"3. Eliminar la liga actual"+"\n"+"0. Salir");
            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    sc.nextLine();
                    System.out.println("\n"+"Elija un nombre para la liga");
                    String nombre = sc.nextLine();
                    liga1 = new Liga_futbol(nombre);
                    existeLiga = true;
                    break;

                case 2:
                    if (existeLiga) {
                        int opcion2 = 0;
                        do {
                            System.out.println("\n"+"Qué desea hacer?"+"\n"+"1. Simular jornada"+"\n"+"2. Consultar tabla de resultados"+"\n"+"0. Pausar la liga");
                            opcion2 = sc.nextInt();
                            switch (opcion2) {

                                case 1:
                                    try {
                                        jornada++;
                                        liga1.calcularJornada(jornada);
                                    } catch (NullPointerException exception) {
                                        System.out.println("\n"+"Error, debe crear una liga");
                                    }
                                    break;

                                case 2:
                                    liga1.consultarTabla();
                                    break;
                                default:
                            }
                        } while (opcion2!=0);
                    } else {
                        System.out.println("\n"+"Debe crear una liga"+"\n");
                        break;
                    }
                    break;

                case 3:
                    if (existeLiga) {
                        System.out.println("\n"+"Seguro que quiere borrar la liga ("+liga1.getNombreLiga()+")?"+" \nEscriba Si o No");
                        String decision = sc.next();

                        if (decision.contains("Si")) {
                            liga1 = null;
                            existeLiga = false;
                            jornada = 1;
                            System.out.println("\n"+"Liga borrada"+"\n");
                            break;

                        } else {
                            System.out.println("\n"+"Ha cambiado de parecer");
                        }
                    }
                    System.out.println("\n"+"No existe ninguna liga"+"\n");
                    break;
                default:
            }
        } while (opcion!=0);
    }
}