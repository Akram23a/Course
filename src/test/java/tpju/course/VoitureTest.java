package tpju.course;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import junit.framework.TestCase;

/**
 * Classe-test VoitureTest.
 *
 * @author Akram, Ayoub
 * @version 2.0

 */
public class VoitureTest 

{
        public Voiture v;
        public Participant p;

    public VoitureTest()
    {

    }

    @Before
    public void setUp() // throws java.lang.Exception
    {
        this.v = new Voiture();
        v.setModele("Audi A7");
        v.setVitesseMax(260);
        
        this.p = new Participant();
        p.setNom("Thomas");
        p.setVoitureChoisie(v);
        
        v.setProprietaire(p); 
    }

    @After
    public void tearDown() // throws java.lang.Exception
    {
    	
    }

    @Test
    public void testDepasseVitesse()
    {
        Voiture testV = new Voiture();
        testV.setVitesseMax(250);
        assertEquals(true, testV.depasseVitesse(230));
    }
    
    @Test
    public void testAttribution()
    {
        assertEquals(v.getProprietaire().getNom(), p.getNom());
        assertEquals(p.getVoiture().getModele(), v.getModele());
    }
    
    @Test
    public void testListeVoitures() {
    	Voiture v3 = new  Voiture("mod1",220);
    	this.p.addVoiture(v3);
    	Voiture v4 = new  Voiture("mod2",210);
    	this.p.addVoiture(v4);
    	Voiture v5 = new  Voiture("mod3",200);
    	this.p.addVoiture(v5);
    	
        assertEquals(v5.getProprietaire().getNom(), p.getNom());
        assertEquals(p.getVoitures().get(2).getModele(), v5.getModele());
    }
    @Test
    public void testVoitureParticipant() {

    	assertTrue(!v.equals(null));
        assertEquals(v, v);
        v.equals(new Voiture("Donald", 230));
        assertTrue(v.equals(v));
    }
    
  
    
}
