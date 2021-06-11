package src;

import java.util.*;

public class HumanResources extends Users implements Comparable<HumanResources>{
	private static HRC hrc=null;
	
	public HumanResources(int userID, String name, String password){
		super(userID, name, password, Users.HUMAN_SOURCES);
	}

	public boolean loginSystem(String name,String password) {
		if (getName().equals(name) && this.getPassword().equals(password))
			return true;
		return false;
	}

	public void SeeCompanyRequest() {
		
	}

	public Candidate GiveOfferToCandidate() {
		Candidate aCandidate = null;
		return aCandidate;
	}

	public void SuggestCandidateToCompany() {
		
	}

	public boolean CompareRequests() {
		return false;
	}
    
	public boolean DeleteCandidate() {
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
