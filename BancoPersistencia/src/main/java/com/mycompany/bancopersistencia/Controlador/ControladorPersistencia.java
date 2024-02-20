/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancopersistencia.Controlador;

import com.mycompany.bancodominio.Cliente;
import com.mycompany.bancodominio.Controlador.DTOS.ClienteNuevoDTO;
import com.mycompany.bancopersistencia.Conexion.ConexionBD;
import com.mycompany.bancopersistencia.Conexion.IConexionBD;
import com.mycompany.bancopersistencia.DAOS.ClienteDAO;
import com.mycompany.bancopersistencia.DAOS.IClienteDAO;
import com.mycompany.bancopersistencia.Excepciones.PersistenciaExcepcion;

/**
 *
 * @author labcisco
 */
public class ControladorPersistencia {
    String cadenaConexion = "jdbc:mysql://localhost/ecoactivistas";
    String usuario = "root";
    String contrasenia = "maye";
    IConexionBD conexionBD = new ConexionBD(cadenaConexion, usuario, contrasenia);
    IClienteDAO activistaDAO = new ClienteDAO(conexionBD);
    
    public Cliente agregarActivista(ClienteNuevoDTO  acti) throws PersistenciaExcepcion{
        Cliente clienteAgregado = this.activistaDAO.agregarCliente(acti);
        return clienteAgregado;
    }
}
