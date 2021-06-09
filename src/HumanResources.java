package src;

public class HumanResources <E extends Comparable<E>> implements Comparable<HumanResources<E>>{
	private String name;
	private String password;
	private static HRC hrc=null;
	
	public HumanResources(String name, String password, ArrayList<Candidate> candidates) {
		super();
		this.name = name;
		this.password = password;
	}

	public boolean loginSystem() {
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
	@Override
	public int compareTo(HumanResources<E> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
