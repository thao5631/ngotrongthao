/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanly;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QuanLy {
    static connectionDB kn = new connectionDB();
    public static void main(String[] args) {
        Connection cn = kn.getConnectDB();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "select *from Student ";
        try {
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                System.out.println("id: " + rs.getInt(1) + "\t name: " + rs.getString(2) + "\t age: " + rs.getString(3));
            }
        } catch (Exception e) {
            System.out.println("loi roi "+e);
        }

    } 

}
