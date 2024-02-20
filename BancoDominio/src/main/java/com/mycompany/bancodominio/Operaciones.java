/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

import java.util.Date;

/**
 * Clase POJO de Operaciones
 *
 * @author rober
 */
public class Operaciones {

    private int id;
    private int id_Cuenta;
    private Date fechaOperacion;
    private double monto;

    public Operaciones() {
    }

    public Operaciones(int id_cuenta, Date fechaOperacion, double monto) {
        this.id_Cuenta = id_cuenta;
        this.fechaOperacion = fechaOperacion;
        this.monto = monto;
    }

    public Operaciones(int id, int id_cuenta, Date fechaOperacion, double monto) {
        this.id = id;
        this.id_Cuenta = id_cuenta;
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
        return "Operaciones{" + "id=" + id + ", id_cuenta=" + id_Cuenta + ", fechaOperacion=" + fechaOperacion + ", monto=" + monto + '}';
    }

}
