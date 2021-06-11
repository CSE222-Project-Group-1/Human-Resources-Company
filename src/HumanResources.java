package src;

import java.util.*;

public class HumanResources extends Users implements Comparable<HumanResources>{
	private HRC hrc=null;
	
	public HumanResources(int userID, String name, String password, HRC hrc){
		super(userID, name, password, Users.HUMAN_SOURCES);
        this.hrc = hrc;
	}

	public boolean loginSystem(String name,String password) {
		if (getName().equals(name) && this.getPassword().equals(password))
			return true;
		return false;
	}

	public boolean DeleteCandidate(int userID) {
        hrc.getCandidate().remove(userID);
		return false;
	}

	public void SeeCompanyRequest(){
    //		hrc.getCompany()

	}

	public Candidate GiveOfferToCandidate() {
		Candidate aCandidate = null;
		return aCandidate;
	}

	public void SuggestCandidateToCompany(Candidate candidate, AdvertiseClass as){
		as.getSuggested().add(candidate);
	}

	public boolean CompareRequests() {
		return false;
	}

	public boolean ArrangeMeeting() {
		return false;
	}

	public String toString() {
		StringBuilder aString =new StringBuilder();
		return aString.toString();
	}

    
	public int compareTo(HumanResources humanRes) {
        if(getUserID() > humanRes.getUserID() )
            return 1;
        else if(getUserID() < humanRes.getUserID())
            return -1;
        else
            return 0;    
	}

    public boolean equals(HumanResources humanRes){
        return (compareTo(humanRes) == 0);
    }
    

	
    
}
