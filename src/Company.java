package src;

public class Company implements Comparable<Company> {
	private String name;
	private String password;
	private ArrayList<AdvertiseClass> Advertises;
	private String CompanySector;
	private int NumberOfEmployees;
	private ArrayList<String> SocialRights; //sosyal haklar  Binary Search Tree
	private String Address;
	private ArrayList<Integer> Ratings;
	private double RatingsOrt;
	
	public Company(String name, String password, ArrayList<AdvertiseClass> advertises, String companySector,
			int numberOfEmployees, ArrayList<String> socialRights, String address, ArrayList<Integer> ratings,
			double ratingsOrt) {
		super();
		this.name = name;
		this.password = password;
		Advertises = advertises;
		CompanySector = companySector;
		NumberOfEmployees = numberOfEmployees;
		SocialRights = socialRights;
		Address = address;
		Ratings = ratings;
		RatingsOrt = ratingsOrt;
	}
	
	public ArrayList<Integer> getRatings() {
		return Ratings;
	}

	public void setRatings(ArrayList<Integer> ratings) {
		Ratings = ratings;
	}

	public double getRatingsOrt() {
		return RatingsOrt;
	}

	public void setRatingsOrt(double ratingsOrt) {
		RatingsOrt = ratingsOrt;
	}

	public ArrayList<AdvertiseClass> getAdvertises() {
		return Advertises;
	}

	public void setAdvertises(ArrayList<AdvertiseClass> advertises) {
		Advertises = advertises;
	}

	public String getCompanySector() {
		return CompanySector;
	}

	public void setCompanySector(String companySector) {
		CompanySector = companySector;
	}

	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}

	public ArrayList<String> getSocialRights() {
		return SocialRights;
	}

	public void setSocialRights(ArrayList<String> socialRights) {
		SocialRights = socialRights;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public boolean SingUpToSystem() {
		return false;
	}
	public boolean LoginSystem() {
		return false;
	}
	public Candidate[] SeeSuggestedCandidates() {
		return null ;
	}
	public boolean AcceptDeclineSuggestedCandidates() {
		return false;
	}
	public AdvertiseClass Advertise() {
		return null;
	}
	public int RateEmployee() {
		return -1;
	}
	public String getName() {
		return name;
	}
	public void seeCustomerInformation() {
		
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
	public String toString() {
		StringBuilder aString =new StringBuilder();
		return aString.toString();
	}


    @Override
    public int compareTo(Company o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
