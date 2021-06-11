import src.*;

@SuppressWarnings("unused")
public class Test {
    
    public static void main(String[] args) {
        System.out.println("Hello domates");

        System.out.println("\n\n------------Welcome to Perfect Human Resources Company------------\n\n");
        System.out.println("Test Starting");

        System.out.println("First, creating our HRC Company");
        // Create new HRC
        HRC<String> hrc = new HRC<>();
        

        System.out.println("------Start Admin Tests------");
        System.out.println("Create an admin with Name Suleyman Golbol - Password: 123");
        // create admin
        Admin admin = new Admin("Suleyman", "123");
        // set hrc company to admin
        Admin.setHrc(hrc);
        // set hrc admin to our admin
        hrc.setAdmin(admin);
     
        System.err.println("Add new employee");
        admin.AddHumanResources();
        System.out.println("Remove an employee");
        admin.RemoveHumanResources();

        System.out.println("See statistics");
        admin.SeeStatistics();

        System.out.println("Add new company");
        admin.addCompany();
        System.out.println("Remove company");
        admin.deleteCompany();

        System.out.println("------End Admin Tests------");

        System.out.println("\n\n------Start Advertise Tests------\n\n");
        AdvertiseClass advertise = new AdvertiseClass("advertisementTitle", "wayOfWork", "jobRole", "jobType", "jobLocation", "numberOfVacancies", "companyIndustry", null, "levelOfEducation", 0, "description");

        // other methods will go here
        System.out.println("------End of Advertise Tests------\n");


        System.out.println("\n------Start Candidate Tests------\n");
        System.out.println("Create new employee with name Baran Solmaz and Null CV");
        Candidate candidate = new Candidate("Baran Solmaz", "123", null);
        // candidate.ApplyToAdvertisement();
        // candidate.ChangePassword("newPassword");
        // candidate.EvaluateTheOffer();
        // candidate.Giveinformation();
        // candidate.RateCompany(null);
        // candidate.RatingTheOffer();
        // candidate.SetStatusToOpenWork();
        // candidate.SingUp();

        System.out.println("\n------End Candidate Tests------\n");

        System.out.println("\n------Start Company Tests------\n");
        System.out.println("Create company with name Samsung");
        Company company = new Company("Samsung", null, null, null, 10, null, null, null, 0);
        company.AcceptDeclineSuggestedCandidates();
        company.Advertise();
        company.RateEmployee(2);
        company.SeeSuggestedCandidates(null);
        company.addAdvertise(null);
        company.addSocialRights("food");
        System.out.println("\n------End Company Tests------\n");

        System.out.println("\n------Start CV Class Tests------\n");
        CvClass cv = new CvClass("address", "name", "surname", "tel no", "email", "gender", "birthDay", "nationality", "coverLetter", null, null, null, null, null,null, false);
        
        System.out.println("\n------End CV Class Tests------\n");

        System.out.println("\n------Start HumanResources (our employee) Tests------\n");
        System.out.println("Create new employee with name Enis PHP - Password 123");
        HumanResources<String> employee = new HumanResources<>("Enis PHP", "123", null);
        employee.ArrangeMeeting();
        employee.CompareRequests();
        employee.DeleteCandidate();
        employee.GiveOfferToCandidate();
        employee.SeeCompanyRequest();
        employee.SuggestCandidateToCompany();

        System.out.println("\n------End HumanResources (our employee) Tests------\n");

        System.out.println("\n------Start Meeting Class Tests------\n");
        Meetings meeting = new Meetings("date", null, null, "time", 19);
        System.out.println("\n------End Meeting Class Tests------\n");

        System.out.println("\n------Start Users Tests------\n");
        System.out.println("\n------End Users Tests------\n");

    }
}
