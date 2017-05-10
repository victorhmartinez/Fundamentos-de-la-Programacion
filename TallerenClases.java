/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerenclases;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class TallerenClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        // Declaracion de variables 
        int va1,va2,va3,va4,va5,va6,va7,va8,va9,va10,n,n1,op=0;
        int v1=0,v2,v3,v4,v5,v6,v7,v8,v9,suma,res, total,suma1;
       
        do{
        //Solicitud de ingreso de datos por pantalla
        System.out.println("Ingrese el primer numero de su cedula");
        va1=datos.nextInt();
        System.out.println("Ingrese el segundo numero de su cedula");
        va2=datos.nextInt();
        System.out.println("Ingrese el tercer numero de su cedula");
        va3=datos.nextInt();
        System.out.println("Ingrese el cuarto numero de su cedula");
        va4=datos.nextInt();
        System.out.println("Ingrese el quinto numero de su cedula");
        va5=datos.nextInt();
        System.out.println("Ingrese el sexto numero de su cedula");
        va6=datos.nextInt();
        System.out.println("Ingrese el septimo numero de su cedula");
        va7=datos.nextInt();
        System.out.println("Ingrese el  octavo numero de su cedula");
        va8=datos.nextInt();
        System.out.println("Ingrese el  noveno numero de su cedula");
        va9=datos.nextInt();
        System.out.println("Ingrese el decimo numero de su cedula ");
        va10=datos.nextInt();
        // Operaciones
         v1=2*va1;
        if (v1>9){
            v1=(v1-9);  
        }
          v3=2*va3;
          if (v3>9){
            v3=(v3-9);  
        }
          v5=2*va5;
          if (v5>9){
            v5=(v5-9);  
        }
          v7=2*va7;
          if (v7>9){
            v7=(v7-9);  
        }
          v9=2*va9;
          if (v9>9){
            v9=(v9-9);  
        }
       n=v1+v3+v5+v7+v9; 
                v2=1*va2;
                v4=1*va4;
                v6=1*va6;
                v8=1*va8;
       n1=v2+v4+v6+v8;
       suma=n+n1;
        res=suma%10;
        suma1=suma-res+10;
        //Muetra de datos
        System.out.println("El numero incrementado es "+suma1);
        total=suma1-suma;
        System.out.println(+total);
        if (total==va10){
             System.out.println("El numero de cedula que usted ingreso es correcto");
        }else{
            System.out.println("El numero de cedula que usted ingreso no es correcto");
            System.out.println("0. Salir.");
            System.out.println("1.Desea ingresar otro numero de cedula.");
            op=datos.nextInt();
        } 
         System.out.println("0. Salir.");
            System.out.println("1.Desea ingresar otro numero de cedula.");
            op=datos.nextInt();
        }while(op!=0);
    }
    
}
