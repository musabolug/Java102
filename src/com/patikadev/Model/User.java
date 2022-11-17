package com.patikadev.Model;

import com.patikadev.Help.DBConnector;
import com.patikadev.Help.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String username;
    private String pass;
    private String type;
    public User(){}

    public User(int id, String name, String username, String pass, String type) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.pass = pass;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public static ArrayList<User> getList(){
        ArrayList<User> userlist = new ArrayList<>();
        String query = "SELECT * FROM public.userlist";
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
                userlist.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return userlist;
    }

    public static boolean add(String name, String username,String pass ,String type){
        String query= "INSERT INTO public.userlist(name, username, pass, type) VALUES (?, ?, ?, ?);";
        User findUser = User.getFetch(username);
        if (findUser != null){
            Helper.showMessage("Bu kullanıcı adı daha önce alınmış. Lütfen farklı bir kullanıcı adı giriniz! ");
            return false;
        }
        int result;
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,username);
            pr.setString(3,pass);
            pr.setString(4,type);
            result=  pr.executeUpdate();
            if (pr.executeUpdate() == -1){
                Helper.showMessage("error");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result ==1;
    }
    public static User getFetch(String username){
        User obj = null;
        String query = "SELECT * FROM public.userlist WHERE username = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,username);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
    public static boolean delete(int id){
        int result;
        String query = "DELETE FROM public.userlist WHERE id = ?";
        ArrayList<Course> courseList = Course.getListByUser(id);
        for (Course c : courseList){
            Course.delete(c.getId());
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            result = pr.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result == 1;
    }
    public static boolean update(int id ,String name,String username, String pass,String type){
        int result;
        String query ="UPDATE public.userlist SET name=?,username=?,pass=?,type=? WHERE id=?";
        User findUser = User.getFetch(username);
        if (findUser != null && findUser.getId() != id){
            Helper.showMessage("Bu kullanıcı adı daha önceden girilmiş. Lütfen başka bir kullanıcı adı giriniz");
            return false;
        }
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,username);
            pr.setString(3,pass);
            pr.setString(4,type);
            pr.setInt(5,id);
            result= pr.executeUpdate() ;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result == 1;
    }
    public static ArrayList<User> searchUSerList(String query){
        ArrayList<User> userlist = new ArrayList<>();
        User obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
                userlist.add(obj);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return userlist;
    }
    public static String searchQuery(String name, String username,String type){
        String query = "SELECT * FROM public.userlist WHERE username LIKE '%{{username}}%' AND name LIKE '%{{name}}%'";
        query = query.replace("{{username}}" , username);
        query = query.replace("{{name}}" , name);
        if (!type.isEmpty()){
            query += "AND type LIKE '%{{type}}%'";
            query = query.replace("{{type}}" , type);
        }

        return query;
    }
    public static User getFetch(int id ){
        User obj = null;
        String query = "SELECT * FROM public.user WHERE id = ?";
        try{
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setInt(1,id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                obj = new User();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return obj;
    }
    public static User getFetch(String username, String pass){
        User obj = null;
        String query = "SELECT * FROM public.userlist WHERE username = ? AND pass = ?";
        try {
            PreparedStatement pr = DBConnector.getInstance().prepareStatement(query);
            pr.setString(1,username);
            pr.setString(2,pass);
            ResultSet rs = pr.executeQuery();
            if (rs.next()){
                switch (rs.getString("type")){
                    case "operator":
                        obj = new Operator();
                        break;
                    default:
                        obj = new User();
                        break;
                }

                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUsername(rs.getString("username"));
                obj.setPass(rs.getString("pass"));
                obj.setType(rs.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
