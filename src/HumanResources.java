package src;

import java.util.*;
import src.book_implementation.HeapSort;

public class HumanResources extends Users implements Comparable<HumanResources>{
	private HRC hrc=null;
	
	public HumanResources(int userID, String name, String password, HRC hrc){
		super(userID, name, password, Users.HUMAN_SOURCES);
        this.hrc = hrc;
        System.out.println("Your user id is " + userID);
	}

    /**
     * Removes candidate with userID
     * @param userID id of candidate to remove
     * @return true if successful
     */
	public boolean DeleteCandidate(int userID) {
        hrc.getCandidate().remove(userID);
		return true;
	}

    /**
     * 
     * @param companyID id of company
     * @return
     */
	public ArrayList<AdvertiseClass> SeeCompanyRequest(int companyID){
        return hrc.getCompanyID(companyID).getAdvertises();
	}
    
    /***
     * 
     * @param as
     * @param as2
     * @return
     */
	public int CompareRequests(AdvertiseClass as, AdvertiseClass as2){
        return as.compareTo(as2);
	}
    
    /**
     * 
     * @param candidate
     * @param meeting
     * @return
     */
	public boolean GiveOfferToCandidate(Candidate candidate, Meetings meeting){
		return candidate.evaluateTheOffer(meeting);
	}

    /**
     * 
     * @param date
     * @param candidate
     * @param company
     * @param time
     * @param offer
     * @return
     */
	public boolean ArrangeMeeting(String date, Candidate candidate, Company company, String time, int offer){
        Meetings meeting = new Meetings(date, candidate, company, time, offer);
        hrc.getMeetings().add(meeting);
		candidate.addMeeting(meeting);
		return true;
	}

    /**
     * 
     * @param candidate
     * @param as
     */
	public void SuggestCandidateToCompany(Candidate candidate, AdvertiseClass as){
		as.getSuggested().add(candidate);
	}

    /**
     * 
     * @return 
     */
	public String toString(){
		StringBuilder sb =new StringBuilder();
        sb.append(  "UserID: " + getUserID() );
        sb.append( " | Name: " + getName() );
        
		return sb.toString();
	}
    
    /**
     * 
     * @param humanRes
     */
	public int compareTo(HumanResources humanRes) {
        if(getUserID() > humanRes.getUserID() )
            return 1;
        else if(getUserID() < humanRes.getUserID())
            return -1;
        else
            return 0;    
	}

    /**
     * 
     * @param hrc
     * @return
     */
    public ArrayList<Meetings> seeMeetings(HRC hrc){
		return hrc.getMeetings();
	}

    /**
     * 
     * @param humanRes
     * @return
     */
    public boolean equals(HumanResources humanRes){
        return (compareTo(humanRes) == 0);
    }
    
	/**
	 * Sorts Meetings
	 * @param ArrayList<Meetings>
	 */
    @SuppressWarnings("unchecked")
	public ArrayList<Meetings> sortMeetings(ArrayList<Meetings> arr){
		
		if(arr!=null) 
		{
			ArrayList<Meetings> temp=(ArrayList<Meetings>)arr.clone();
			HeapSort.heapSort(temp);
			return temp;
		}
		return null;
	}
    
}
