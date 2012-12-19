/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Kayttoliittyma.Kayttoliittyma;
import Keskiarvo.Keskiarvo;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antti
 */
public class OpintojenSeurantaTest {

    Keskiarvo ka;
    ArrayList<Integer> lista;

    @Before
    public void setUp() {
        ka = new Keskiarvo();

        lista = new ArrayList<Integer>();
    }
    
    @Test
    public void keskiarvoLasketaanOikein() {
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);
        lista.add(5);

        assertEquals(5.0, ka.laske(lista), 0.001);

    }
    
    @Test
    public void hallinnonKirjautuminenOnnistuu() {
        Kayttoliittyma liittyma = new Kayttoliittyma(new Scanner(System.in));
        String tunnus = "hallinto";
        String salasana = "gangnamstyle";
        
        assertTrue(liittyma.kirjaudu(tunnus, salasana));
    }
    
    @Test
    public void opiskelijanKirjautuminenOnnistuu() {
        Kayttoliittyma liittyma = new Kayttoliittyma(new Scanner(System.in));
        String tunnus = "opiskelija";
        String salasana = "macarena";
        
        assertTrue(liittyma.kirjaudu(tunnus, salasana));
    }
    
    @Test
    public void vaarillaTunnuksillaKirjautuminenEiOnnistu() {
        Kayttoliittyma liittyma = new Kayttoliittyma(new Scanner(System.in));
        String tunnus = "aaa";
        String salasana = "aaa";
        
        assertFalse(liittyma.kirjaudu(tunnus, salasana));
    }
    
    @Test
    public void negatiivinenArvosanaEiMuutaTulosta() {
        lista.add(5);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        lista.add(0);

        assertEquals(0, ka.laske(lista), 0.001);
    }
}
