package linkedlist;

public class Candidate {
	private String name;
	private String password;
	private CvClass Mycv;
	public Candidate(String name, String password, CvClass mycv) {
		super();
		this.name = name;
		this.password = password;
		Mycv = mycv;
	}
	public boolean SingUp() {
		return false;
	}
	public int RateCompany(Company company) {
		return -1;
	}
	public boolean EvaluateTheOffer() {
		return false;
	}
	public CvClass	Giveinformation() {
		return Mycv;
	}
	public void seeRatings() {
		
	}
	public void ApplyToAdvertisement() {
		
	}
	public boolean SetStatusToOpenWork() {
		return false;
	}
	public int RatingTheOffer() {
		return -1;
	}
	public boolean ChangePassword(String newPassword) {
		setPassword(newPassword);
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
	public void setMycv(CvClass mycv) {
		Mycv = mycv;
	}
	
}

