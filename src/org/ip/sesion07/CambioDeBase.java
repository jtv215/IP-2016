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
					          		System.out.print("Introduzca un número decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El número "+entrada+" en hexadecimal es "
					          		+Integer.toHexString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un número decimal");
						        }  
						  }
						break;
					case 2:
						 while(correcto){
							  	try{
					          		System.out.print("Introduzca un número decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El número "+entrada+" en octal es "
					          		+Integer.toOctalString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un número decimal");
						        }  
						  }
						break;
					case 3:
						 while(correcto){
							  	try{
					          		System.out.print("Introduzca un número decimal: ");
					          		String entrada = input.nextLine();
					          		System.out.println("El número "+entrada+" en binario es "
					          		+Integer.toBinaryString(Integer.valueOf(entrada)));
					          		break;
						        }catch(Exception e){
						        	System.out.println("No es un número decimal");
						        }  
						  }
						break;
					case 4:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un número hexadecimal: ");
						           String entrada = input.nextLine();
					               System.out.println("El número "+entrada+" en decimal es "+Integer.parseInt(entrada, 16));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un número hexadecimal");
						        }
						  }
						  break;
					case 5:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un número octal: ");
						           String entrada = input.nextLine();
					               System.out.println("El número "+entrada+" en decimal es "+Integer.parseInt(entrada, 8));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un número octal");
						        }
						  }
						  break;
					case 6:
						  while(correcto){
					          	try{
						           System.out.print("Introduzca un número binario: ");
						           String entrada = input.nextLine();
					               System.out.println("El número "+entrada+" en decimal es "+Integer.parseInt(entrada, 2));
					               break;
						        }catch(Exception e){
						           System.out.println("No es un número binario");
						        }
						  }
						  break;
					case 0:
						System.out.println("\nHA FINALIZADO EL PROGRAMA");
						break;
					}
		
			}else if(select>6||select<0){
				System.out.print("Opción fuera de rango");
				System.out.print("\nIntroduzca un valor entero entre 0 y 6 para elegir la opción => ");
			}
				return leerOpcion();
	
	}		
		
	public static void menu(){
		System.out.println("PROGRAMA QUE PERMITE CONVERTIR UN NÚMERO DECIMAL A HEXADECIMAL, OCTAL O BINARIO Y VICEVERSA");
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
		System.out.print("Elija opción deseada => ");
		while(true){
			try{
				leerOpcion();
				break;
			}catch(Exception ex){
				System.out.print("Incorrecto, introduzca un valor entero para elegir la opción => ");
			}
		}
	}
}