package tpju.course;

import java.util.ArrayList;

public class DemoPattern {
	public static void main(String[] args) {
		
		Voiture v1= new Voiture("voiture1",190);
		Voiture v2= new Voiture("voiture2",195);
		Voiture v3= new Voiture("voiture3",180);
		Voiture v4= new Voiture("voiture4",185);
		
		v3.addVehiculePlusRapide(v1);
		v3.addVehiculePlusRapide(v2);
		v3.addVehiculePlusRapide(v4);
		
		v4.addVehiculePlusRapide(v1);
		v4.addVehiculePlusRapide(v2);
		
		v1.addVehiculePlusRapide(v2);

		System.out.println("les voitures les plus rapides que v3 sont");
		for(Vehicule v: v3.getVehiculesPlusRapides()) {
			System.out.println(v.getModele());
		}
		
		// Factory use
		CourseFactory factory= new CourseFactory();
		
		CourseVoiture courseVoiture = (CourseVoiture) factory.getCourse("voiture");
		
		courseVoiture.addVoitures(v1);
		courseVoiture.addVoitures(v3);
		courseVoiture.addVoitures(v2);
		
		// Iterator use
        for(Iterator iter = courseVoiture.getIterator(); iter.hasNext();){
    	   Voiture v = (Voiture) iter.next();
           System.out.println("Name : " + v.getModele());
        } 
        
        
        
        
        Moto m1= new Moto("Model1",100);
        Moto m2= new Moto("Model2",100);
        Moto m3= new Moto("Model3",100);
		courseVoiture.startRace();
		courseVoiture.endRace();

		
        CourseMoto courseMoto = new CourseMoto();
		
        courseMoto.addMoto(m1);
		courseMoto.addMoto(m3);
		courseMoto.addMoto(m2);
		
        for(Iterator iter = courseMoto.getIterator(); iter.hasNext();){
    	   Vehicule v = (Vehicule) iter.next();
           System.out.println("Name : " + v.getModele());
        }
        
 
        
        
	}
	
	
	

}
