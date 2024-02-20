/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

/**
 * Clase POJO de Cliente direccion, esta clase es para complementar la direccion
 * del cliente
 *
 * @author rober
 */
public class ClienteDireccion {

    private int id;
    private int id_Cliente;
    private String calle;
    private String numero;
    private String colonia;

    public ClienteDireccion() {
    }

    public ClienteDireccion(int id_Cliente, String calle, String numero, String colonia) {
        this.id_Cliente = id_Cliente;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public ClienteDireccion(int id, int id_Cliente, String calle, String numero, String colonia) {
        this.id = id;
        this.id_Cliente = id_Cliente;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
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

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return "ClienteDireccion{" + "id=" + id + ", id_Cliente=" + id_Cliente + ", calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + '}';
    }

}
