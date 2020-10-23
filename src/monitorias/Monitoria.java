package monitorias;
import java.util.Scanner;

public class Monitoria {  
    public static void main(String[] args) {
        probar();
    }    
    
    public static void escribirArregloInt(int[] x){
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();        
    }
    
    public static void probar(){
        String[] nombres = new String[3];
        nombres[0]="Andrès";
        nombres[1]="Carlos";
        nombres[2]="Antonia";
        String participantes = "";
        for(int i=0; i<nombres.length;i++)
            participantes += "Participante #"+i+": "+ nombres[i] + "\n";
        System.out.println(participantes);
    }
    
    static void show(String[] x){
        for(int i = 0; i<x.length; i++)
            System.out.println("Valor en la posición: "+i+"-> " + x[i]);
    }
}
