package org.ip.sesion10;

public class BusquedaArray {
	public static int busquedaSecuencial(int [] a, int clave){
		for (int i = 0; i < a.length; i++) {   
			if (clave == a[i])    
				return i;  
			}  
		return -1; 
	} 
	public static int busquedaBinaria(int [] a, int clave){
		int primero = 0;  
		int ultimo = a.length - 1;  
		int central;  
		if (clave < a[0] || clave > a[a.length - 1]) 
			// clave menor que el primer valor        
			return -1;           
		// o mayor que el último valor  
		else{        
			while (ultimo >= primero){   
				central = (primero + ultimo) / 2; 
				if (clave < a[central])// subarray izquierdo    
					ultimo = central - 1;   
				else if (clave > a[central]) // subarray derecho    
					primero = central + 1;  
				else   
					return central;    
				}  
			return -1; 
		}
	}
}

