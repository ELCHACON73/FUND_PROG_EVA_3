/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        //Scanner input = new Scanner(System.in);
        //int[] arreglo = new int[5];
        perso1.nombre = "Chuy";
        perso1.apellido = "De la Cruz";
        perso1.edad = 73;
        System.out.println(perso1);
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona();
        perso2.nombre = "Miguel";
        perso2.apellido = "Hernandez";
        perso2.edad = 18;
        System.out.println(perso2);
        imprimirPersonas(perso2);
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Dirección " + perso);
        System.out.println("Nombre Completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
    
}
//SON PLANTILLAS
//SON TIPOS DE DATOS
class Persona{
    String nombre;
    String apellido;
    int edad;
}