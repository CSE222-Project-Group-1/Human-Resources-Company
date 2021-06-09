package linkedlist;

public class CvClass {
	private	String Address;
	private String Name;
	private String Surname;
	private String TelNo;
	private String Email;
	private String Gender;
	private String BirthDay;
	private String Nationality;
	private String CoverLetter;
 	private ArrayList<SchoolClass> SchoolInformation;
	private ArrayList<Experience> Experiences;
	private ArrayList<Certificate> Certficates;
	private ArrayList<String> Hobbies;
	private ArrayList<String> Capabilities;
	private ArrayList<Referance> Referances;
	private boolean DriversLicense;
	
	
	public CvClass(String address, String name, String surname, String telNo, String email, String gender,
			String birthDay, String nationality, String coverLetter, ArrayList<SchoolClass> schoolInformation,
			ArrayList<Experience> experiences, ArrayList<Certificate> certficates, ArrayList<String> hobbies,
			ArrayList<String> capabilities, ArrayList<Referance> referances, boolean driversLicense) {
		super();
		Address = address;
		Name = name;
		Surname = surname;
		TelNo = telNo;
		Email = email;
		Gender = gender;
		BirthDay = birthDay;
		Nationality = nationality;
		CoverLetter = coverLetter;
		SchoolInformation = schoolInformation;
		Experiences = experiences;
		Certficates = certficates;
		Hobbies = hobbies;
		Capabilities = capabilities;
		Referances = referances;
		DriversLicense = driversLicense;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getCoverLetter() {
		return CoverLetter;
	}

	public void setCoverLetter(String coverLetter) {
		CoverLetter = coverLetter;
	}

	public boolean isDriversLicense() {
		return DriversLicense;
	}

	public void setDriversLicense(boolean driversLicense) {
		DriversLicense = driversLicense;
	}

	public ArrayList<Referance> getReferances() {
		return Referances;
	}

	public void setReferances(ArrayList<Referance> referances) {
		Referances = referances;
	}

	public ArrayList<Certificate> getCertficates() {
		return Certficates;
	}
	public void setCertficates(ArrayList<Certificate> certficates) {
		Certficates = certficates;
	}
	public ArrayList<String> getHobbies() {
		return Hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		Hobbies = hobbies;
	}
	public ArrayList<String> getCapabilities() {
		return Capabilities;
	}
	public void setCapabilities(ArrayList<String> capabilities) {
		Capabilities = capabilities;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getTelNo() {
		return TelNo;
	}
	public void setTelNo(String telNo) {
		TelNo = telNo;
	}
	public ArrayList<SchoolClass> getSchoolInformation() {
		return SchoolInformation;
	}
	public void setSchoolInformation(ArrayList<SchoolClass> schoolInformation) {
		SchoolInformation = schoolInformation;
	}
	public ArrayList<Experience> getExperiences() {
		return Experiences;
	}
	public void setExperiences(ArrayList<Experience> experiences) {
		Experiences = experiences;
	}
	public class Experience{
		
		public Experience(String companyName, String startDate, String position, String endDate, String city,
				String businessArea, String jobDescription, String companySector, String wayOfWork) {
			super();
			this.companyName = companyName;
			StartDate = startDate;
			Position = position;
			EndDate = endDate;
			City = city;
			BusinessArea = businessArea;
			JobDescription = jobDescription;
			CompanySector = companySector;
			WayOfWork = wayOfWork;
		}
		String companyName;
		String StartDate;
		String Position;
		String EndDate;
		String City;
		String BusinessArea;
		String JobDescription;
		String CompanySector;
		String WayOfWork;
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getStartDate() {
			return StartDate;
		}
		public void setStartDate(String startDate) {
			StartDate = startDate;
		}
		public String getPosition() {
			return Position;
		}
		public void setPosition(String position) {
			Position = position;
		}
		public String getEndDate() {
			return EndDate;
		}
		public void setEndDate(String endDate) {
			EndDate = endDate;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		public String getBusinessArea() {
			return BusinessArea;
		}
		public void setBusinessArea(String businessArea) {
			BusinessArea = businessArea;
		}
		public String getJobDescription() {
			return JobDescription;
		}
		public void setJobDescription(String jobDescription) {
			JobDescription = jobDescription;
		}
		public String getCompanySector() {
			return CompanySector;
		}
		public void setCompanySector(String companySector) {
			CompanySector = companySector;
		}
		public String getWayOfWork() {
			return WayOfWork;
		}
		public void setWayOfWork(String wayOfWork) {
			WayOfWork = wayOfWork;
		}
		
	}
	public class SchoolClass{
		
		public SchoolClass(String schoolsName, String facultyName, String department, String endDate, String startDate,
				String educationType, String educationLanguage, String schoolAvarage) {
			super();
			SchoolsName = schoolsName;
			FacultyName = facultyName;
			Department = department;
			this.endDate = endDate;
			StartDate = startDate;
			EducationType = educationType;
			EducationLanguage = educationLanguage;
			SchoolAvarage = schoolAvarage;
		}
		private String SchoolsName;
		private String FacultyName;
		private String Department;
		private String endDate;
		private String StartDate;
		private String EducationType;
		private String EducationLanguage;
		private String SchoolAvarage;
		public String getSchoolsName() {
			return SchoolsName;
		}
		public void setSchoolsName(String schoolsName) {
			SchoolsName = schoolsName;
		}
		public String getFacultyName() {
			return FacultyName;
		}
		public void setFacultyName(String facultyName) {
			FacultyName = facultyName;
		}
		public String getDepartment() {
			return Department;
		}
		public void setDepartment(String department) {
			Department = department;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getStartDate() {
			return StartDate;
		}
		public void setStartDate(String startDate) {
			StartDate = startDate;
		}
		public String getEducationType() {
			return EducationType;
		}
		public void setEducationType(String educationType) {
			EducationType = educationType;
		}
		public String getEducationLanguage() {
			return EducationLanguage;
		}
		public void setEducationLanguage(String educationLanguage) {
			EducationLanguage = educationLanguage;
		}
		public String getSchoolAvarage() {
			return SchoolAvarage;
		}
		public void setSchoolAvarage(String schoolAvarage) {
			SchoolAvarage = schoolAvarage;
		}
		
	}
	public class Certificate{
		public Certificate(String certificateName, String institutionName, String certificateDate, String explanation) {
			super();
			CertificateName = certificateName;
			InstitutionName = institutionName;
			CertificateDate = certificateDate;
			Explanation = explanation;
		}
		String CertificateName;
		String InstitutionName;
		String CertificateDate;
		String Explanation;
		public String getCertificateName() {
			return CertificateName;
		}
		public void setCertificateName(String certificateName) {
			CertificateName = certificateName;
		}
		public String getInstitutionName() {
			return InstitutionName;
		}
		public void setInstitutionName(String institutionName) {
			InstitutionName = institutionName;
		}
		public String getCertificateDate() {
			return CertificateDate;
		}
		public void setCertificateDate(String certificateDate) {
			CertificateDate = certificateDate;
		}
		public String getExplanation() {
			return Explanation;
		}
		public void setExplanation(String explanation) {
			Explanation = explanation;
		}
	}
	public class Referance{
		String referanceName;
		String telNo;
		String Email;
		String CompanyName;
		String Job;
		public Referance(String referanceName, String telNo, String email, String companyName, String job) {
			super();
			this.referanceName = referanceName;
			this.telNo = telNo;
			Email = email;
			CompanyName = companyName;
			Job = job;
		}
		public String getReferanceName() {
			return referanceName;
		}
		public void setReferanceName(String referanceName) {
			this.referanceName = referanceName;
		}
		public String getTelNo() {
			return telNo;
		}
		public void setTelNo(String telNo) {
			this.telNo = telNo;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getCompanyName() {
			return CompanyName;
		}
		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}
		public String getJob() {
			return Job;
		}
		public void setJob(String job) {
			Job = job;
		}
	}
	@Override
	public String toString() {
		return "CvClass [Address=" + Address + ", Name=" + Name + ", Surname=" + Surname + ", TelNo=" + TelNo
				+ ", Email=" + Email + ", Gender=" + Gender + ", BirthDay=" + BirthDay + ", Nationality=" + Nationality
				+ ", CoverLetter=" + CoverLetter + ", SchoolInformation=" + SchoolInformation + ", Experiences="
				+ Experiences + ", Certficates=" + Certficates + ", Hobbies=" + Hobbies + ", Capabilities="
				+ Capabilities + ", Referances=" + Referances + ", DriversLicense=" + DriversLicense + "]";
	}
	
}
