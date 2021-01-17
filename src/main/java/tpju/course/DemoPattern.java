package tpju.course;

public class DemoPattern {
	public static void main(String[] args) {
		Voiture v1= new Voiture("voiture1",190);
		Voiture v2= new Voiture("voiture2",195);
		Voiture v3= new Voiture("voiture3",180);
		Voiture v4= new Voiture("voiture4",185);
		
		v3.addVoiturePlusRapide(v1);
		v3.addVoiturePlusRapide(v2);
		v3.addVoiturePlusRapide(v4);
		
		v4.addVoiturePlusRapide(v1);
		v4.addVoiturePlusRapide(v2);
		
		v1.addVoiturePlusRapide(v2);

		System.out.println("les voitures les plus rapides que v3 sont");
		for(Voiture v: v3.voituresPlusRapides) {
			System.out.println(v.getModele());
		}
		
	
		
		CourseVoiture courseVoiture = new CourseVoiture();
		
		courseVoiture.addVoitures(v1);
		courseVoiture.addVoitures(v3);
		courseVoiture.addVoitures(v2);
		
		
        for(Iterator iter = courseVoiture.getIterator(); iter.hasNext();){
    	   Voiture v = (Voiture) iter.next();
           System.out.println("Name : " + v.getModele());
        } 
        
        
        
        
        Moto m1= new Moto("Moto1","model1");
        Moto m2= new Moto("Moto2","model2");
		Moto m3= new Moto("Moto3","model3");
		
		
        CourseMoto courseMoto = new CourseMoto();
		
        courseMoto.addMoto(m1);
		courseMoto.addMoto(m3);
		courseMoto.addMoto(m2);
		
        for(Iterator iter = courseMoto.getIterator(); iter.hasNext();){
    	   Moto v = (Moto) iter.next();
           System.out.println("Name : " + v.getBrand());
        }
	}

}
