/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.euclides;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zorrompa
 */
public class EuclidesRecTest {
    
    public EuclidesRecTest() {
    }
   
    @Test
    public void testObtener_mcd() { 
        assertEquals(5, EuclidesRec.obtener_mcd(135, 25));
         
}
}
