package src;


public class Candidate  extends Users implements Comparable<Candidate>{
	private String statue;
	private CvClass Mycv;
	private HRC hrc=null;

	/**Constructor
	* @param String name
	* @param String password
	* @param CvClass mycv
 	*/
	public Candidate(int userID, String name, String password, CvClass mycv,HRC hrc) {
		super(userID, name, password, Users.CANDIDATE);
		this.Mycv = mycv;
		this.hrc=hrc;
	}

	/**
	 * Compares Name and Password
	 * @param name String
	 * @param password String
	 * @return boolean
	 */
	public boolean signUp(String name,String password) {
		if (getName().equals(name) && getPassword().equals(password))
			return true;
		return false;
	}

	/** For Rating Company
	* @param Company 
	* @return rate
	*/
	public int rateCompany(Company company, int rate) {
		company.getRatings().add(rate);
		return rate;
	}
	public boolean evaluateTheOffer() {
		//TODO
		return false;
	}
	/**Returns Cv Of Candidate
	* @return CvClass
	*/
	public CvClass	giveInformation() {
		return Mycv;
	}
	/**
	 * Prints Rating Average
	 * @param company Company
	 */
	public void seeRatings(Company company) {
		System.out.println("Rating: "+company.getRatingsOrt());
	}
	/**
	 * Adds Candidate to Advertise
	 * @param ad AdvertiseClass
	 */
	public void applyToAdvertisement(AdvertiseClass ad) {
		//ad.getApplied().add(this);
	}
	/**
	 * Sets Statue To Open To Work
	 * @return boolen
	 */
	public boolean setStatusToOpenWork() {
		this.statue="Open To Work";
		return true;
	}
	public int ratingTheOffer() {
		//TODO
		return -1;
	}
	/**
	*Changes Candidates Password
	*@param String newPassword
	* @return Boolen 
	*/
	public boolean changePassword(String newPassword) {
		setPassword(newPassword);
		return true;
	}
	/**toString */
	public String toString() {
		StringBuilder str =new StringBuilder();
		str.append("Name: "+getName()+" Statue: "+statue);
		return str.toString();
	}
    
	/**Sets Candidates CV
	*@param CvClass mycv
	*/
	public void setMycv(CvClass mycv) {
		Mycv = mycv;
	}
    
    @Override
    public int compareTo(Candidate other) {
        // TODO Auto-generated method stub
        return 0;
    }
	
}

