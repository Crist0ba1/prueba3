/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp3;

/**
 *
 * @author crist
 */
public class Restaurant {
    int costo;
    
    public Restaurant(int Costo){
        this.costo = costo;
    }
    
    public void setCosto(int costo) {
        this.costo = costo;
    }
    public void setDeuda(String rut, Counter ini){
        int multa = descuento();
        ini.cargarMulta(rut, multa);
    }
    
    public void pagar(){
    
    }

    public int descuento(){
        double porcentaje = this.costo*0.1;
        return (this.costo - (int)porcentaje);
        
    }
}