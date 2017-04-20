 Scanner datos = new Scanner(System.in);
         // creacion de variables
        
        String dia;
        
        // Ingreso de variables
        System.out.print("Ingrese el  dia \n");
        dia=datos.next();
        
        
        // menu de opciones
        switch(dia){
            case "Lunes":
                System.out.print("GP ");
                break;
            case "Martes":
                System.out.print("Contabilidad \n");
                break;
            case "Miercoles":
                System.out.print("Fundamentos de la Programacion \n");
                break;
            case "Jueves":
                System.out.print("Matematicas Discretas ");
                break;
            case "Viernes":
                System.out.print("Nada \n");
                break;              
            default :
                System.out.print("Ingrese un dia correcto ");
    }
        System.out.println("Tiene el dia "+dia);
    }
}
  

