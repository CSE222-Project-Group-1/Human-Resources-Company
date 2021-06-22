package src;

import java.util.*;
import src.book_implementation.*;


public class Company extends Users implements Comparable<Company> {
    private ArrayList<AdvertiseClass> Advertises;
    private String CompanySector;
    private int NumberOfEmployees;
    private AVLTree<String> SocialRights; //sosyal haklar  Binary Search Tree
    private String Address;
    private static double rateAverage;
    private static int numberOfVotes;

    public Company(int userID,String name, String password, String companySector,
			int numberOfEmployees, String address,HRC hrc) {
        super(userID,name,password,Users.COMPANY);
        CompanySector = companySector;
        NumberOfEmployees = numberOfEmployees;
        Address = address;

        rateAverage=0;
        numberOfVotes=0;
        SocialRights = new AVLTree<String>();
        Advertises = new ArrayList<>();
        System.out.println("Your id:" + userID);
    }

    	/**
	 * Compares Name and Password
	 * @param name String
	 * @param password String
	 * @return boolean
	 */
	public boolean signUp(int id, String password) {
		if (getUserID() == id && getPassword().equals(password))
			return true;
		return false;
	}

    public void addRating(int rate) {
        rateAverage+=((double) rate)/(++numberOfVotes);
    }
    
    public double getRatingsAvg(){
        return rateAverage;
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
    public AVLTree<String> getSocialRights() {
        return SocialRights;
    }
    public void setSocialRights(AVLTree<String> socialRights) {
        SocialRights = socialRights;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    public void SeeSuggestedCandidates(Candidate[] candidates) {
        for(int i=0;i< candidates.length;i++)
            System.out.println(candidates[0].toString());

    }
    public boolean AcceptDeclineSuggestedCandidates() {
        return false;
    }
    //benzaten şirketim nedeb müşteri bilgisi görücem
    public void seeCustomerInformation() {

    }
   public void addSocialRights(String value){
       SocialRights.add(value);

   }
   public  void addAdvertise(AdvertiseClass newValue){
        Advertises.add(newValue);
   }

    public String toString() {
        StringBuilder sb =new StringBuilder();

        sb.append("Name: " + getName());
        sb.append("\nId: " + getUserID());
        sb.append("\nAdvertises: " + Advertises);
        sb.append("\nCompanySector: " + CompanySector);
        sb.append("\nNumber of Employees: " + NumberOfEmployees);
        sb.append("\nAddress: " + Address);
        sb.append("\nRatings avg: " + rateAverage);
        sb.append("\nSocial Rights: ");
        Iterator<String> iter = SocialRights.iterator();
        while(iter.hasNext()){
            sb.append(iter.next() + ", ");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    //iki şirketin rating ortalamasıa göre karşılaştırılabiilir
    public int compareTo(Company o) {
       if(this.getRatingsAvg()<o.getRatingsAvg())
           return 1;
       else if(this.getRatingsAvg()>o.getRatingsAvg())
           return -1;
       else
           return 0;

    }
}
