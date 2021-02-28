import java.util.Scanner;

public class EMPLEADOS
{
    public static void main(String[] args)
   {
       int edad;
       double salario;
       double porcentaje_menores;
       int contador = 0;
       int contador_menor = 0;
             
        Scanner teclado = new Scanner(System.in);   
        
        do{  
            
            System.out.print("Ingrese la edad del trabajador, 100 o más para terminar");
                edad = teclado.nextInt();       
                          
            lab1:if (edad >= 100 || edad < 0)
            
                {
                    System.out.println("No se introdujo edad");
                    break;
                } else {
                
                        System.out.print("Ingrese el salario del trabajador, 0 o un salario negativo para salir");
                            salario = teclado.nextDouble();  
                            
                         lab2: if (salario > 0)
                            {
                                contador = contador + 1;
                            }   
                                    
                                          
                           else { 
                                   System.out.println("No se introdujo salario");
                                   break;
                            }
                        }    
                   if (edad < 18 && salario > 1000000 )
            
                { 
                    contador_menor = contador_menor + 1;
                }     
            }while (edad < 100 && salario > 0 ); 
        
        if ( contador != 0 )
        
        { 
            porcentaje_menores = (contador_menor * 100) / contador;
            
            System.out.println("El porcentaje de trabajadores menores de edad y que ganan más de un millon de pesos es del " + porcentaje_menores + " %");  
        }
        
         else 
         {
                System.out.println("Fin, no se introdujeron  datos");
          }
    }       
}

