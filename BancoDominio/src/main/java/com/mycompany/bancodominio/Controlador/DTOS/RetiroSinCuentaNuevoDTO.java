/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio.Controlador.DTOS;

import java.util.Date;

/**
 *
 * @author labcisco
 */
public class RetiroSinCuentaNuevoDTO {

    private int id;
    private int id_operacion;
    private String folio;
    private String contrasena;
    private Date fechaExpiracion;

    public RetiroSinCuentaNuevoDTO() {
    }

    public RetiroSinCuentaNuevoDTO(int id_operacion, String folio, String contrasena, Date fechaExpiracion) {
        this.id_operacion = id_operacion;
        this.folio = folio;
        this.contrasena = contrasena;
        this.fechaExpiracion = fechaExpiracion;
    }

    public RetiroSinCuentaNuevoDTO(int id, int id_operacion, String folio, String contrasena, Date fechaExpiracion) {
        this.id = id;
        this.id_operacion = id_operacion;
        this.folio = folio;
        this.contrasena = contrasena;
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_operacion() {
        return id_operacion;
    }

    public void setId_operacion(int id_operacion) {
        this.id_operacion = id_operacion;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString() {
        return "RetiroSinCuentaNuevoDTO{" + "id=" + id + ", id_operacion=" + id_operacion + ", folio=" + folio + ", contrasena=" + contrasena + ", fechaExpiracion=" + fechaExpiracion + '}';
    }

}
