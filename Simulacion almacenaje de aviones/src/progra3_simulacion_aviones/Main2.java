package progra3_simulacion_aviones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//Simulación de aviones con menú

public class Main2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        Deque<String> deque = new LinkedList<String>();
        
        System.out.println("Ingrese cantidad de aviones que se desean almacenar en el hangar: ");
        int aviones = sc.nextInt();
        
        	if(aviones>10) {
        	System.out.println("No se pueden agregar más de 10 aviones ");
        }else {
        	
        	for (int i = 0; i < aviones; i++) {
                System.out.println("Ingrese matricula del avion no."+(i+1)+"");
                String  matricula = sc.next();
                deque.add(matricula);
            }
        	
        	//Si la lista no está vacía mostrar el menú
        	while(!deque.isEmpty()) {
        		
            System.out.println(" Seleccione la opción que desee: ");
            System.out.println(" 1. Mostrar aviones almacenados en el hangar ");
            System.out.println(" 2. Avión listo para salir del hangar  ");
            System.out.println(" 3. Aviones pendientes por despegar ");
            System.out.println(" 4. Próximo avión en despegar ");
            System.out.println(" 5. Salir ");
            int op = sc.nextInt();
         
            if(op == 1) {
            	System.out.println("Aviones almacenados en el hangar: ");
            	System.out.println(deque.toString());
            }
            
            else if(op == 2) {
            	System.out.println("El avión " + deque.poll() + " está listo para salir del hangar " );
            }
            
            else if(op == 3) {
            	System.out.println("Aviones pendientes por despegar: "+deque.toString());
            }
            
            else if(op == 4) {
            	System.out.println("El avión " + deque.peek() +" será el próximo en despegar " );
            }
            
            else if(op == 5) {
            	break;
            }
            
         }
        	//Si la lista está vacía terminar el programa
        	if(deque.isEmpty()) {
    			System.out.println("No hay más aviones almacenados en el hangar, todos han despegado ");
    		}
      }	
   }
}

