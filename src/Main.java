// Importamos las clases necesarias
import java.util.ArrayList;  // Para manejar listas dinámicas de participantes
import java.util.Scanner;   // Para capturar entradas del usuario por consola

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializamos el lector de datos desde consola
        ArrayList<Participante> participantes = new ArrayList<>(); // Lista donde se almacenarán todos los participantes registrados

        int opcion;
        // Ciclo do-while para mostrar el menú hasta que el usuario decida salir (opción 0)
        do {
            // Mostramos el menú principal
            System.out.println("\n--- MENÚ CONCURSO DE NATACIÓN ---");
            System.out.println("1. Registrar Participante");
            System.out.println("2. Ver lista de participantes");
            System.out.println("3. Ver participantes que pueden concursar");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();      // Leemos la opción elegida
            scanner.nextLine();              // Limpieza del buffer para leer Strings correctamente

            switch (opcion) {
                case 1:
                    // Registro de un nuevo participante
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Género: ");
                    String genero = scanner.nextLine();

                    System.out.print("Salud buena (true/false): ");
                    boolean salud = scanner.nextBoolean();
                    scanner.nextLine();

                    // Selección del tipo de entidad
                    System.out.println("Tipo de entidad (1.Colegio 2.Universidad 3.Empresa 4.Sindicato): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    Participante p = null; // Se declara la variable tipo Participante para instanciar según el tipo

                    // Submenú que determina la subclase a instanciar según tipo de entidad
                    switch (tipo) {
                        case 1:
                            System.out.print("Nombre del Colegio: ");
                            String colegio = scanner.nextLine();
                            p = new ParticipanteColegio(nombre, edad, genero, salud, colegio); // Instancia de subclase Colegio
                            break;
                        case 2:
                            System.out.print("Nombre de la Universidad: ");
                            String universidad = scanner.nextLine();
                            p = new ParticipanteUniversidad(nombre, edad, genero, salud, universidad); // Subclase Universidad
                            break;
                        case 3:
                            System.out.print("Tipo de Empresa (Pública o Privada): ");
                            String empresa = scanner.nextLine();
                            p = new ParticipanteEmpresa(nombre, edad, genero, salud, empresa); // Subclase Empresa
                            break;
                        case 4:
                            System.out.print("Tipo de Sindicato: ");
                            String sindicato = scanner.nextLine();
                            p = new ParticipanteSindicato(nombre, edad, genero, salud, sindicato); // Subclase Sindicato
                            break;
                        default:
                            System.out.println("Opción inválida."); // Si el tipo no es válido
                    }

                    // Si se pudo crear correctamente el objeto Participante (no es nulo), se agrega a la lista
                    if (p != null) {
                        participantes.add(p);
                        System.out.println("Participante registrado con éxito.");
                    }
                    break;

                case 2:
                    // Mostramos todos los participantes registrados
                    System.out.println("\n--- Lista de Participantes Registrados ---");
                    for (Participante participante : participantes) {
                        System.out.println(participante.getInfo()); // Mostramos su información usando polimorfismo
                    }
                    break;

                case 3:
                    // Mostramos solo los que cumplen los requisitos para participar
                    System.out.println("\n--- Participantes Aptos para el Concurso ---");
                    for (Participante participante : participantes) {
                        if (participante.puedeParticipar()) { // Se valida usando el método de la clase base
                            System.out.println(participante.getInfo()); // Solo si puede participar
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema..."); // Salida del programa
                    break;

                default:
                    System.out.println("Opción no válida."); // Si el usuario ingresó una opción no reconocida
            }
        } while (opcion != 0); // El ciclo se repite mientras la opción no sea salir
        scanner.close(); // Cerramos el lector de entrada para liberar recursos
    }
}
