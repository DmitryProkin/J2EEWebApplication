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

    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList<>();
        try (Connection connection = currentConnection) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from persons");
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String secondname = rs.getString("secondname");
                int age = rs.getInt("age");

                Person person = new Person(id, name, surname, secondname, age);
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }


    public List<Person> getFind(String request ) {
        List<Person> persons = new ArrayList<>();
        try (Connection connection = currentConnection) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(request);
            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String secondname = rs.getString("secondname");
                int age = rs.getInt("age");

                Person person = new Person(id, name, surname, secondname, age);
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }

}