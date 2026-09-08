import  java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MostrarMenu();
    }
    

    static void MostrarMenu(){
        boolean mostrarMenu=true;
        System.out.println("*****Inicio de programa*****");

        while (mostrarMenu) {
            System.out.println("1. Probando Array");
            System.out.println("2. Probando ArrayList");
            System.out.println("9. Salir");

            System.out.println("Ingrese una opcion:");
            String opcion_menu = sc.nextLine();

            switch (opcion_menu){
                case "1":
                    ProbandoArray();
                    break;

                case "2":
                    ProbandoArrayList();
                    
                    break;
                case "9":
                    mostrarMenu= false;
                    break;
            
                default:
                    break;
            }
        }
    }
    static void ProbandoArray(){
        System.out.println("/////////////ESTUDIANTES///////////");

        String[] alumno = new String[6];
        alumno[0] = "Fernando Macías";
        alumno[1] = "Tomás Barria";
        alumno[2] = "Selena Figueroa";
        alumno[3] = "Cristian Mancilla";
        alumno[4] = "Francisco Almonacid";
        alumno[5] = "Manuel Vivar";

        Integer[] edades= new Integer[6];
        edades[0]= 23;
        edades[1]= 18;
        edades[2]= 20;
        edades[3]= 19;
        edades[4]= 20;
        edades[5]= 20;

        ///System.err.println("El estudiante " + alumnos[0] + " tiene " + edades[0] + " años ");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("El estudiante " + alumno[i] + " tiene " + edades[i] + " años ");
            }
    }
    static void ProbandoArrayList(){
        System.out.println("********Probando ArrayList**********");
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Rogelio Huichacura");
        alumnos.add("Zinedine Arjel");
        alumnos.add("Martin Cavero");
        alumnos.add("Gabriel Viveros");
        alumnos.add("Andrew Farías");
        alumnos.add("Nicole Aguilar");
        alumnos.add("Daniel Opazo");
        
        System.out.println(alumnos.get(5));

        alumnos.set(5, "Puly");

        System.out.println(alumnos.get(5));

        alumnos.remove(4);

        System.out.println(alumnos.get(4));

        System.out.println(alumnos.size());

        for (String por_cada_alumno : alumnos) {
            System.out.println(por_cada_alumno);
        }
        }
}

            


    
