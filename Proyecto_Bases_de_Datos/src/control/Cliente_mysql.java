package control;
import GUI.*;
import java.sql.*;


public class Cliente_mysql{
        
    
    
        public static void Info(String procedimiento){
        
        }
        public static void main (String[] args){
            String user = "admin1";
            String password = "admin1pass";
            String host = "localhost";
            String server="jdbc:mysql://"+host+"/"+"proyecto_crm"+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&";
            
            try{
                Connection conexion = DriverManager.getConnection(server,user,password);
                
                CallableStatement procedimiento = conexion.prepareCall("{call CLIENTES_DISTRIBUCION_PAIS}");
                ResultSet rs = procedimiento.executeQuery();
              
                while(rs.next()){
                    System.out.println(rs.getString(1)+" "+rs.getString(2));
                }
                rs.close();
            }catch(Exception e){
                System.out.println("error");
                
            }
        
        }

}