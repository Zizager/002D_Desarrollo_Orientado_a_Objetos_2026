import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        show_Menu();

    }

    static void show_Menu(){
        Scanner scanner = new Scanner(System.in);
        Character player_character = new Character();
        boolean flag_menu= true;

        System.out.println("****WELCOME TO THE SEVEN KINGDOMS****");

        while (flag_menu) {
            System.out.println("1. CREATE CHARACTER");
            System.out.println("2. VISUALIZE CHARACTER");
            System.out.println("3. EXIT");

            System.out.println("CHOOSE AN OPTION");
        
            String user_option = scanner.nextLine();

            switch (user_option) {
                case "1":
                    System.out.println("Creating Character");
                    //Nombre del personaje
                    System.out.println("Ingrese un nombre: ");
                    player_character.name = scanner.nextLine();
                    //Vida del personaje
                    System.out.println("Ingrese los puntos de salud:");
                    //Esto es la forma no segura
                    //player_character.hit_points = Integer.parseInt(scanner.nextLine());

                    //Esto es con encapsulamiento
                    player_character.asignarVida(Integer.parseInt(scanner.nextLine()));
                    //Puntos de magia
                    System.out.println("Ingrese los puntos de magia:");
                    player_character.magic_points = Integer.parseInt(scanner.nextLine());
                    //Asignemos la edad
                    System.out.println("Ingrese la edad: ");
                    player_character.validarEdad(Integer.parseInt(scanner.nextLine()));

                    break;

                case "2":
                    System.out.println("Ver Personaje");
                    System.out.println("Nombre: " + player_character.name);
                    System.out.println("Vida del personaje: " + player_character.mostrarVida());
                    System.out.println("Maná del personaje: " + player_character.magic_points);
                    System.out.println("Edad del personaje: " + player_character.mostrarEdad());
                    break;
                case "3":
                    System.out.println("Gracias por jugar, Vuelva pronto");
                    flag_menu = false;
                    break;
            
                default:
                    System.out.println("OPCIÓN IVALIDA");
                    break;
            }
        }
    }
}
