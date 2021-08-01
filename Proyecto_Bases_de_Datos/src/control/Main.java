package control;

import GUI.*;
import Logica.*;
import java.sql.Connection;


public class Main extends Login{
    
    private static Logica.CrearConexion conexion1 = new CrearConexion();
    
    public static CrearConexion getCrearConexion(){
        return conexion1;
    }
    
    public static void main(String[] args){
        
        Login login2 = new Login();
        login2.setVisible(true);
        
    }
    
    
}
