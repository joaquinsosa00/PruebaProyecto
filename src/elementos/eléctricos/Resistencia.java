/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos.eléctricos;

import java.util.Objects;

/**
 *
 * @author ASUS
 */
public class Resistencia {
    private String tipo;
    private float valor;
    private float potenciamax;
    private int tolerancia;
    
    public String mostrarResistencia()
    {
        return "\nLa resistencia " + tipo + " es de " + valor + " ohmios, tiene una tolerancia del " + tolerancia
                + "%, y aguanta " + potenciamax + " W máximos de potencia.";
    }
    
//    public boolean equals(Object obj)
//    {
//        if(obj instanceof Resistencia){
//            Resistencia other = (Resistencia) obj;
//            if(this.valor==other.valor && this.tipo==other.tipo && this.tolerancia==other.tolerancia && this.potenciamax==other.potenciamax){
//                return true;
//            }
//            else
//                return false;
//        }
//        else
//            return false;
//    }
    
    public Resistencia(String tipo, float valor, float potenciamax) {
        this.tipo = tipo;
        this.valor = valor;
        this.potenciamax = potenciamax;
    }
    
    public Resistencia(String tipo, float valor, float potenciamax, int tolerancia) {
        this(tipo, valor, potenciamax);
        this.tolerancia = tolerancia;
    }
    
    public Resistencia(float valor){
        this.valor = valor;
    }
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the potenciamax
     */
    public float getPotenciamax() {
        return potenciamax;
    }

    /**
     * @param potenciamax the potenciamax to set
     */
    public void setPotenciamax(float potenciamax) {
        this.potenciamax = potenciamax;
    }

    /**
     * @return the tolerancia
     */
    public int getTolerancia() {
        return tolerancia;
    }

    /**
     * @param tolerancia the tolerancia to set
     */
    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Float.floatToIntBits(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Resistencia other = (Resistencia) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    public static float[][] valores(){
        float[][] valoresComerciales;
        valoresComerciales = new float[13][8];
    
        float n,aux;
        for(int i=0;i<13;i++){
            for(int j=0,p=1;j<7;j++){
                switch(i){
                    
                    case 0: n=1;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                           
                    case 1: n=1.2f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 2: n=1.5f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 3: n=1.8f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 4: n=2.2f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 5: n=2.7f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 6: n=3.3f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 7: n=3.9f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 8: n=4.7f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 9: n=5.1f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 10: n=5.6f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 11: n=6.8f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                            
                    case 12: n=8.2f;
                            aux=n*p;
                            valoresComerciales[i][j]=aux;
                            p*=10;
                            break;
                }
            }
        }
        valoresComerciales[0][7]=10000000;
        
        return valoresComerciales;
    }
    
}