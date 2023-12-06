package dal;
import java.sql.*;

/**
 *
 * @author CT Desenvolvimento
 */
public class moduloConexao {
    //metodo responsável por estabelecer a conexãõ com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo chamara o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informacao referente ao banco
        String url = "jdbc:mysql://localhost:3306/agenda ";
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        }catch (Exception e){
            return null;
            
        }
    }
}
