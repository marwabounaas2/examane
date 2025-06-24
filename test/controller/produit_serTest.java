/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author marwa
 */
public class produit_serTest {
    
       @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpServletDispatcher Dispatcher = mock(HttpServletDispatcher.class);
        when(request.getParameter("designation")).thenReturn("M");
        when(request.getParameter("prix")).thenReturn("2");
        when(request.getParameter("quantite")).thenReturn("5");
        produit_ser instance = new produit_ser();
        instance.doPost(request, response);
        

    }
    
}
