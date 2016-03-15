/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.nullpointer.rest.tripulator.dtos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Antonio de la Vega
 */
public class ItinerarioDTO {
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList planDias;
    private ArrayList multimedia;
    private ArrayList mapa;

    public ItinerarioDTO(Long id, String nombre, Date fechaInicio, Date fechaFin, ArrayList planDias, ArrayList multimedia, ArrayList mapa) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.planDias = planDias;
        this.multimedia = multimedia;
        this.mapa = mapa;
    }
/*
    public ItinerarioDTO(Long id, String nombre, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        planDias = new ArrayList();
        multimedia = new ArrayList();
        mapa = new ArrayList();
    }
*/
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the planDias
     */
    public ArrayList getPlanDias() {
        return planDias;
    }

    /**
     * @param planDias the planDias to set
     */
    public void setPlanDias(ArrayList planDias) {
        this.planDias = planDias;
    }

    /**
     * @return the multimedia
     */
    public ArrayList getMultimedia() {
        return multimedia;
    }

    /**
     * @param multimedia the multimedia to set
     */
    public void setMultimedia(ArrayList multimedia) {
        this.multimedia = multimedia;
    }

    /**
     * @return the mapa
     */
    public ArrayList getMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(ArrayList mapa) {
        this.mapa = mapa;
    }
    
}
