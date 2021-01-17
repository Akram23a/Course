package tpju.course;

import java.util.ArrayList;

public class CourseVoiture{
	
	public Organisateur org;
    private ArrayList<Voiture> voitures;
    private ArrayList<Conducteur> conducteurs;
	public Participant gagnant=null;

    public CourseVoiture() {
    	setVoitures(new  ArrayList<Voiture>());
    	conducteurs = new ArrayList<Conducteur>();
    }
    
    public CourseVoiture(Organisateur org) {
    	this.setOrg(Organisateur.getInstance());
    	setVoitures(new  ArrayList<Voiture>());
    	conducteurs = new ArrayList<Conducteur>();
    }
    
    public Iterator getIterator() {
        return new VoitureIterator();
     }
    
    public class VoitureIterator implements Iterator{
    	
    	 int index = 0;

         public boolean hasNext() {
         
            if(index < voitures.size()){
               return true;
            }
            return false;
         }

         public Object next() {
         
            if(this.hasNext()){
               return voitures.get(index++);
              
            }
            return null;
         }		

    }
    

    public void ajouterPartcipant(Conducteur p) {
    	int existe = 0;
    	for(int i = 0 ; i < conducteurs.size(); i++)
    		if(conducteurs.get(i).getId().equals(p.getId())){
    			existe = 1;
    			break;
    		}
    	if(existe == 0)
    		conducteurs.add(p);
    }
    
    public void enleverParticipant(Participant p) {
    	for(int i = 0 ; i < conducteurs.size(); i++)
    		if(conducteurs.get(i).getId().equals(p.getId())){
    			conducteurs.remove(i);
//    			break;
    		}
    }
    
    public void gagnant(Participant P) {
    	this.gagnant=P;
    	P.setTitre(P.getTitre()+1);
    }
	public Organisateur getOrg() {
		return org;
	}

	public void setOrg(Organisateur org) {
		this.org = org;
	}

	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}
	
	public void addVoitures(Voiture voiture) {
		this.voitures.add(voiture);
	}
	
	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	public ArrayList<Conducteur> getParticipants() {
		return conducteurs;
	}

	public String getstr() {
		String s= "";
		int i=0;
		for( Conducteur c: conducteurs) {
			i++;
			s+=i+":  "+c.getNom();
		}
		return s;
	}

}
