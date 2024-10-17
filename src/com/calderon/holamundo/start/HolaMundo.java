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
		
		
//        testIntegerNumbers();
		
        
//		testRealNumbers();
		
		
//		testchars();
		
//	    testBoolean();
	    
	    testChains();
	    
		
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
					
					
					
					
					
					public static void testchars() 
						
				{
						System.out.println("start testChars");
						
						
						
					// Los carascteres no son más que una letra 
						
						char caracter = 'A';
						char ultima = 'Z';
						
						// los especiales comienzan por \
						
						char nuevaLinea = '\n';
						char tabulacion = '\t';
						char retornoCarro = '\r';
						char comillaSimple ='\'';
						char contraBarra = '\\';
						char dobleComillas = '\"';
						char formFeed = '\f';
						
						// Vamos a probar a mostrarlos por pantalla: concatenamos con +
						
						System.out.println("Primera letra " + caracter +" y ultima: "+ ultima);
						
						System.out.println("Con la \\ usamos caracteres especiales");
						System.out.println("que pereza un \"accidente\" ");
						
						System.out.println("Vamos a saltar \n y ahora otra vez : " + nuevaLinea);
						System.out.println(tabulacion + " Vamos a ver : " + nuevaLinea + " y ahora \r");
						
						
						System.out.println("end testChars");
						
				}
						
					
					
					public static void testBoolean() {

						System.out.println("start testBoolean");
					
					
					// solo pueden ser true o false
						
						boolean terminado = false;
						boolean aprobar = true;
						boolean resultado = aprobar;
						
						//Vamos a probar a mostrarlos por pantalla: conectamos con +
						System.out.println("Este programa ha terminado?" + terminado);
						
						
						System.out.println("Aprobaré la asignatura? " + aprobar);

						
						
						
						
						
		
						
						System.out.println("end testBoolean");
						//
					
						
					}
					
					
						public static void testChains() 	{
							
							 String nombre;
							 String frase = "a quien madruga , patada en los cojones";
							 String presidente;
							 
							 // Podemos iniciarla con una cadena vacia 
							 
							 String otraFrase = " Solo quiero que seamos \"amigos\"";
							 
							 int edad = 666;
							 
							 presidente = "Cthulu";
							 nombre = "Optimus Prime";
							 
							 
							 // los especiales comienzan por 
							 char nuevaLinea = '\n';
							 char tabulacion = '\t';
							 
							 // Podemos unir una cadena y un cara cter con el operador de concatenación.
							 frase= frase + nuevaLinea ;
							 
							 // Vamos a probar a mostrarlos por pantalla:
							 System.out.println(frase);
							 
							 // al concatenare números se convierten en cadenas 
							 frase = presidente + " tiene : " + edad + " años";

							 
							 
							 System.out.println("La frase queda asi: \n" + frase);
							 System.out.println("Y la otra frase: \n" + otraFrase);
							 
							 
						
									
							
							System.out.println("end testBoolean");
							//
				


					
			 }
					
		
	}




