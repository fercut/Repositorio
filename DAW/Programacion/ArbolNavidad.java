public class ArbolNavidad {
    public static void main(String[] args) {
                
        //Definimos el alto
        System.out.println("      <>");
        for (int alto = 1; alto <= 3; alto++) {
            //Centra este triangulo
            System.out.print("    ");       
            //Espacios
            for (int espacio = 1; espacio <= 3-alto; espacio++) {
            System.out.print(" ");
            }
        
            //Asteriscos
            for(int asterisco = 1; asterisco <= (alto*2); asterisco++){
            System.out.print("*");
            }
            System.out.println("");
        }
        //Definimos el alto
        for (int alto = 1; alto <= 5; alto++) {
            //Centra este triangulo
            System.out.print("  ");        
            //Espacios
            for (int espacio = 1; espacio <= 5-alto; espacio++) {
            System.out.print(" ");
            }
        
            //Asteriscos
            for(int asterisco = 1; asterisco <= (alto*2); asterisco++){
            System.out.print("*");
            }
            System.out.println("");
        }    
        //Definimos el alto
        for (int alto = 1; alto <= 7; alto++) {
                    
            //Espacios
            for (int espacio = 1; espacio <= 7-alto; espacio++) {
            System.out.print(" ");
            }
        
            //Asteriscos
            for(int asterisco = 1; asterisco <= (alto*2); asterisco++){
            System.out.print("*");
            }
            System.out.println("");
        }  
        System.out.println("     ||||     \n     ||||     \n##   ||||   ##");  
    }
}
    
