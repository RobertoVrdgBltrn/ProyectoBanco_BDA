/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

/**
 * Clase POJO de Transferencias, esta clase esta relacionada con Operaciones
 *
 * @author rober
 */
public class Transferencias {

    private int id;
    private int id_Operacion;
    private int id_CuentaOrige;
    private int id_CuentaDestino;

    public Transferencias() {
    }

    public Transferencias(int id_Operacion, int id_CuentaOrige, int id_CuentaDestino) {
        this.id_Operacion = id_Operacion;
        this.id_CuentaOrige = id_CuentaOrige;
        this.id_CuentaDestino = id_CuentaDestino;
    }

    public Transferencias(int id, int id_Operacion, int id_CuentaOrige, int id_CuentaDestino) {
        this.id = id;
        this.id_Operacion = id_Operacion;
        this.id_CuentaOrige = id_CuentaOrige;
        this.id_CuentaDestino = id_CuentaDestino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Operacion() {
        return id_Operacion;
    }

    public void setId_Operacion(int id_Operacion) {
        this.id_Operacion = id_Operacion;
    }

    public int getId_CuentaOrige() {
        return id_CuentaOrige;
    }

    public void setId_CuentaOrige(int id_CuentaOrige) {
        this.id_CuentaOrige = id_CuentaOrige;
    }

    public int getId_CuentaDestino() {
        return id_CuentaDestino;
    }

    public void setId_CuentaDestino(int id_CuentaDestino) {
        this.id_CuentaDestino = id_CuentaDestino;
    }

    @Override
    public String toString() {
        return "Transferencias{" + "id=" + id + ", id_Operacion=" + id_Operacion + ", id_CuentaOrige=" + id_CuentaOrige + ", id_CuentaDestino=" + id_CuentaDestino + '}';
    }

}
