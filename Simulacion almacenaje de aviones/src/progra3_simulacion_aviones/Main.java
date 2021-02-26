package progra3_simulacion_aviones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Simulación de almacenamiento de aviones automática (sin menú)

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        Queue<String> cola = new LinkedList<String>();
        
        
        System.out.println("Ingrese cantidad de aviones que se desean almacenar en el hangar: ");
        int aviones = sc.nextInt();
        
        	if(aviones>10) {
        	System.out.println("No se pueden agregar más de 10 aviones ");
        }else {
        	
        	//agregar matriculas de aviones a la cola
        	for (int i = 0; i < aviones; i++) {
                System.out.println("Ingrese matrícula del avion no." +(i+1)+ "" );
                String  matricula = sc.next();
                cola.add(matricula);
            }
        
        
        int i=0;
        while(i<10) {
        	i++;
        	System.out.println("Aviones almacenados en el hangar: ");
        	System.out.println(cola.toString());
        
        	//Extrae el avión (nodo) que sale del hangar
        	System.out.println("El avión "+ cola.poll() +" está listo para salir del hangar " );
        
        	//Si la cola está vacía, termina el ciclo
        	if(cola.isEmpty()) {
        		System.out.println("Actualmente no hay aviones almacenados en el hangar ");
        		break;
        	
        	//Muestra la lista de aviones a excepción del avión extraído
        	}else {
        		System.out.println("Aviones pendientes por despegar: "+cola.toString());
        	}
        	
        	//Escoge el avión (nodo) que esta listo
        	System.out.println("El avión "+ cola.peek() +" será el próximo en despegar " );
        }
      }
   }
}