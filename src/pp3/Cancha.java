/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author crist
 */
public class Cancha {
    boolean[] horario;
    String[] rut;
    
    public Cancha(){
        this.horario = new boolean [25];
        for(int i =0; i<25; i++){
            horario[i]= true;
        }
    }
    public boolean comprobarCancha(int hora){
        return this.horario[hora];
    }
    public void horarioCancha(){
        System.out.println("Recerbas de canchas de hoy");
        System.out.println("Horario de oficina");
        for(int i=8; i<18; i++){
            if (horario[i]){
                System.out.println((i)+":00hrs a "+ (i+1)+"hrs DISPONIBLE" );
            }
            else{
                System.out.println((i)+":00hrs a "+ (i+1)+"hrs OCUPADO por: "+rut[i]);
            }
        }
        System.out.println("Horario nocturno");
        for(int i=18; i<=24; i++){
            if (horario[i]){
                System.out.println(i+":00hrs a "+ (i+1)+"hrs DISPONIBLE" );
            }
            else{
                System.out.println(i+":00hrs a "+ (i+1)+"hrs OCUPADO" );
            }
        }
    }
    public int reserbarCancha(int hora, String rut){
        this.horario[hora] = false;
        this.rut[hora] = rut;
        int numeroDia=0;
        Calendar cal= Calendar.getInstance();
        Date hoy=new Date();
        cal.setTime(hoy);
        numeroDia=cal.get(Calendar.DAY_OF_WEEK);
        //System.out.println("Dia: "+numeroDia);// viene con un dia mas 7 = sabado
        
        agregarCostoCancha(rut, costoCancha(numeroDia-1, hora));
        return 0;
    }
    public int costoCancha(int dia, int hora){
        int costo;
        if(dia <6){
            if (hora<18){costo = 5000; }
            else{ costo = 4000;}
        }
        else{
            if (hora<18){costo = 7000; }
            else{ costo = 6000;}
        }
        return costo;
        
        
    }
    public void agregarCostoCancha(String rut, int costo){
        
    }
    
}
