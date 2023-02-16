/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// CÓDIGO PARA CONECTAR BASE DE DATOS DE LOCAL HOST

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author laura.giraldot
 */
public class Conexion {
    Connection connection;
    
    // Direcciones de la base de datos y localhost
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/psicoteco1";
    String usuario = "root";
    String contrasena = "";    
    
    // Conexión con base de datos
    public Conexion() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            if(connection!=null){
                System.out.println("Conexion exitosa con la base de datos");
            }
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexion con la base de datos");
        }
    }
    
    // Función que retorna la clase Connection
    
    public Connection getCConnection(){
        return connection;
    }
}

