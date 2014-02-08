/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Se ingresara un numero, el programa debe iterar desde cero hasta ese numero y mostrar el mensaje
Flip si el numero es divisible dentro de 3
Flop si el numero es divisible dentro de 5
FlipFlop si el numero es divisible dentro de 3 y 5
y si no cumple ninguna de estas condiciones, solo mostrar el valor de ese numero.
*/

   

public class FlipFlop
{

  	
   		// si el numero es divisible dentro de 3 imprima "Flip"	

   		// si el numero es divisible dentro de 5 imprima "Flop"
	
   		// si el numero es divisible dentro de 3 y 5 imprima "FlipFlop"	

   		// de lo contrario, imprima el numero
      		


	 public static void main(String args [])
{
	

   
	int n1,n2=3,n3=5,n4;
   
 

 
	 n1 = Integer.parseInt(args[0].toString());

 

if(n1<46){
  	if(n1%3==0){
	      
  

		if(n1%3==0&&n1%5==0)
		{
	      


 
  		 System.out.println("flip flop");
 

 		 }
  
		else {



		 System.out.println("flip");}
  
		     }
	
 	else if(n1%5==0){
	
		
		if(n1%3==0&&n1%5==0){
	      


 
 		  System.out.println("flip flop");
 

 		 }
 

		else{       


  		 
		System.out.println("flop");
 }
   }

 
		else{

		System.out.println(n1);

		} }else{

 
 		  System.out.println("el numero es mayor a 45");
 

}

 
}}