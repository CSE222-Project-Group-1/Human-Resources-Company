package src;


import java.util.*;

public class Company extends Users implements Comparable<Company> {
    private ArrayList<AdvertiseClass> Advertises;
    private String CompanySector;
    private int NumberOfEmployees;
    private ArrayList<String> SocialRights; //sosyal haklar  Binary Search Tree
    private String Address;
    private static double rateAverage=0;
    private static int numberOfVotes=0;

    public Company(int userID,String name, String password, ArrayList<AdvertiseClass> advertises, String companySector,
			int numberOfEmployees, ArrayList<String> socialRights, String address,double ratingsOrt,HRC hrc) {
        super(userID,name,password,Users.COMPANY);
        Advertises = advertises;
        CompanySector = companySector;
        NumberOfEmployees = numberOfEmployees;
        SocialRights = socialRights;
        Address = address;
        System.out.println("Your id:" + userID);
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
        StringBuilder aString =new StringBuilder();
        return aString.toString();
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
