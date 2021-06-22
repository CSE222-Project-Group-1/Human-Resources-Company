import src.*;
import src.book_implementation.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Test {
    
    public static void main(String[] args) {
        HRC hrc = new HRC();
        Admin admin = hrc.getAdmin();

        System.out.println("Create a Company and a Candidate for quick login");
        System.out.println("Passwords are 123");
        System.out.println("Company");
        hrc.createCompany("Suleyman Company","123", "Hatay Yemekleri", 10, "Hatay OF Course");
        System.out.println("Candidate");
        hrc.createCandidate("Sedat Peker" ,"123",null/* new CvClass(address, name, surname, telNo, email, gender, birthDay, nationality, coverLetter, schoolInformation, experiences, certficates, capabilities, referances, driversLicense)*/);

        System.out.println("------ Welcome BRO!! ------"); 

        while(true)
        {  
            System.out.println("1- Sign Up");
            System.out.println("2- Log in");
            
            int choice = getInt("Choice:");
            switch (choice) {
                case 1:signUp(hrc);
                    break;
                case 2:logIn(hrc);
                    break;
                default:System.err.println("Wrong Input!!");
                    break;
            }

        }

    }

    public static void signUp(HRC hrc) {
        System.out.println("1- Sign Up Company");
        System.out.println("2- Sign Up Candidate");
        
        int key=getInt("Choose: ");
        switch (key) {
            case 1: hrc.createCompany(getStr("Name: "),getStr("Password: "), getStr("Company Sector: "), getInt("Number Of Employees: "), getStr("Address: "));
                break;
            case 2: hrc.createCandidate(getStr("Name: "),getStr("Password: "),null/* new CvClass(address, name, surname, telNo, email, gender, birthDay, nationality, coverLetter, schoolInformation, experiences, certficates, capabilities, referances, driversLicense)*/);
                break;
            default :System.err.println("Wrong Input!!");
        }
    }

    public static void logIn(HRC hrc) {
        Users user = null;
        int index = hrc.getUsers().indexOf(new Users(getInt("ID: "),null, getStr("Password: "), 0 ));
        if(index==-1){
            System.out.println("Invalid input.");
            return;
        }
        user=hrc.getUsers().get(index);
        
        Candidate candidate = null;
        HumanResources humanResources = null;
        Company company = null;
        Admin admin = null;

        switch(user.getType()){
            case 
                Users.CANDIDATE: 
                candidate=hrc.getCandidateID(user.getUserID());
                System.out.println("Candidate");
                candidateMenu(hrc,candidate);
                break;

            case 
                Users.HUMAN_SOURCES: 
                humanResources=hrc.getHumanResourcesID(user.getUserID());
                System.out.println("Human Resources");
                humanResourcesMenu(hrc, humanResources);
                break;

            case Users.COMPANY: 
                System.out.println("companyyyyyyyyyy");
                company = hrc.getCompanyID(user.getUserID());
                
                companyMenu(hrc, company);
                break;

            case Users.ADMIN:
                System.out.println("Adminnnnnn");
                admin=hrc.getAdmin();
                adminMenu(hrc,admin);
                break;

        };
    }

    public static void adminMenu(HRC hrc, Admin admin){
        if(hrc==null || admin==null) return;
        while(true)
        {  
            System.out.println("1- Add Company ");
            System.out.println("2- Update Company");
            System.out.println("3- Delete Company ");
            System.out.println("4- Add  Human Resources");
            System.out.println("5- Update Human Resources");
            System.out.println("6- Delete Human Resources");
            System.out.println("7- Add Candidate");
            System.out.println("8- Update Candidate");
            System.out.println("9- Delete Candidate");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: 
                    return;
                case 1: 
                    hrc.createCompany(getStr("Name: "),getStr("Password: "), 
                        getStr("Company Sector: "), 
                        getInt("Number Of Employees: "),
                        getStr("Address: "));
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                        hrc.createHumanResources(getStr("Name: "), getStr("Password: "));
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                        hrc.createCandidate(
                            getStr("Name: "),
                            getStr("Password: "),
                            null/* new CvClass(address, name, surname, telNo, email, gender, birthDay, nationality, coverLetter, schoolInformation, experiences, certficates, capabilities, referances, driversLicense)*/);
                    break;
                case 8:

                    break;
                case 9:

                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
        
    }

    public static Company companySelector(HRC hrc,String str){
      if(str!=null && !str.isEmpty())
            System.out.print(str+":");

        Iterator<Company> iter=hrc.getCompany().iterator();
        int i=1,select=-1;
        Company returnVal=null,temp=null;
        
        while(iter.hasNext()){
            Company company = iter.next();
            System.out.println(i+" - "+company.toString());
        }
        System.out.println("0 - Exit");
        while(true){
           select=getInt("Your Select:");
           if(select==0){
               return null;
           }else if(select>0 && hrc.getCompany().size()>=select){
               iter=hrc.getCompany().iterator();
               i=1;
               while(iter.hasNext()){
                   temp=iter.next();
                   if(i==select){
                       returnVal=temp;
                       return returnVal;
                   }
                   i++;
               }
           }
        }

       // return null;
    }


    

    public static void companyMenu(HRC hrc, Company company){
       
        while(true)
        {  
            System.out.println("1- Get Rating Average");
            System.out.println("2- Create advertise");
            System.out.println("3- Get advertises ");
            System.out.println("4- Add New Social Rights");
            System.out.println("5- ");
            System.out.println("6- ");
            System.out.println("7- See All Information about Your Company");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: 
                    return;
                case 1: 
                    System.out.println(company.getRatingsAvg());
                    break;
                case 2:
                    company.getAdvertises().add(createAdvertise());
                    break;
                case 3:
                    System.out.println( company.getAdvertises() );
                    break;
                case 4:
                    company.addSocialRights(getStr("Social Right:"));
                    break;
                case 5:
                                 
                    break;
                case 6:

                    break;
                case 7:
                    System.out.println(company);
                    break;
                case 8:

                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }
    
    public static void humanResourcesMenu(HRC hrc, HumanResources hr){
        
        while(true)
        {  
            System.out.println("1- Delete candidate");
            System.out.println("2- See company requests");
            System.out.println("3- Compare requests");
            System.out.println("4- Give offer to candidate");
            System.out.println("5- Arrange meeting");
            System.out.println("6- Suggest candidate to company");
            System.out.println("7- Print human resource info.");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: 
                    return;

                case 1: 
                    System.out.println( );
                    break;
                    
                case 2:
                    
                    break;

                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                case 5:
                                 
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }


    public static void companyMenuSettings(Company company) {
        while(true)
        {  
            System.out.println("1- Change Company Name");
            System.out.println("2- Change Company Sector");
            System.out.println("3- Change Compnay Adress");
            System.out.println("4- Change Compnay Employee Number");
            System.out.println("5- ");
            System.out.println("6- ");
            System.out.println("0- Exit");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                case 0: return;
                case 1:
                    company.setName("New Name:");
                    break;
                case 2:
                    company.setCompanySector(getStr("New Sector:"));
                    break;
                    
                case 3:
                    company.setAddress(getStr("New Adress:"));
                    break;
                
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static void candidateMenu(HRC hrc,Candidate candidate) {

        while (true) {
            System.out.println("1-Apply To Advertise");
            System.out.println("2-See Company Rating");
            System.out.println("3-Evaluate The Offer");
            System.out.println("4-Rate The Offer");
            System.out.println("5-Set Status To Open To Work  ");
            System.out.println("6- Set CV");
            System.out.println("7- Change Password" );

            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
           
                case 1: candidate.applyToAdvertisement(null/*AdvertiseClass ad*/); 
                    break;
                case 2: candidate.seeRatings(null/*company*/);
                    break;
                case 3: candidate.evaluateTheOffer(0/*int offer */);
                    break;
                case 4: //candidate.ratingTheOffer(0/*int offer */);
                    break;
                case 5: candidate.setStatusToOpenWork();
                    break;
                case 6: candidate.setMycv(null/*new CvClass()*/);
                    break;
                case 7: candidate.changePassword(getStr("New Password: "));
                    break;
                case 0:  return;
                
                default:
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static AdvertiseClass createAdvertise() {
        AdvertiseClass advert = new AdvertiseClass(getStr("Title"), getStr("Way of Work (remote or location):"), getStr("Role:"), getStr("Job Type:"), getStr("Location:"), getInt("Vacancies:"), getStr("Industry:"), getCapabilities(), getStr("Education Level:"), getInt("Experience Year:"), getStr("Description:"));
        return advert;
    } 

    public static ArrayQueue<String> getCapabilities() {
        ArrayQueue<String> capabilities = new ArrayQueue<>();

        int size = getInt("Enter Capabilities Size:");
        for (int i = 0; i < size; i++)
        {
            capabilities.offer(getStr("Enter " + i+1 +". capabilites:"));
        }
        return capabilities;
    }

    @SuppressWarnings("resource")
    public static int getInt(String str) {
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        int temp = -1;
        while (temp == -1) {
            try {
                temp = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. Enter an int. Try Again");
                scanner.nextLine();
            }
        }
        // scanner.close();
        return temp;
    }

    @SuppressWarnings("resource")
    public static String getStr(String str) {
        System.out.print(str);
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        // scanner.close();
        return temp;
    }
}
