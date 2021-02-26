package progra3_simulacion_aviones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Simulaci�n de almacenamiento de aviones autom�tica (sin men�)

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        Queue<String> cola = new LinkedList<String>();
        
        
        System.out.println("Ingrese cantidad de aviones que se desean almacenar en el hangar: ");
        int aviones = sc.nextInt();
        
        	if(aviones>10) {
        	System.out.println("No se pueden agregar m�s de 10 aviones ");
        }else {
        	
        	//agregar matriculas de aviones a la cola
        	for (int i = 0; i < aviones; i++) {
                System.out.println("Ingrese matr�cula del avion no." +(i+1)+ "" );
                String  matricula = sc.next();
                cola.add(matricula);
            }
        
        
        int i=0;
        while(i<10) {
        	i++;
        	System.out.println("Aviones almacenados en el hangar: ");
        	System.out.println(cola.toString());
        
        	//Extrae el avi�n (nodo) que sale del hangar
        	System.out.println("El avi�n "+ cola.poll() +" est� listo para salir del hangar " );
        
        	//Si la cola est� vac�a, termina el ciclo
        	if(cola.isEmpty()) {
        		System.out.println("Actualmente no hay aviones almacenados en el hangar ");
        		break;
        	
        	//Muestra la lista de aviones a excepci�n del avi�n extra�do
        	}else {
        		System.out.println("Aviones pendientes por despegar: "+cola.toString());
        	}
        	
        	//Escoge el avi�n (nodo) que esta listo
        	System.out.println("El avi�n "+ cola.peek() +" ser� el pr�ximo en despegar " );
        }
      }
   }
}