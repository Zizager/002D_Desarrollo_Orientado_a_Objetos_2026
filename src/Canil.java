public class Canil {
    public static void main(String[] args) { 
    System.out.println("***Bienvenido al Caníl***");

    Perro perro_del_profe= new Perro();
    perro_del_profe.nombre="Gimli";
    perro_del_profe.edad=6;
    perro_del_profe.peso=40.5;
    perro_del_profe.tiene_vacuna= false;

    Perro mi_perro= new Perro();
    mi_perro.nombre= "Pible";
    mi_perro.edad= 3;
    mi_perro.peso= 20;
    mi_perro.tiene_vacuna= true;
    if (perro_del_profe.edad>=2) {
        System.out.println("La Gimli tiene mas de 2 años. Su edad es " + perro_del_profe.edad);
    }else{
        System.out.println("La Gimli tiene menos de 2 años. Su edad es de " + perro_del_profe.edad);
    }

    if (perro_del_profe.peso>20) {
        System.out.println("Es un perro waton");  
    } else{
        System.out.println("No es un perro waton");
    }
    if (perro_del_profe.tiene_vacuna==true) {
        System.out.println("El perro puede ingresar al Caníl"); 
    } else{
        System.out.println("El perro no puede ingresar al Caníl");
    }
    System.out.println("Gracias por su visita");

    }

}
