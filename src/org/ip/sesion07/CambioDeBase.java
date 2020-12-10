package org.ip.sesion07;

import java.util.Scanner;

public class CambioDeBase {
	private static Scanner input = new Scanner(System.in);
	
	public static int leerOpcion(){
		
		boolean correcto=true;
		int select = Integer.parseInt(input.nextLine());
		
		if(select<=6&&select>=0){
				switch(select){
					case 1:
						  while(correcto){
							  	try{
					          		System.out.print("Introduzca un n�mero decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El n�mero "+entrada+" en hexadecimal es "
					          		+Integer.toHexString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un n�mero decimal");
						        }  
						  }
						break;
					case 2:
						 while(correcto){
							  	try{
					          		System.out.print("Introduzca un n�mero decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El n�mero "+entrada+" en octal es "
					          		+Integer.toOctalString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un n�mero decimal");
						        }  
						  }
						break;
					case 3:
						 while(correcto){
							  	try{
					          		System.out.print("Introduzca un n�mero decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El n�mero "+entrada+" en binario es "
					          		+Integer.toBinaryString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un n�mero decimal");
						        }  
						  }
						break;
					case 4:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un n�mero hexadecimal: ");
						           String entrada = input.nextLine();
					               System.out.println("El n�mero "+entrada+" en decimal es "+Integer.parseInt(entrada, 16));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un n�mero hexadecimal");
						        }
						  }
						  break;
					case 5:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un n�mero octal: ");
						           String entrada = input.nextLine();
					               System.out.println("El n�mero "+entrada+" en decimal es "+Integer.parseInt(entrada, 8));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un n�mero octal");
						        }
						  }
						  break;
					case 6:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un n�mero binario: ");
						           String entrada = input.nextLine();
					               System.out.println("El n�mero "+entrada+" en decimal es "+Integer.parseInt(entrada, 2));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un n�mero binario");
						        }
						  }
						  break;
					case 0:
						System.out.println("\nHA FINALIZADO EL PROGRAMA");
						break;
					}
		
			}else if(select>6||select<0){
				System.out.print("Opci�n fuera de rango");
				System.out.print("\nIntroduzca un valor entero entre 0 y 6 para elegir la opci�n => ");
			}
				return leerOpcion();
	
	}		
		
	public static void menu(){
		System.out.println("PROGRAMA QUE PERMITE CONVERTIR UN N�MERO DECIMAL A HEXADECIMAL, OCTAL O BINARIO Y VICEVERSA");
		System.out.println();
		System.out.println("1. - Convertir de decimal a hexadecimal");
		System.out.println("2. - Convertir de decimal a octal");
		System.out.println("3. - Convertir de decimal a binario");
		System.out.println("4. - Convertir de hexadecimal a decimal");
		System.out.println("5. - Convertir de octal a decimal");
		System.out.println("6. - Convertir de binario a decimal");
		System.out.println("0. - TERMINAR");
		System.out.println();
	}
			
	public static void main(String[] args){
		menu();
		System.out.print("Elija opci�n deseada => ");
		while(true){
			try{
				leerOpcion();
				break;
			}catch(Exception ex){
				System.out.print("Incorrecto, introduzca un valor entero para elegir la opci�n => ");
			}
		}
	}
}