/**
 * 
 */
package com.calderon.holamundo.start;

/**
 * 
 */
public class HolaMundo {

	// TODO pendiente hacer inicio de la clase
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
	
		
        //  System.out.println("hola mundo");
		System.out.println("star program");
		System.out.println("hola Mundo");
		
        testIntegerNumbers();
		
		
		testRealNumbers();
		
		System.out.println("End Program");
		
	}


          public static void testIntegerNumbers() {
			
			System.out.println("start TestIntegerNumber");
			
			//declaracion de variables tipo nombre;
			byte dias;
			short contador;
			
			//declaracion y asignacion de valor
			// tipo nombre= valor inicial
			short resultado=42;
			
			//declaracion de varias variablesdel mismo tipo 
			short codigo, edad, media;
			
			// declaracion y asignacion a varias a la vez:
			int i, j, k;
			
			i=j=k=0;
			
			//el tipo long
			long sueldoFutbolista =23489343;
			long valorGoogle = 666000666;
			
			// vamos a probar a mostrarlos por pantalla: conatenamos con +
			System.out.println("el sentido de la vida es:"+ resultado);
			
			System.out.println("el sueldo medio de un futbolista medio es:"+  sueldoFutbolista);
			
			
			System.out.println("end TestIntegerNumber");
			
          }
          
          
          
			
			 public static void testRealNumbers() {
					
					System.out.println("start TestRealNumber");

				// en los tips reales debemos usar un . en llugar de, para las decimales
					float temperatura;
					// al asignarvalor le ponemos laF para distinguir del tipo double
					float peso= 78.9F;
					
					double saldoCuentaCorriente= 3423343.43D;
					// Los valores altos se pueden abreviar:
					// esto seria 4.6 multiplicado por 10 elevado a 9.
					double masaJupiter = 4.6E+9D;
					
					//Vamos a probar a mostrarlos por pantallas: concatenamos con +
					System.out.println("tu peso : "+peso+",y tu saldo:"+ saldoCuentaCorriente);
					
					System.out.println("La masa de Jupiter: " + masaJupiter);
					
					
					System.out.println("End TestRealNumber");

					
			 }
					
		
	}




