/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Distrito {
    private String codigo;
    private String distrito;
    private String abreciatura;

    public Distrito(String codigo, String distrito, String abreciatura) {
        this.codigo = codigo;
        this.distrito = distrito;
        this.abreciatura = abreciatura;
    }

    public Distrito() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getAbreciatura() {
        return abreciatura;
    }

    public void setAbreciatura(String abreciatura) {
        this.abreciatura = abreciatura;
    }
    
}
