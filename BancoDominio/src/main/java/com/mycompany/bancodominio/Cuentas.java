/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

import java.util.Date;

/**
 * Clase POJO de Cuentas
 *
 * @author rober
 */
public class Cuentas {

    private int id;
    private int id_Cliente;
    private int numeroCuenta;
    private Date fechaApertura;
    private double saldo;

    public Cuentas() {
    }

    public Cuentas(int id_cliente, int numeroCuenta, Date fechaApertura, double saldo) {
        this.id_Cliente = id_cliente;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public Cuentas(int id, int id_cliente, int numeroCuenta, Date fechaApertura, double saldo) {
        this.id = id;
        this.id_Cliente = id_cliente;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_cliente) {
        this.id_Cliente = id_cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "id=" + id + ", id_Cliente=" + id_Cliente + ", numeroCuenta=" + numeroCuenta + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + '}';
    }

}
