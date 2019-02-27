package com.dmitry.lab1J2ee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLDAO {

    private Connection currentConnection;

    public PostgreSQLDAO(Connection connection) {
        this.currentConnection = connection;
    }

    public List<Motorbike> getAllBikes() {
        List<Motorbike> bikes = new ArrayList<>();
        try (Connection connection = currentConnection) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from motorbikes");
            while (rs.next()) {
                Long id = rs.getLong("id");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String color = rs.getString("color");
                String fueltank= rs.getString("fueltank");
                String weight = rs.getString("weight");

                Motorbike bike = new Motorbike(id, brand, model, color, fueltank, weight);
                bikes.add(bike);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bikes;
    }


    public List<Motorbike> getFind(String brand, String model, String color, String fueltank, String weight ) {
        List<Motorbike> bikes = new ArrayList<>();
        ArrayList<String> particles = new ArrayList<>();
        try (Connection connection = currentConnection) {
            Statement stmt = connection.createStatement();
            if(brand.trim().length()!=0){particles.add("brand='"+brand+"'");}
            if(model.trim().length()!=0){particles.add("model='"+model+"'");}
            if(color.trim().length()!=0){particles.add("color='"+color+"'");}
            if(fueltank.trim().length()!=0){particles.add("fueltank='"+fueltank+"'");}
            if(weight.trim().length()!=0){particles.add("weight='"+weight+"'");}
            String request= "Select * from motorbikes where ";
            request = request  +particles.get(0);
            for (int i=0;i<particles.size();i++){
                request+= " and " +particles.get(i);
            }
            request+= ';';
            ResultSet rs = stmt.executeQuery(request);
            while (rs.next()) {
                Long id = rs.getLong("id");
                brand = rs.getString("brand");
                model = rs.getString("model");
                color = rs.getString("color");
                fueltank= rs.getString("fueltank");
                weight = rs.getString("weight");

                Motorbike bike = new Motorbike(id, brand, model, color, fueltank, weight);
                bikes.add(bike);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bikes;
    }

}