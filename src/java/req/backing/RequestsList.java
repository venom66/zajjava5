/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package req.backing;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import req.facade.RequestFacadeLocal;

/**
 *
 * @author bdobrosielski
 */
@Named(value = "requestsList")
@RequestScoped
public class RequestsList {

    @EJB(name = "requestFacade")
    private RequestFacadeLocal requestFacade;

    
    
    public RequestsList() {
    }
    
      public List<req.entities.Request> getAllRequests() {
          return requestFacade.findAll();
      }
    
}
