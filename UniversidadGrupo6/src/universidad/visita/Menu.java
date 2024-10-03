/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.visita;

import java.time.LocalDate;
import java.util.Scanner;
import universidad.AccesoADatos.AlumnoData;
import universidad.Entidades.Alumno;

/**
 *
 * @author Celi Leandro
 */
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        LocalDate fecha = LocalDate.now();
//      //  Alumno a1 = new Alumno(33333333, "Celi", "Leandro", fecha, true);
//
//          AlumnoData test = new AlumnoData();
//          test.guardarAlumno(a1);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menú de Ingreso de Datos");
            System.out.println("1. Ingresar nuevo alumno");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del Scanner

            switch (opcion) {
                case 1:
                    // Ingresar datos del alumno
                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese la fecha de nacimiento del alumno (YYYY-MM-DD): ");
                    String fechaNacStr = scanner.nextLine();
                    LocalDate fechaNac = LocalDate.parse(fechaNacStr);

                    System.out.print("Ingrese el DNI del alumno: ");
                    int dni = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    System.out.print("¿El alumno está activo? (true/false): ");
                    boolean activo = scanner.nextBoolean();
                    scanner.nextLine(); // Limpiar el buffer

                    // Crear un objeto Alumno
                    Alumno a1 = new Alumno(dni, apellido, nombre, fechaNac, true);
                    AlumnoData test = new AlumnoData();
                    test.guardarAlumno(a1);
                     break;

                    case 2:
                        continuar = false; // Salir del bucle
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                }
                 
            }
        }
    
}
