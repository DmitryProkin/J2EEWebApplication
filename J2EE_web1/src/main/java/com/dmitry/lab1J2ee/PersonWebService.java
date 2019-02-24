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
@WebService(serviceName = "PersonService")
public class PersonWebService {
    @Resource(lookup = "jdbc/db_web_lab")
    private DataSource dataSource;
    @WebMethod(operationName = "getAllPersons")
    public List<Person> getAllPersons() {

        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getAllPersons();
    }
    @WebMethod(operationName = "getFind")
    public List<Person> getFind(@WebParam(name = "personRequest") String request){
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getFind(request);
    }
    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}