/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber 
{
	


	public static void main(String args [])
	{


	
	double n1,n3=1;


	System.out.print(args[0]+"!= ");


	
	n1 = Integer.parseInt(args[0].toString());


if(n1<46){		
	

	for(int i=1;i<=n1;i++){
	

	


			

			n3=i*n3;
			
			if(i<n1){
			
			System.out.print(i+"x");}else{
			System.out.print(i+"=");
			System.out.print(n3);
			}
}}




else{		




			System.out.print("el numero es mayor a 45");
}
		
	}
}

