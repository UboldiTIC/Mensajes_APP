package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {

    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO mensajes (mensaje, autor_mensaje, fecha_mensaje) VALUES (?,?,CURRENT_TIMESTAMP)"; //Parámetros con ? porque vienen del usuario.
                ps=conexion.prepareStatement(query); //establecemos conexión.
                ps.setString(1,mensaje.getMensaje()); //indicamos que enviamos parámetro 1 y lo traemos con get.
                ps.setString(2,mensaje.getAutor_mensaje());
                ps.executeUpdate(); //método que ejecuta la query.
                System.out.println("Mensaje creado");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void leerMensajesDB() {

    }

    public static void borrarMensajeDB(int id_mensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }

    /**
     * DAO = Data Access Object
     *
     * Contiene todos los métodos que permiten la conexión con la DB.
     * */
}
