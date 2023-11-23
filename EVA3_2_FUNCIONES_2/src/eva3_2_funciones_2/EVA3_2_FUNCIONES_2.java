/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_funciones_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_2_FUNCIONES_2 {

    /**
     * @param args the command line arguments
     */
    static int x = 100;
    public static void main(String[] args) {
        // TODO code application logic here
       /* EVA3_2_FUNCIONES_2 objeto = new EVA3_2_FUNCIONES_2();
        System.out.println(objeto.x);
        Scanner input = new Scanner(System.in);*/
        int num1 = 100, num2 = 200;
        //SE USA EL VALOR DIRECTAMENTE DE LA FUNCIÓN
        System.out.println(buscarMax(num1,num2));
        //GUARDAMOS EL VALOR DEVUELTO PARA SU USO POSTERIOR
        int valor = buscarMax(num1,num2);
        System.out.println(valor);
        //SE EJECUTA LA FUNCIÓN, PERO IGNORAMOS EL RESULTADO
        buscarMax(num1,num2);
    }
    
    public static int buscarMax(int val1, int val2){
        /*int resu;
    if(val1 > val2)
        resu = val1;
    else
        resu = val2;
    
    return resu;*/
        
        if(val1 > val2)
            return val1;
        else
            return val2;
    }
}
