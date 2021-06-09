package src;

import java.util.PriorityQueue;

import src.book_implementation.ArrayQueue;

public class AdvertiseClass {
		private String AdvertisementTitle;
		private String WayOfWork;
		private String JobRole;
		private String JobType;
		private String JobLocation;
		private String NumberOfVacancies; //ka� ki�ilik ilan
		private String CompanyIndustry;
		private ArrayQueue<String> Capabilities; // Queue
		private PriorityQueue<Candidate> applied; // Priority Queue
		
		private String LevelOfEducation;
		private int ExperienceYear;
		private String Description;
		public AdvertiseClass(String advertisementTitle, String wayOfWork, String jobRole, String jobType,
				String jobLocation, String numberOfVacancies, String companyIndustry, ArrayQueue<String> capabilities,
				String levelOfEducation, int experienceYear, String description) {
			super();
			AdvertisementTitle = advertisementTitle;
			WayOfWork = wayOfWork;
			JobRole = jobRole;
			JobType = jobType;
			JobLocation = jobLocation;
			NumberOfVacancies = numberOfVacancies;
			CompanyIndustry = companyIndustry;
			Capabilities = capabilities;
			LevelOfEducation = levelOfEducation;
			ExperienceYear = experienceYear;
			Description = description;
		}
		public String getAdvertisementTitle() {
			return AdvertisementTitle;
		}
		public void setAdvertisementTitle(String advertisementTitle) {
			AdvertisementTitle = advertisementTitle;
		}
		public String getWayOfWork() {
			return WayOfWork;
		}
		public void setWayOfWork(String wayOfWork) {
			WayOfWork = wayOfWork;
		}
		public String getJobRole() {
			return JobRole;
		}
		public void setJobRole(String jobRole) {
			JobRole = jobRole;
		}
		public String getJobType() {
			return JobType;
		}
		public void setJobType(String jobType) {
			JobType = jobType;
		}
		public String getJobLocation() {
			return JobLocation;
		}
		public void setJobLocation(String jobLocation) {
			JobLocation = jobLocation;
		}
		public String getNumberOfVacancies() {
			return NumberOfVacancies;
		}
		public void setNumberOfVacancies(String numberOfVacancies) {
			NumberOfVacancies = numberOfVacancies;
		}
		public String getCompanyIndustry() {
			return CompanyIndustry;
		}
		public void setCompanyIndustry(String companyIndustry) {
			CompanyIndustry = companyIndustry;
		}
		public ArrayQueue<String> getCapabilities() {
			return Capabilities;
		}
		public void setCapabilities(ArrayQueue<String> capabilities) {
			Capabilities = capabilities;
		}
		public String getLevelOfEducation() {
			return LevelOfEducation;
		}
		public void setLevelOfEducation(String levelOfEducation) {
			LevelOfEducation = levelOfEducation;
		}
		public int getExperienceYear() {
			return ExperienceYear;
		}
		public void setExperienceYear(int experienceYear) {
			ExperienceYear = experienceYear;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		@Override
		public String toString() {
			return "AdvertiseClass [AdvertisementTitle=" + AdvertisementTitle + ", WayOfWork=" + WayOfWork + ", JobRole="
					+ JobRole + ", JobType=" + JobType + ", JobLocation=" + JobLocation + ", NumberOfVacancies="
					+ NumberOfVacancies + ", CompanyIndustry=" + CompanyIndustry + ", Capabilities=" + Capabilities
					+ ", LevelOfEducation=" + LevelOfEducation + ", ExperienceYear=" + ExperienceYear + ", Description="
					+ Description + "]";
		}
	}
