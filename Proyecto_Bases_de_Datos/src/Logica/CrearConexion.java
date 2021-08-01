package Logica;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearConexion{
    private Connection conexion;
    private final String bd="proyecto_crm";
    private String user;
    private String password;
    private String host;
    private String server;
    
    public CrearConexion(){
        
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void createServer(){
        this.server = "jdbc:mysql://"+this.host+"/"+this.bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&"
            + "useLegacyDatetimeCode=false&serverTimezone=UTC";
    }
    
    public void establishConnection(){
        
    }
    

    
}
