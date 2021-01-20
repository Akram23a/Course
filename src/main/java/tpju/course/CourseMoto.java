package tpju.course;

import java.util.ArrayList;

public class CourseMoto implements Course{
	
	public Organisateur org;
    private ArrayList<Moto> motos;
    private ArrayList<Rider> riders;
	public Participant gagnant=null;

    
    public CourseMoto() {
    	this.org = Organisateur.getInstance();
    	motos = new  ArrayList<Moto>();
    	riders = new ArrayList<Rider>();
    }
    
    public Iterator getIterator() {
        return new MotoIterator();
     }
    
    public class MotoIterator implements Iterator{
    	
    	 int index = 0;

         public boolean hasNext() {
         
            if(index < motos.size()){
               return true;
            }
            return false;
         }

         public Object next() {
         
            if(this.hasNext()){
               return motos.get(index++);
              
            }
            return null;
         }		

    }
    

    public void ajouterPartcipant(Rider p) {
    	int existe = 0;
    	for(int i = 0 ; i < riders.size(); i++)
    		if(riders.get(i).getId().equals(p.getId())){
    			existe = 1;
    			break;
    		}
    	if(existe == 0)
    		riders.add(p);
    }
    
    public void enleverParticipant(Participant p) {
    	for(int i = 0 ; i < riders.size(); i++)
    		if(riders.get(i).getId().equals(p.getId())){
    			riders.remove(i);
    		}
    }
    
    public void gagnant(Participant P) {
    	this.gagnant=P;
    	P.setTitres(P.getTitres()+1);
    }
	public Organisateur getOrg() {
		return org;
	}

	public void setOrg(Organisateur org) {
		this.org = org;
	}
	
	public void addMoto(Moto m) {
		motos.add(m);
	}

	public ArrayList<Moto> getVoitures() {
		return motos;
	}

	public void setMotos(ArrayList<Moto> motos) {
		this.motos = motos;
	}
	
	public ArrayList<Rider> getRiders() {
		return riders;
	}

	public String getstr() {
		String s= "";
		int i=0;
		for( Participant c: riders) {
			i++;
			s+=i+":  "+c.getNom();
		}
		return s;
	}

	public void startRace() {
		// TODO Auto-generated method stub

		System.out.print("Car race started");
	}

	public void endRace() {
		// TODO Auto-generated method stub

		System.out.print("Car race finished");
	}




}
