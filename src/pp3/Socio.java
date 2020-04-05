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
public class Socio {
    String rut; 
    int mensualidad;
    int multa; 
    int deuda;

    public Socio (String rut, int mensualidad, int multa, int deuda){
    this.rut = rut;
    this.mensualidad = mensualidad; 
    this.multa = multa; 
    this.deuda = deuda;  
    }
    

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = this.multa + multa;
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = this.deuda + deuda;
    }

    


}
