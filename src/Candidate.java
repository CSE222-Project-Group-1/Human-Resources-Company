package src;

import java.util.Scanner;

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
	/**
	 * Compares Name and Password
	 * @param name String
	 * @param password String
	 * @return boolean
	 */
	public boolean singUp(String name,String password) {
		if (this.name.equals(name)&&this.password.equals(password))
			return true;
		return false;
	}
	/** For Rating Company
	* @param Company 
	* @return rate
	*/
	public int rateCompany(Company company) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Rate ?/10 : ");
		int rate= scan.nextInt();
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
		str.append("Name: "+name+" Statue: "+statue);
		return str.toString();
	}
	/**Returns Candidates Name
	*@return String
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
	*@return String
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


