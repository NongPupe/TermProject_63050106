/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Covidnoi;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author NongPupe
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("databasePU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findbyyear")
    public Covidnoi findbyyear(@WebParam(name = "year") int year) {
        EntityManager em = emf.createEntityManager();
        Covidnoi cov = em.find(Covidnoi.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */
   
}
