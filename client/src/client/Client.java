/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import service.Coviddata;

/**
 *
 * @author NongPupe
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Coviddata covid = findbyyear(2022);
       System.out.println(covid);
    }

    private static Coviddata findbyyear(int year) {
        service.NewWebService_Service service = new service.NewWebService_Service();
        service.NewWebService port = service.getNewWebServicePort();
        return port.findbyyear(year);
    }
    
}
