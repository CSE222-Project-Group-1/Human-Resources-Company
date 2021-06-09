package src;

public class Candidate {
	private String name;
	private String password;
	private String statue;
	private CvClass Mycv;
	/**Constructor
	* @param String name
	* @param String password
	* @param CvClass mycv
 	*/
	public Candidate(String name, String password, CvClass mycv) {
		super();
		this.name = name;
		this.password = password;
		Mycv = mycv;
	}
	public boolean SingUp() {
		//TODO
		return false;
	}
	public int RateCompany(Company company) {
		//TODO
		return -1;
	}
	public boolean EvaluateTheOffer() {
		//TODO
		return false;
	}
	
	public CvClass	Giveinformation() {
		return Mycv;
	}
	public void seeRatings() {
		//TODO
	}
	public void ApplyToAdvertisement() {
		//TODO
	}
	public boolean SetStatusToOpenWork() {
		this.statue="Open To Work";
		//TODO
		return true;
	}
	public int RatingTheOffer() {
		//TODO
		return -1;
	}
	/**
	*Changes Candidates Password
	*@param String newPassword
	* @returns Boolen 
	*/
	public boolean ChangePassword(String newPassword) {
		setPassword(newPassword);
		return true;
	}
	public String toString() {
		StringBuilder aString =new StringBuilder();
		//TODO
		return aString.toString();
	}
	/**Returns Candidates Name
	*@retuns String
	*/
	public String getName() {
		return name;
	}
	/**Sets Candidates Name
	*@param String name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**Returns Candidates Password
	*@retuns String
	*/
	public String getPassword() {
		return password;
	}
	/**Sets Candidates Password
	*@param String password
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	/**Sets Candidates CV
	*@param CvClass mycv
	*/
	public void setMycv(CvClass mycv) {
		Mycv = mycv;
	}
	
}

