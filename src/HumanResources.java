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

	public ArrayList<AdvertiseClass> SeeCompanyRequest(int companyID){
        return hrc.getCompanyID(companyID).getAdvertises();
	}
    
	public int CompareRequests(AdvertiseClass as, AdvertiseClass as2){
        return as.compareTo(as2);
	}
    
	public boolean GiveOfferToCandidate(Candidate candidate, int offer){
		return candidate.evaluateTheOffer(offer);
	}

	public boolean ArrangeMeeting(String date, Candidate candidate, Company company, String time, int meetingRate){
        hrc.getMeetings().add( new Meetings(date, candidate, company, time, meetingRate));
		return true;
	}

	public void SuggestCandidateToCompany(Candidate candidate, AdvertiseClass as){
		as.getSuggested().add(candidate);
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
