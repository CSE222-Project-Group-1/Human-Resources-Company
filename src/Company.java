package src;


import java.util.ArrayList;
import java.util.Scanner;

import src.book_implementation.ArrayQueue;

public class Company extends Users implements Comparable<Company> {
    private String name;
    private String password;
    private ArrayList<AdvertiseClass> Advertises;
    private String CompanySector;
    private int NumberOfEmployees;
    private ArrayList<String> SocialRights; //sosyal haklar  Binary Search Tree
    private String Address;
    private ArrayList<Integer> Ratings;
    private double RatingsOrt;
    public Company(int userID,String name, String password, ArrayList<AdvertiseClass> advertises, String companySector,
			int numberOfEmployees, ArrayList<String> socialRights, String address, ArrayList<Integer> ratings,
			double ratingsOrt,HRC hrc) {
        super(userID,name,password,Users.COMPANY);
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
        int result=0;
        for(int i=0;i<Ratings.size();i++)
        {
          result=result+Ratings.get(i);
        }
        RatingsOrt=result/Ratings.size();

        return RatingsOrt;
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
    public AdvertiseClass Advertise() {
        String advertisementTitle,wayOfWork,jobRole,jobType,
                jobLocation,numberOfVacancies,companyIndustry,
                levelOfEducation,description;
        Integer experienceYear;
        ArrayQueue<String> Capabilities = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("advertisementTitle");
        advertisementTitle = sc.next();
        System.out.println("wayOfWork");
        wayOfWork = sc.next();
        System.out.println("jobRole");
        jobRole = sc.next();
        System.out.println("jobType");
        jobType = sc.next();
        System.out.println("jobLocation");
        jobLocation = sc.next();
        System.out.println("numberOfVacancies");
        numberOfVacancies = sc.next();
        System.out.println("companyIndustry");
        companyIndustry = sc.next();
        System.out.println("levelOfEducation");
        levelOfEducation = sc.next();
        System.out.println("experienceYear");
        experienceYear = sc.nextInt();
        System.out.println("description");
        description = sc.next();
        int prefer;
        do{
            System.out.println("Capabilities");
            System.out.println("Eklemeye devam etmek için 1, bitirmek için 2 ye basınız");
            prefer= sc.nextInt();
            if(prefer==2)
                break;
        }while (prefer==1);
        AdvertiseClass tmp=new AdvertiseClass(advertisementTitle,wayOfWork,jobRole,jobType, jobLocation,numberOfVacancies,companyIndustry, Capabilities,
                levelOfEducation,experienceYear,description);
        return  tmp;
    }
    //burada şirkete görüştüğü kişi puan veriyor
    public void RateEmployee(int value) {
        Ratings.add(value);
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
       if(this.getRatingsOrt()<o.getRatingsOrt())
           return 1;
       else if(this.getRatingsOrt()>o.getRatingsOrt())
           return -1;
       else
           return 0;

    }
}
