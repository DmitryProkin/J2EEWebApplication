package com.dmitry.lab1J2ee;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.sql.DataSource;
@WebService(serviceName = "MotorbikeService")
public class MotorbikeWebService {
    @Resource(lookup = "jdbc/db_web_lab")
    private DataSource dataSource;
    @WebMethod(operationName = "getAllBikes")
    public List<Motorbike> getAllPersons() {

        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getAllBikes();
    }
    @WebMethod(operationName = "getFind")
    public List<Motorbike> getFind(@WebParam(name = "personRequest") String brand, String model, String color, String fueltank, String weight){
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getFind(brand, model, color, fueltank, weight);
    }
    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MotorbikeWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
