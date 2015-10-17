package Clases;

/**
 *
 * @author Victor Pino
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datos {

    private Connection con;

    public Datos() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Caja";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Connection getCon(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String db = "jdbc:mysql://localhost/Caja";
            con = DriverManager.getConnection(db, "root", "");
            return con;
        } catch (Exception ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean validarUsuario(String usuario, String clave) {
        try {
            /* Definimos la consulta en la base datos
            select 1 significa que si hay registro devuelve 1 si no 0 */
            String sql = "SELECT (1) FROM usuarios "
                    + "WHERE idUsuario = '" + usuario + "'"
                    + "AND clave = '" + clave + "'";

            /* Creamos el statement para poder enviarle la sentencia sql */
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    /* Funcion para insertar un empleado a la base de datos la cual recibe
     como parametro un objeto de la clase personal */
    public boolean agregarPersonal(Personal personal) {
        try {
            /* Definimos el codigo sql que queremos ejecutar. En este caso es un
            insert a la tabla personal */
            String sql = "INSERT INTO empleados VALUES("
                    + personal.getIdPersonal()+ ", '"
                    + personal.getCedula()+ "', '"
                    + personal.getNombre() + "', '"
                    + personal.getApellido() + "', "
                    + personal.getTelefono()+ ", '"
                    + personal.getCargo() + "')";

            /* El createStatement cree un cuadro donde se puede insertar codigo
            sql, el statement se podria decir que es el cuadro en blanco que
            te da el phpmyadmin para insertar codigo sql. */
            Statement st = con.createStatement();
            
            /* Una vez creado el statement el cuadrito mandamos a ejecutar el 
            codigo sql que definimos en la variable sql. */
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

     /* Funcion para insertar un proyecto a la base de datos la cual recibe
     como parametro un objeto de la clase Proyecto */
    public boolean agregarProyecto(Proyecto proyecto) {
        try {
             /* Definimos el codigo sql que queremos ejecutar. En este caso es un
            insert a la tabla proyecto */
            String sql = "INSERT INTO proyecto VALUES("
                    + proyecto.getIdProyecto()+ ", '"
                    + proyecto.getNombre() + "')";

            /* El createStatement cree un cuadro donde se puede insertar codigo
            sql, el statement se podria decir que es el cuadro en blanco que
            te da el phpmyadmin para insertar codigo sql. */
            Statement st = con.createStatement();
            
           /* Una vez creado el statement el cuadrito mandamos a ejecutar el 
            codigo sql que definimos en la variable sql. */
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    /* Funcion para insertar un usuario a la base de datos la cual recibe
     como parametro un OBJETO de la clase Usuario */
    public boolean agregarUsuario(Usuario usuario) {
        try {
            /* Definimos el codigo sql que queremos ejecutar. En este caso es un
            insert a la tabla usuarios */
            String sql = "INSERT INTO usuarios VALUES("
                    + usuario.getIdUsuario()+ ", "
                    + usuario.getIdTipo()+ ", '"
                    + usuario.getUsuario()+ "', '"
                    + usuario.getClave()+ "', '"
                    + usuario.getCorreo()+ "')";

            /* El createStatement cree un cuadro donde se puede insertar codigo
            sql, el statement se podria decir que es el cuadro en blanco que
            te da el phpmyadmin para insertar codigo sql. */
            Statement st = con.createStatement();
            
            /* Una vez creado el statement el cuadrito mandamos a ejecutar el 
            codigo sql que definimos en la variable sql. */
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
   
    public boolean modificarProyecto(int id, String nombre){
        
        try {
            String sql = "UPDATE proyecto SET  "
                    + " nom_pro = '"+ nombre + "'"
                    + " WHERE id_proyecto = "+ id +" ";
            
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean eliminarProyecto(int id){
        
        try {
            String sql = "DELETE FROM proyecto WHERE id_proyecto = "+ id +" ";
            
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    

    public ResultSet getProyectos() {

        try {
            String sql = "SELECT * FROM proyecto ";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public ResultSet getProductoNom(String nombre) {

        try {
            String sql = "SELECT * FROM proyecto "
                        + "WHERE nom_pro LIKE  '%" + nombre + "'";
                       
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
            
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    /* Funcion que sirve para validar si un proyecto ya esta registrado.
    - La funcion recibe como parametro un String el cual corresponde
    al nombre del proyecto.
    - La funcion retorna true si el nombre del proyecto se encuentra y
    si no false.
    */
    public boolean getProyecto(String nombre) {

        try {
            String sql = "SELECT * FROM proyecto "
                        + "WHERE nombre = '" + nombre + "'";
                       
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean getUsuario(String usuario) {

        try {
            String sql = "SELECT * FROM usuarios "
                        + "WHERE idUsuario  = '" + usuario + "'";
                       
             
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ventaProducto(String codigo, int cantidad){
        
        try {
            String sql = "UPDATE productos SET "
                    + "cantidad = "+ cantidad + " "
                    + "WHERE codigo = '"+ codigo +"'";
                    
                    
            
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public int getCanPro(String codigo) {
        try {
            String sql = "SELECT (cantidad) AS num FROM productos "
                    + "WHERE codigo = '"+ codigo + "'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num");
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    public int getNumFac() {
        try {
            String sql = "SELECT MAX(idFactura) AS num FROM factura";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("num") + 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public ResultSet reporteFactura(String inicial, String ultima){
    
        try {
            String sql = "SELECT factura.idFactura, detalleFactura.idProducto, "
                    + "detalleFactura.nombre, detalleFactura.costo, detalleFactura.cantidad, "
                    + " detalleFactura.cantidad * detalleFactura.costo AS Monto " 
                    + " FROM factura " 
                    +" INNER JOIN detallefactura ON factura.idFactura = detalleFactura.idFactura " 
                    +" WHERE fecha >= '"+ inicial + "' "
                    + "AND fecha <= '"+ ultima + "' ";
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Datos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    
    }
}