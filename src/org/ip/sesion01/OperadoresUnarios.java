package org.ip.sesion01;

public class OperadoresUnarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Este tipo de ejercicio nos está enseñando a aplicar el tipo de variable de incrementar un valor y disminuir un valor,
		//Como vemos en:
		//fila 1: i++ esto significa que primero asignamos el valor de i a la variable b (por eso b=8) y luego incrementamos el valor de i(i=9) 
		//fila 2: i-- significa que primero asignamos el valor de i a la variable b(por eso b =8) y luego disminuimos el valor de i(i=7)
		//fila 3: primero incrementamos el valor y luego asignamos el valor incrementado (por eso b y c vale 9).
		//fila 4: primero disminuimos el valor y luego asignamos el valor disminuido (b y c vale 7).
		
		//Esto lo utilizaremos mayormente para  bucle. 
		
		int i = 8;     //A la variable i le damos un valor igual a 8, de tipo entero
		int a, b, c;	
		System.out.println("\tantes\tdurante\tdespués");	
		i = 8; 
		a = i;
		b = i++;	//b vale 8, pero se incrementa luego con la siguiente variable por el ++.
		c = i;		//c vale 9  poque en la variable anterior se suma con i++
		System.out.println("i++\t" + a + '\t' + b + '\t' + c); 
		i = 8;
		a = i;		
		b = i--; //En está variable el valor vale 8 pero se decrementa por el signoo-- en la siguiente variable. 
		c = i; 		//c vale 7
		System.out.println("i--\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = ++i;  // cuando imprima b ya esta asignandole un incrmento de +1 a la varible seria 9
		c = i;		//i se quueda con el valor de que viene de arriba seria 9
		System.out.println("++i\t" + a + '\t' + b + '\t' + c);
		i = 8;
		a = i;
		b = --i;  //antes de imprimir el resultado esta decrementando el valor por el signo -- y la variable b vale 7
		c = i;	// c vale 7
		System.out.println("--i\t" + a + '\t' + b + '\t' + c);
		
	}

}
