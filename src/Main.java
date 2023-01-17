package src;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        controlador radioUvg = new controlador();
        Scanner teclado = new Scanner(System.in);
        String menuInicial = "1. Encender Radio\n2. salir";
        String menu = "1.Cambia de AM a FM \n2.Avanzar en el dial de las emisoras. Al llegar al final del dial inicia nuevamente. \n3.Permite guardar una emisora en uno de los 12 botones \n4.Permite seleccionar la emisora puesta en un botón \n5. Apagar el radio\n";
        int opcion = 1;
        System.out.println(menuInicial);
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion<2 && opcion>=1){
            switch (opcion){
                case 1: {
                radioUvg.turnOnOff();
                System.out.println("Radio encendida");  
                int op = 1;
                System.out.println(menu);
                System.out.println("Ingrese la opción que desea: ");
                op = teclado.nextInt();
                teclado.nextLine();
                while (op<5 && op>=1){
                    switch (op){ 
                        case 1:{
                            radioUvg.changeFrequence();
                            System.out.println(radioUvg.getFrequence());
                            System.out.println(menu);
                            System.out.println("Ingrese la opción que desea: ");
                            opcion = teclado.nextInt();
                            teclado.nextLine();
                            break;
                        }
                        case 2:{
                            System.out.println("presione 1 para avanzar y presione 2 para retroceder");
                            System.out.println("usted esta en la frecuencia:");  
                            System.out.println(radioUvg.getFrequence());  
                            op = teclado.nextInt();
                           
                            while (op<2 && op>=1){
                            teclado.nextLine();
                                switch (op){
                                    case 1:{
                                       System.out.println(radioUvg.getFrequence()); 
                                         radioUvg.forward();
                                         break;   
                                    }
                                    case 2:{
                                        System.out.println(radioUvg.getFrequence()); 
                                         radioUvg.backward();
                                         break;
                                    }
                                         
                                 }          
                            }
                        break;
                        }
                        case 3:{
                            System.out.println("Escriba el numero de boton en el cual lo quiere guardar del 1 al 12");
                            opcion = teclado.nextInt();
                            teclado.nextLine();  
                            radioUvg.saveStation(opcion);
                            System.out.println("Se guardo la emisora");
                            break;
                        }
                        case 4:{
                            System.out.println("Escriba el numero de boton en el cual se encuentra su emisora");
                            opcion = teclado.nextInt();
                            teclado.nextLine();  
                            radioUvg.selectFavoriteSation(opcion);
                            System.out.println("Se ha puesto la emisora"); 
                        }
                        case 5:{
                            
                        }
                    }


                    break;
            }
        }
                case 2: {
                        System.out.println("Gracias por usar radio uvg"); 
                            break;
                            }
              
            }
        }
    }
 }
    

