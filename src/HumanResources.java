package src;

import java.util.*;

public class HumanResources extends Users implements Comparable<HumanResources>{
    private int userID;
	private String name;
	private String password;
	private static HRC hrc=null;
	
	public HumanResources(int userID, String name, String password, ArrayList<Candidate> candidates) {
		super(userID, name, password, Users.HUMAN_SOURCES);
	}

	public boolean loginSystem(String name,String password) {
		if (this.name.equals(name) && this.password.equals(password))
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    
}
