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
public class CourseTest 

{
        public Course c;
        public Organisateur o;
        public Participant p;
        public Voiture v;

    public CourseTest()
    {

    }

    @Before
    public void setUp() // throws java.lang.Exception
    {
        o = new Organisateur("Julien","030204020");
        c = new Course(o);
        p = new Participant("Thomas", "032309232" );
        v = new Voiture();
        
    }

    @After
    public void tearDown() // throws java.lang.Exception
    {
    	
    }

    @Test
    public void testSupressionParticipant()
    {
        v.setModele("Audi A7");
        v.setVitesseMax(260);

        p.setNom("Thomas");
        p.setVoitureChoisie(v);
        
        c.ajouterPartcipant(p);
        
        c.enleverParticipant(p);
        assertTrue(!c.getParticipants().contains(p));
    }

    @Test
    public void testGagnerTitre()
    {
        v.setModele("Audi A7");
        v.setVitesseMax(260);

        p.setNom("Thomas");
        p.setVoitureChoisie(v);
        
        c.ajouterPartcipant(p);
        
        int AncienNbTitre = p.getTitre();
        c.gagnant(p);
        
        assertTrue(AncienNbTitre+1 == p.getTitre());
    }
}
