/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

import java.util.Date;

/**
 * Clase POJO de Clientes
 *
 * @author rober
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private Date fechaNacimineto;
    private String usuario;
    private String contrasena;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidoP, String apellidoM, Date fechaNacimineto, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimineto = fechaNacimineto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Cliente(int id, String nombre, String apellidoP, String apellidoM, Date fechaNacimineto, String usuario, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimineto = fechaNacimineto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", fechaNacimineto=" + fechaNacimineto + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

}
