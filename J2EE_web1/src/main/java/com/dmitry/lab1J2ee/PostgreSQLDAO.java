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


    public List<Motorbike> getFind(String request ) {
        List<Motorbike> bikes = new ArrayList<>();
        try (Connection connection = currentConnection) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(request);
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

}