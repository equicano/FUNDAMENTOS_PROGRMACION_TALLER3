import java.util.Scanner;


public class TEMPERATURA_BOG
{
   public static void main(String[] args)
   {
       double total_temp = 0;
       String temp_prom;
       double prom;
       int contador = 0;
       int contador_menor = 0;
       
            
       Scanner teclado = new Scanner(System.in);
             
             
           do{ 
            System.out.print("Escriba la temperatura promedio del día en grados centigrados, para terminar escriba fin");
            temp_prom = teclado.next();
            
            if (! temp_prom.equals("fin"))
            {
                total_temp = total_temp + Double.parseDouble(temp_prom);
                contador = contador + 1;
            }   
           
            if (temp_prom.equals("fin"))
            
            {
                
                break;      
                
            }  
            
           else if (Double.parseDouble(temp_prom) < 10)
                            {
                    
                               contador_menor = contador_menor + 1;
                               
                            }
            
            } while ( ! temp_prom.equals("fin") );         
            
           if ( contador != 0 )
            
            { 
                prom = total_temp / contador;
                
                System.out.println("La temperatura promedio fue " + prom + " °C");
                System.out.println("Los días con temperatura menor a 10°C fueron " + contador_menor );
                
            }
            
            else {
                    System.out.println("No se introdujeron temperaturas");
                }
    }   
}
