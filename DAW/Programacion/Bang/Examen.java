package clase;

import java.util.Scanner;



public class Examen {
	 public static void main(String[] args) {
		 	int volver=1;
	        int balasMias = 0, balasMaq = 0;
	        Scanner sc = new Scanner(System.in);
	        int miOpcion=0, opcionMaquina=0;
	        int salir = 1;

	        do {
	            // Opciones tuyas
	            System.out.println("¿Que accion quieres hacer? \n 1.Recargar \n 2.Bloquear \n 3.Disparar");
	            miOpcion = sc.nextInt();
	            if (miOpcion == 1) {
	                System.out.println("Has elegido recargar");
	                balasMias++;
	            } else if (miOpcion == 2) {
	                System.out.println("Has elegido bloquear");
	            } else if (miOpcion == 3 && balasMias > 1) {
	            	balasMias--;
	                System.out.println("Has elegido Disparar");
	            } else if (miOpcion == 3 && balasMias < 1) {
	                System.out.println("Has elegido disparar pero no tienes balas");
	            }else if(miOpcion==3) {
	            	System.out.println("Has elegido disparar");
	            }
	            // Opciones maquina
	            opcionMaquina = (int) (Math.random() * 3 + 1);
	            if (opcionMaquina == 1) {
	                System.out.println("La maquina ha elegido recargar");
	                balasMaq++;
	            } else if (opcionMaquina == 2) {
	                System.out.println("La maquina ha elegido bloquear");
	            } else if (opcionMaquina == 3 && balasMaq > 1) {
	            	balasMaq--;
	                System.out.println("La maquina ha elegido Disparar");
	            } else if (opcionMaquina == 3 && balasMaq < 1) {
	                System.out.println("La maquina te queria disparar pero no tiene balas, estate tranquilo");
	            }else if (opcionMaquina==3) {
	            	System.out.println("la maquina ha elegido disparar");
	            }
	            // Has perdido
	            if (miOpcion == 1 && opcionMaquina == 3 && balasMaq >0) {
	                System.out.println("HAS PERDIDO, TE HA MATADO UNA MAQUINA....");
	                salir--;
	            }
	            if (miOpcion == 3 && balasMias <1 && opcionMaquina == 3 && balasMaq >0) {
	                System.out.println("HAS PERDIDO, TE HA MATADO UNA MAQUINA....");
	            }
	            // Has ganado
	            if (miOpcion == 3 && balasMias>0 && opcionMaquina == 1) {
	                System.out.println("HAS GANADO CAMPEON, LA MAQUINA ESTABA RECARGANDO");
	                salir--;
	            }
	            if (miOpcion == 3 && balasMias>0 && opcionMaquina == 3 && balasMaq <1) {
	                System.out.println("HAS GANADO CAMPEON, LA MAQUINA TE DISPARO SIN BALAS");
	                salir--;
	            }
	            //Volver o no al juego
	            if(salir==0) {
	            	
	            	System.out.println("¿Quieres volver a jugar?\n 1.Si \n 2.No");
	            	volver=sc.nextInt();
	            	salir++;
	            	balasMias=0; 
	            	balasMaq=0;
	            }
	        } while (volver==1);
	    }
	}