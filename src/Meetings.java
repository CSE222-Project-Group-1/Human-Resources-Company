package linkedlist;

public class Meetings{
	
	public Meetings(String date, Candidate candidate, Company company, String time, int meetingRate) {
		super();
		this.date = date;
		this.candidate = candidate;
		this.company = company;
		this.time = time;
		MeetingRate = meetingRate;
	}
	private	String date;
	private Candidate candidate;
	private Company company;
	private String time;
	private int MeetingRate;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getMeetingRate() {
		return MeetingRate;
	}
	public void setMeetingRate(int meetingRate) {
		MeetingRate = meetingRate;
	}
	
}
