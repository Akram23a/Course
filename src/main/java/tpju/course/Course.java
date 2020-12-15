package tpju.course;

import java.util.ArrayList;

public class Course {
	private Organisateur org;
    private ArrayList<Voiture> voitures;
    private ArrayList<Participant> participants;
	public Participant gagnant=null;

    public Course() {
    	
    	
    }
    
    public Course(Organisateur org) {
    	this.setOrg(new Organisateur(org));
    	setVoitures(new  ArrayList<Voiture>());
    	participants = new ArrayList<Participant>();
    }
    

    public void ajouterPartcipant(Participant p) {
    	int existe = 0;
    	for(int i = 0 ; i < participants.size(); i++)
    		if(participants.get(i).getId().equals(p.getId())){
    			existe = 1;
    			break;
    		}
    	if(existe == 0)
    		participants.add(p);
    }
    
    public void enleverParticipant(Participant p) {
    	for(int i = 0 ; i < participants.size(); i++)
    		if(participants.get(i).getId().equals(p.getId())){
    			participants.remove(i);
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

	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	public ArrayList<Participant> getParticipants() {
		return participants;
	}

}
