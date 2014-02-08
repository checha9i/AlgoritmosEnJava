/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum 
{
	


	public static void main(String args [])
	{


	
	int n1,n2,n3;


	System.out.println ("sus limites son: "+args[0]+" y "+args[1]+" ");


	
	n1 = Integer.parseInt(args[0].toString());


	n2 = Integer.parseInt(args[1].toString());

if(n1>45||n2>45){

System.out.println("uno de los dos numeros es mayor a 45");


}else{


if(n1<n2){
		
		for(int i=n1;i<n2;i++){


n3=i+1;

	if(n3!=n2){



	

		System.out.println(n3+" ");
		


		
	}



}
}
else{

for(int i=n2;i<n1;i++){


n3=i+1;

	if(n3!=n1){



	

		System.out.println(n3+" ");
		


		
	}



}


}
}

}
}