/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancopersistencia.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author labcisco
 */
public interface IConexionBD {

    public Connection crearConexion() throws SQLException;

}
