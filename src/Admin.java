package src;

public class Admin {
	private String name;
	private String password;
	private static HRC hrc=null;
	public Admin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public boolean addCompany() {
		return false;
	}
	public boolean deleteCompany() {
		return false;
	}
	public boolean AddHumanResources() {
		return false;
	}
	public boolean RemoveHumanResources() {
		return false;
	}
	public void SeeStatistics() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		StringBuilder aString =new StringBuilder();
		return aString.toString();
	}
	
	
}
