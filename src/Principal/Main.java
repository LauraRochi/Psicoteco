/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import Ventanas.*;
import Modelo.*;

/**
 *
 * @author laura.giraldot
 */
public class Main {
    public static void main (String[] args) {
        
        // Se llama la clase Conexion para conectar con la base de datos
        Conexion conexionDB = new Conexion();
        
        EstudianteNuevo est = new EstudianteNuevo();
        est.setVisible(true);
    }
    
}
