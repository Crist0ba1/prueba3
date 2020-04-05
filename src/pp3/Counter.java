/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Counter {
    ArrayList<Socio> socios = new ArrayList<Socio>();
    Scanner sc = new Scanner(System.in);
    
    public Counter(){
        agregarSocios();
    }
 
    public boolean existeSocio(String rut){
        for(int i=0; i<socios.size();i++){
            if(socios.get(i).getRut().equals(rut)){
                System.out.println("Socio existe");
                return true;
            }
        }
        System.out.println("Socio NO existe");
        return false; 
    }
    public int validarSocio(String rut){
        boolean persona = existeSocio(rut);
        if(persona){
            //simulamos la conexion 
            try {
                System.out.println("Conectando al registro civil...");
                Thread.sleep(2*1000);
            } catch (Exception e) {}
            System.out.println("FOTO");
            System.out.println("¿La persona frente a usted es la de la foto?");
            System.out.println("1 Si");
            System.out.println("2 No");
            
            int respuesta = 0; 
            String aux;
            while(respuesta !=1 && respuesta !=2){
                 aux = sc.nextLine();
                 respuesta = Integer.parseInt(aux);
                 System.out.println(respuesta);
                 if (respuesta !=1 && respuesta !=2){
                     System.out.println("Valor invalido ingreselo otra vez");
                 }
            }
            return respuesta; 
        }
            return 0;// el socio no esta en el sistema
    }
    public void cargarMulta(String rut, int multa){
        for(int i=0; i<socios.size();i++){
            if(socios.get(i).getRut().equals(rut)){
                socios.get(i).setMulta(multa);
            }
        }
    } 
    public void comprobarCancha(String rut, Cancha cancha){
         String aux = "1";
         Scanner sc = new Scanner(System.in);
         int resp = 2; 
         int deuda = 0;
        for(int i = 0; i<this.socios.size(); i++){
            if(rut.equals(socios.get(i).getRut())){
                deuda = socios.get(i).getDeuda();
            }
        }
        if(deuda>0){
            System.out.println("Estimado socio usted cuenta con una deuda de $"+deuda);
            System.out.println("Por lo que no puede solicitar la cancha");
        }
        else{
        while(resp !=0){
            if(resp == 2){ 
            cancha.horarioCancha();}
             System.out.println("Horario a reserbar");
             aux = sc.nextLine();
             resp = Integer.parseInt(aux);
             
             if(resp>7 && resp <25){
                 if(cancha.comprobarCancha(resp)){// si puedo reserbar la cancha
                 reservarCancha(cancha,rut ,resp);
                 System.out.println("Cancha reservada con exito");
                }
                 else{System.out.println("La cancha esta ocupada en la hora ingresada");}    
             }
             if (resp<=7 && resp >=25){
                System.out.println("Valor invalido, ingreselo otra vez");
                System.out.println("Ej: 18:00 hrs, ingrese 18");
               }
            System.out.println("1 Pedir otra hora"); 
            System.out.println("2 Si desea ver el horario de nuevo ");
            System.out.println("0 Salir");

        }
        }
    }
    public void reservarCancha(Cancha cancha,String rut ,int hora){
        int costo = cancha.reserbarCancha(hora, rut);
        for(int i = 0; i<this.socios.size(); i++){
            if(rut.equals(socios.get(i).getRut())){
                System.out.println("Estimado socio "+rut+" el valor de la cancha es de $"+costo);
            }
        }
    }
    
    
    public void pagarMensualidad(){
    }
    public void pagarMulta(){
    }
    public void pagarDeuda(){
    }
    public void pagarTodo(){
    }
    
    
    //Es para agregar socios y poder probar el sistema
    public void agregarSocios(){
        Socio socio1 = new Socio("123", 10000,0,0);
        Socio socio2 = new Socio("22.222.222-2", 10000,20000,0);
        Socio socio3 = new Socio("33.333.333-3", 10000,20000,0);
        Socio socio4 = new Socio("44.444.444-4", 10000,0,5000);
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);
    }
}
