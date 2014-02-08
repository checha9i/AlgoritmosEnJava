/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue
{
	


	public static void main(String args [])
	{


	
	int n1,n3=0,n4;


	System.out.println(args[0]+"= ");


	
	n1 = Integer.parseInt(args[0].toString());


		if(n1>0&&n1<=45){
		for(int i=0;i<n1;i++){





		System.out.println("el valor actual es: "+i);
		



		
	}
}
		else if(n1>45){

		System.out.println("el numero es mayor a 45");

}else{
		System.out.print("el numero es menor o igual a 0");
	}




}
}