package src;

public class Candidate {
	private String name;
	private String password;
	private String statue;
	private CvClass Mycv;
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
		return true;
	}
	public int RatingTheOffer() {
		//TODO
		return -1;
	}
	public boolean ChangePassword(String newPassword) {
		setPassword(newPassword);
		return true;
	}
	public String toString() {
		StringBuilder aString =new StringBuilder();
		//TODO
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
	public void setMycv(CvClass mycv) {
		Mycv = mycv;
	}
	
}

