package com.platzi.mensajes_app;

//import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {

        //Menú para ejecutar 4 operaciones CRUD.
        Scanner sc = new Scanner(System.in); //Clase Scanner nos permite leer datos desde consola.

        int opcion = 0;

        do{
            System.out.println("---------------");
            System.out.println("Aplicación de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");

            //Leer opción del usuario:
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while (opcion != 5);

        //Crear instancia de conexión para probar conexión inicial:
        /*Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }*/

        /**
         *Nota:
         * Santiago Bernal emplea anti-patrones que no deberían enseñarse:
         * > Caracteres espaciales como _ en el nombre de paquetes
         * > Spanglish.
         * > Nombre de clases en plural.
         *
         * Repo actualizado con buenas prácticas:
         * https://github.com/santiaguf/red_social/tree/master/src/main/java/com/santiago/red_social
         *
         * > Yo: No sigo el actualizado por claridad en el desarrollo del proyecto.
         */
    }
}
