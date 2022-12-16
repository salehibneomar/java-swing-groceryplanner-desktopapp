
package GroceryPlanner;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class DB {

    private final String host = "jdbc:mysql://localhost:3306/java_grocery_planner";
    private final String user = "root";
    private final String pwd = "";
    private Connection conn=null;
    private PreparedStatement pstmt=null;

    public void Retrive(DefaultTableModel table){
        try{
            table.setRowCount(0);
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql = "SELECT * FROM gp_tbl";
            pstmt = conn.prepareStatement(sql);
            
            ResultSet fetch = pstmt.executeQuery();
            int i=1;
            
            while(fetch.next()){
                table.addRow(new Object[]{i,fetch.getString(2),
                                            fetch.getString(3),
                                            fetch.getInt(4),
                                            fetch.getDouble(5),
                                            fetch.getDouble(6)});
                i++;
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
    }
    
    
    public void Insert(String name, String cat, int amount, double price, double tPrice){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql="INSERT INTO gp_tbl(item_nm, item_cat, item_amn, item_price, item_tprice) VALUES(?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, name);
            pstmt.setString(2, cat);
            pstmt.setInt(3, amount);
            pstmt.setDouble(4, price);
            pstmt.setDouble(5, tPrice);
            
            pstmt.executeUpdate();
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                   pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
    }
    
    public void Update(int amount, double price, double tPrice, int i){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql="UPDATE gp_tbl SET item_amn=?, item_price=?, item_tprice=? WHERE id=?";
            pstmt = conn.prepareStatement(sql);
            
            pstmt.setInt(1, amount);
            pstmt.setDouble(2, price);
            pstmt.setDouble(3, tPrice);
            pstmt.setInt(4, i);
            
            pstmt.executeUpdate();
            
            
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
    }
    
    public void Delete(String item_name){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql="DELETE FROM gp_tbl WHERE item_nm=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,item_name);
            pstmt.executeUpdate();
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
    }
    
    public int getID(String item_name){
        int i=0;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql="SELECT id FROM gp_tbl WHERE item_nm=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,item_name);
            ResultSet fetch = pstmt.executeQuery();
            fetch.next();
            i=fetch.getInt(1);
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
        return i;
    }
    
    /*public void TruncateTable(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql="TRUNCATE TABLE gp_tbl";
            pstmt = conn.prepareStatement(sql);
            pstmt.executeQuery();
        }
        catch(Exception e){
            
        }
    }*/
    
    public boolean sameNameValidate(String name){
        boolean check=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(host, user, pwd);
            String sql = "SELECT * FROM gp_tbl";
            pstmt = conn.prepareStatement(sql);
            ResultSet fetch = pstmt.executeQuery();
            
            while(fetch.next()){
                if(name.equals(fetch.getString(2))){
                    check=true;
                    break;
                }
            }
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Database connection error!");
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
            }
            catch(SQLException e){}
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){}
        }
        return check;
    }

}
