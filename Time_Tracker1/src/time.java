/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NAIL
 */
public class time {
    String proyecto;
    String estatus;
    String duracion;

    public time(String proyecto, String estatus, String duracion) {
        this.proyecto = proyecto;
        this.estatus = estatus;
        this.duracion = duracion;
    }
    
    

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
}
