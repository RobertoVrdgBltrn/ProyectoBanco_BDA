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
public class OperacionesNuevoDTO {

    private int id;
    private int id_Cuenta;
    private Date fechaOperacion;
    private double monto;

    public OperacionesNuevoDTO() {
    }

    public OperacionesNuevoDTO(int id_Cuenta, Date fechaOperacion, double monto) {
        this.id_Cuenta = id_Cuenta;
        this.fechaOperacion = fechaOperacion;
        this.monto = monto;
    }

    public OperacionesNuevoDTO(int id, int id_Cuenta, Date fechaOperacion, double monto) {
        this.id = id;
        this.id_Cuenta = id_Cuenta;
        this.fechaOperacion = fechaOperacion;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Cuenta() {
        return id_Cuenta;
    }

    public void setId_Cuenta(int id_Cuenta) {
        this.id_Cuenta = id_Cuenta;
    }

    public Date getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(Date fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "OperacionesNuevoDTO{" + "id=" + id + ", id_Cuenta=" + id_Cuenta + ", fechaOperacion=" + fechaOperacion + ", monto=" + monto + '}';
    }

}
