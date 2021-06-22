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
        System.out.println("Human Resources");
        hrc.createHumanResources("Enis", "123");

        System.out.println("------ Welcome BRO!! ------"); 

        while(true)
        {  
            System.out.println("\n1- Sign Up");
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
                company = hrc.getCompanyID(user.getUserID());
                //Hey buradaki !!!!! Sen Can yamana birşey mi söyledin ?
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
        HumanResources hm;
        Company select;
        Candidate candidate;
        while(true)
        {  
            System.out.println("\n\n1- Add Company ");
            System.out.println("2- Update Company");
            System.out.println("3- Delete Company ");
            System.out.println("4- Add  Human Resources");
            System.out.println("5- Update Human Resources");
            System.out.println("6- Delete Human Resources");
            System.out.println("7- Add Candidate");
            System.out.println("8- Update Candidate");
            System.out.println("9- Delete Candidate\n\n");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            hm = null;
            select=null;
            candidate=null;
            switch (choice) {
                
                case 0: 
                    return;
                case 1: 
                    hrc.createCompany(getStr("Name: "),getStr("Password: "),getStr("Company Sector: "), 
                        getInt("Number Of Employees: "),getStr("Address: "));
                    break;
                case 2:
                    select=companySelector(hrc,"Select Company:");
                    if(select!=null){
                        companyMenuSettings(select);
                    }else{
                        System.out.println("Company was not updated.");
                    }
                    break;
                case 3:
                     select=companySelector(hrc,"Select Company:");
                    if(select!=null){
                        if(admin.removeCompany(select)){
                            System.out.println("Company was deleted.");
                        }else
                            System.err.println("Company was not deleted.");
                    }else{
                        System.out.println("Company was not selected.");
                    }
                    
                    break;
                case 4:
                        hrc.createHumanResources(getStr("Name: "), getStr("Password: "));
                    break;
                case 5:
                        hm=humanResourcesSelector(hrc, "Select Human Resources:");
                        if(hm!=null)
                            humanResourcesUpdate(hm);
                    break;
                case 6:
                    hm=humanResourcesSelector(hrc, "Select Human Resources:");
                    if(hm!=null){
                        if(admin.removeHumanResources(hm)){
                            System.out.println("Human Resources was deleted.");
                        }else
                            System.err.println("Human Resources was not deleted.");
                    }else{
                        System.out.println("Human Resources was not selected.");
                    }
                    break;
                case 7:
                        hrc.createCandidate(
                            getStr("Name: "),
                            getStr("Password: "),
                            null/* new CvClass(address, name, surname, telNo, email, gender, birthDay, nationality, coverLetter, schoolInformation, experiences, certficates, capabilities, referances, driversLicense)*/);
                    break;
                case 8:
                    candidate=candidateSelector(hrc,"Select");
                    if(candidate!=null){
                        candidateUpdate(candidate);
                    }else{
                        System.out.println("Candidate  was not selected.");
                    }
                    break;
                case 9:
                    candidate=candidateSelector(hrc,"Select");
                    if(candidate!=null){
                        admin.removeCandidate(candidate);
                    }else{
                        System.out.println("Candidate  was not selected.");
                    }
                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
        
    }

    public static Company companySelector(HRC hrc,String str){
        if(hrc==null) return null;
        

        Iterator<Company> iter=hrc.getCompany().iterator();
        int i=1,select=-1;
        Company returnVal=null,temp=null;
        
        while(iter.hasNext()){
            Company company = iter.next();
            System.out.println((i++ )+" - "+company.getName());
        }
        System.out.println("0 - Exit");
        while(true){
           if(str!=null && !str.isEmpty())
                select=getInt(str+":");
            else 
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

    public static HumanResources humanResourcesSelector(HRC hrc,String str){
        if(hrc==null) return null;
        
        
        Iterator<HumanResources> iter=hrc.getHumanResources().iterator();
        
        int i=1,select=-1;
        HumanResources returnVal=null,temp=null;
        
        while(iter.hasNext()){
            HumanResources humanResources = iter.next();
            System.out.println(i+" - "+humanResources.toString());
        }
        System.out.println("0 - Exit");
        while(true){
           if(str!=null && !str.isEmpty())
                select=getInt(str+":");
            else 
                select=getInt("Your Select:");
           if(select==0){
               return null;
           }else if(select>0){
               iter=hrc.getHumanResources().iterator();
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
        
    }

    public static Candidate candidateSelector(HRC hrc,String str){
        if(hrc==null) return null;
        Iterator<Map.Entry<Integer,Candidate>> iter= hrc.getCandidate().entrySet().iterator();
        Map.Entry<Integer, Candidate> temp=null;
        int i=1,select=-1;
        while(iter.hasNext()){
            System.out.println(i+" - "+iter.next().getValue().getName());
            i++;
        }
        System.out.println("0 - Exit");

        while(true){
           if(str!=null && !str.isEmpty())
                select=getInt(str+":");
            else 
                select=getInt("Your Select:");
           if(select==0){
               return null;
           }else if(select>0){
               iter= hrc.getCandidate().entrySet().iterator();
               i=1;
               while(iter.hasNext()){
                   temp=iter.next();
                   if(i==select){
                       return temp.getValue();
                   }
                   i++;
               }
            }
        }
        
    }

    

    public static void companyMenu(HRC hrc, Company company){
       
        while(true)
        {  
            System.out.println("\n\n1- Get Rating Average");
            System.out.println("2- Create New Advertise");
            System.out.println("3- See Your Advertises");
            System.out.println("4- Add New Social Rights");
            System.out.println("5- See Applicants");
            System.out.println("6- Change Profile Settings");
            System.out.println("7- See All Information about Your Company\n\n");
            
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
                    Candidate candidate = candidateSelectorAdvertises(company);
                    companyMenuAdvertise(hrc, company, candidate);
                    break;
                case 6:
                    companyMenuSettings(company);
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

    public static void companyMenuAdvertise(HRC hrc, Company company, Candidate candidate){
       
        while(true)
        {  
            System.out.println("\n\n1- See Candidate's CV");
            System.out.println("2- Accept Candidate and Arrange Meeting");
            System.out.println("3- Decline Candidate\n\n");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: 
                    return;
                case 1: 
                    System.out.println(candidate.getCV());
                    break;
                case 2:
                    hrc.getDefaultHumanResources().ArrangeMeeting(getStr("Date"), candidate, company, getStr("Time:"), getInt("Money:"));
                    break;
                case 3:
                    System.out.println("Declined Offer");
                    return;
                case 4:
                    company.addSocialRights(getStr("Social Right:"));
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
            System.out.println("\n1- Change Company Name");
            System.out.println("2- Change Company Sector");
            System.out.println("3- Change Company Address");
            System.out.println("4- Change Company Employee Number");
            System.out.println("0- Exit\n");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                case 0: return;
                case 1:
                    company.setName(getStr("New Name:"));
                    break;
                case 2:
                    company.setCompanySector(getStr("New Sector:"));
                    break;
                    
                case 3:
                    company.setAddress(getStr("New Address:"));
                    break;
                
                case 4:
                    company.setNumberOfEmployees(getInt("New Employee Number:"));
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
            System.out.println("\n\n1- Delete candidate");
            System.out.println("2- See company requests");
            System.out.println("3- Compare requests");
            System.out.println("4- Give offer to candidate");
            System.out.println("5- Arrange meeting");
            System.out.println("6- Suggest candidate to company");
            System.out.println("7- Print human resource info.\n\n");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: 
                    return;

                case 1: 
                    hr.DeleteCandidate(getInt("Enter user ID to delete: "));
                    break;
                    
                case 2:
                    System.out.println( hr.SeeCompanyRequest(getInt("Enter company id to see requests")) );
                    break;

                case 3:
                    int c = 0;
                    c = hr.CompareRequests( advertiseSelector(companySelector(hrc, "Select company: ")), advertiseSelector(companySelector(hrc, "Select company: ")) );
                    if     (c > 0)   System.out.println("First request");
                    else if(c < 0)   System.out.println("Second request");
                    else             System.out.println("Same");
                    break;
                    
                case 4:
                    hr.GiveOfferToCandidate(candidateSelector(hrc, "Select candidate: "), getInt("Enter offer: ") );
                    break;
                case 5:
                    hr.ArrangeMeeting(getStr("Enter date: "), candidateSelector(hrc, "Select candidate: "), companySelector(hrc, "Select company: "), getStr("Enter time: "), getInt("Enter offer: ") );
                    break;
                case 6:
                    hr.SuggestCandidateToCompany(candidateSelector(hrc, "Select candidate: "), advertiseSelector(companySelector(hrc, "Select company: ")) );
                    break;
                case 7:
                    System.out.println( hr.toString() );
                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static Candidate candidateSelectorAdvertises(Company company){
        Candidate returnVal=null;
        Iterator<AdvertiseClass> iter = company.getAdvertises().iterator();

        int i=0;
        while(iter.hasNext()){
            AdvertiseClass ad = iter.next();
            Iterator<Candidate> itCaandiate = ad.getApplies().iterator();
            while(itCaandiate.hasNext())
            {
                System.out.println( i + ": " + itCaandiate.next() );
                i++;
            }
        }
        int select = getInt("Select candidate: ");
        
        iter = company.getAdvertises().iterator();

        i = 0;
        while(iter.hasNext()){
            AdvertiseClass ad = iter.next();
            Iterator<Candidate> itCaandiate = ad.getApplies().iterator();
            while(itCaandiate.hasNext())
            {
                if (i == select)
                    return itCaandiate.next();
                i++;
            }
        }
        
        System.out.println("Hata verdim abeey candidate bulamadim");
        return null;
    }
    
    public static AdvertiseClass advertiseSelector(Company company){
        AdvertiseClass returnVal=null;
        Iterator<AdvertiseClass> iter = company.getAdvertises().iterator();

        int i=0;
        while(iter.hasNext()){
            System.out.println( i + ": " + iter.next() );
            i++;
        }
        int select = getInt("Select Advertise: ");
        if(select>-1 && select<company.getAdvertises().size())
            return company.getAdvertises().get(select);
        else return null;
    }

    public static void candidateMenu(HRC hrc,Candidate candidate) {

        while (true) {
            System.out.println("\n\n1- Apply To Advertise");
            System.out.println("2- See Company Rating");
            System.out.println("3- Evaluate The Offer");
            System.out.println("4- Set Status To Open To Work  ");
            System.out.println("5- Set CV");
            System.out.println("6- Change Password");
            System.out.println("7- Information\n\n");

            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
           
                case 1: candidate.applyToAdvertisement(
                            advertiseSelector(companySelector(hrc, "Select Company:"))); 
                    break;
                case 2: candidate.seeRatings(companySelector(hrc, "Select Company:"));
                    break;
                case 3: candidate.evaluateTheOffer(0/*int offer */);
                    break;
                case 4:candidate.setStatusToOpenWork();
                    break;
                case 5:candidate.setMycv(cvUpdate(candidate));
                    break;
                case 6:candidate.changePassword(getStr("New Password: "));
                    break;
                case 7:System.out.println(candidate);
                    break;
                case 0:
                    return;
                
                default:
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static AdvertiseClass createAdvertise() {
        AdvertiseClass advert = new AdvertiseClass(getStr("Title:"), getStr("Way of Work (remote or location):"), getStr("Role:"), getStr("Job Type:"), getStr("Location:"), getInt("Vacancies:"), getStr("Industry:"), getCapabilities(), getStr("Education Level:"), getInt("Experience Year:"), getStr("Description:"));
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


    public static void humanResourcesUpdate(HumanResources hm) {
        while(true)
        {  
            System.out.println("\n1- Change Human Resources Name");
            System.out.println("2- Change Human Resources Password");
            System.out.println("0- Exit\n");

            int choice = getInt("Choice:");
            switch (choice) {
                case 0: return;
                case 1:
                    hm.setName(getStr("New Name:"));
                    break;
                case 2:
                    hm.setPassword(getStr("New Sector:"));
                    break;

                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static void candidateUpdate(Candidate candidate) {
        while(true)
        {  
            System.out.println("\n1- Change Candidate Name");
            System.out.println("2- Change Candidate Password");
            System.out.println("3- Change CV");
            System.out.println("0- Exit\n");

            int choice = getInt("Choice:");
            switch (choice) {
                case 0: return;
                case 1:
                    candidate.setName(getStr("New Name:"));
                    break;
                case 2:
                    candidate.changePassword(getStr("New Password:"));
                    break;
                case 3:
                    candidate.setMycv(null/*new Cv or menulu change */);
                    break;
                default: 
                    System.err.println("Wrong Input!!");
                    break;
            }
        }
    }
    public static CvClass cvUpdate(Candidate cand){
        CvClass cv=cand.getCV();
        while (true) {
            System.out.println("\n1- Change Address");
            System.out.println("2- Change Name");
	        System.out.println("3- Change Surname");
            System.out.println("4- Change Phone Number");
            System.out.println("5- Change E-Mail");
	        System.out.println("6- Change Gender");
            System.out.println("7- Change Birthday Date");
            System.out.println("8- Change Nationality");
	        System.out.println("9- Change Cover Letter");
            
            System.out.println("10- Change Driver Licence"); 

            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
            case 0:cand.setMycv(cv);
                return cv;
            case 1:
                cv.setAddress(getStr("New Address:"));
                break;
            case 2:
                cv.setName((getStr("New Name:")));
                break;
            case 3:
                cv.setSurname(getStr("New Surname:"));
                break;
            case 4:
                 cv.setTelNo(getStr("New Address:"));
                break;
            case 5:
                cv.setEmail(getStr("New E-Mail:"));
                break;
            case 6:
                cv.setGender(getStr("New Gender:"));
                break;
            case 7:
                cv.setBirthDay(getStr("New Birthday:"));
                break;
            case 8:
                 cv.setNationality(getStr("New Nationality:"));
                break;
            case 9:
                cv.setCoverLetter(getStr("New Cover Letter:"));
                break;

            case 10:
                 cv.setDriversLicense(!cv.isDriversLicense());
                break;

            default:
                System.err.println("Wrong Input!!");
                break;
            }
        }
        
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
