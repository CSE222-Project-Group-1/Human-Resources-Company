import src.*;
import src.book_implementation.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Hello");

        
        HRC hrc = new HRC();
        Admin admin = hrc.getAdmin();
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
            case 1: hrc.createCompany(getStr("Name: "),getStr("Password: "), null/*ArrayList Advertises*/, getStr("Company Sector: "), getInt("Number Of Employees: "),null/* Array List socialRights*/,getStr("Address: "), 0);
                break;
            case 2: hrc.createCandidate(getStr("Name: "),getStr("Password: "),null/* new CvClass(address, name, surname, telNo, email, gender, birthDay, nationality, coverLetter, schoolInformation, experiences, certficates, capabilities, referances, driversLicense)*/);
                break;
            default :System.err.println("Wrong Input!!");
        }
    }

    public static void logIn(HRC hrc) {
        Users user=null;
        int index=hrc.getUsers().indexOf(new Users(getInt("ID: "),null, getStr("Password: "), 0 ));
        if(index==-1){
            System.out.println("Invalid input.");
            return;
        }
        user=hrc.getUsers().get(index);
        
        Candidate candidate=null;
        HumanResources humanResources=null;
        Company company=null;
        Admin admin=null;
        switch(user.getType()){
            case Users.CANDIDATE: 
                candidate=hrc.getCandidateID(user.getUserID());
                System.out.println("Candidate");
            break;

            case Users.HUMAN_SOURCES: 
                    humanResources=hrc.getHumanResourcesID(user.getUserID());
                    System.out.println("Human Resources");
            break;

            case Users.COMPANY: 
            System.out.println("companyyyyyyyyyy");
                company=hrc.getCompanyID(user.getUserID());
            break;
            case Users.ADMIN:
            System.out.println("Adminnnnnn");
                admin=hrc.getAdmin();
             break;

        };
    }

    public static void companyMenu(Company company) {
        
        while(true)
        {  
            System.out.println("1- Give  ");
            System.out.println("2- Log in");
            
            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {
                
                case 0: return;
                
                default:System.err.println("Wrong Input!!");
                    break;
            }
        }
    }

    public static void candidateMenu(Company company,Candidate candidate) {

        while (true) {
            System.out.println("1-  ");
            System.out.println("2-See Company Rating");

            System.out.println("0- Exit");
            int choice = getInt("Choice:");
            switch (choice) {

            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;

            default:
                System.err.println("Wrong Input!!");
                break;
            }
        }
    }

    public static ArrayList<AdvertiseClass> getAdvertise() {
        ArrayList<AdvertiseClass> advert = new ArrayList<>();

        int size = getInt("Enter Advertise Size:");
        for (int i = 0; i < size; i++)
        {
            advert.add(new AdvertiseClass(getStr("Tittle"), getStr("Way of Work (remote or location):"), getStr("Role:"), getStr("Job Type:"), getStr("Location:"), getInt("Vacancies:"), getStr("Industry:"), getCapabilities(), getStr("Education Level:"), getInt("Experience Year:"), getStr("Description:")));
        }
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
