import java.util.Scanner;
public class PiedraPapelTigera{
    public static void main(String[] args){
        int maquina, persona;
        maquina = (int) (Math.random() * 10);
        
        Scanner ps = new Scanner(System.in);
        System.out.println("introduce un numero del 1 al 3 siendo\n 1: Piedra\n 2: Papel \n 3: Tijera");
        persona = ps.nextInt();

        if(maquina <4){
            maquina=1;
        }else if (maquina >4 && maquina <8){
            maquina=2;
        }else {
            maquina=3;
        }

        if (persona == 1 && maquina == 1){
            System.out.println("Ambos sacasteis Piedra, es empate");
        }else if (persona == 2 && maquina == 1){
            System.out.println("La maquina saco Piedra, has perdido");
        }else if (persona == 3 && maquina == 1){
            System.out.println("La maquina saco Tigera, has ganado");
        }else if (persona == 1 && maquina == 2){
            System.out.println("La maquina saco Piedra, has ganado");
        }else if (persona == 2 && maquina == 2){
            System.out.println("La maquina saco Papel, es empate");
        }else if (persona == 3 && maquina == 2){
            System.out.println("La maquina saco Tigera, has perdido");
        }else if (persona == 1 && maquina == 3){
            System.out.println("La maquina saco Piedra, has perdido");
        }else if (persona == 2 && maquina == 3){
            System.out.println("La maquina saco Papel, has ganado");
        }else if (persona == 3 && maquina == 3){
            System.out.println("La maquina saco Tigera, es empate");
        }
    }
}
