package src;

public class Admin  extends Users implements Comparable<Admin> {
	private HRC hrc=null;

	public Admin(int userID, String name, String password, HRC hrc) {
		super(userID,name,password,Users.ADMIN);
		this.hrc=hrc;
	}
	public boolean addCompany(Company com) {
		if (!hrc.getCompany().contains(com)){
			hrc.getCompany().add(com);
			return true;
		}
		return false;
	}
	public boolean updateCompany(Company com,String name, String password,  String companySector,
								 Integer numberOfEmployees,  String address){
		if (com==null) return false;
		boolean result=false;
		if (name!=null){
			result=true;
			com.setName(name);
		}
		if (password!=null){
			result=true;
			com.setPassword(password);
		}
		if (companySector!=null){
			com.setCompanySector(companySector);
			result=true;
		}
		if (numberOfEmployees!=null){
			com.setNumberOfEmployees(numberOfEmployees);
			result=true;
		}
		if (address!=null){
			com.setAddress(address);
		}
		return result;
	}

	public boolean deleteCompany(Company com) {
		Company result=hrc.getCompany().remove(com);
		return  result!=null;
	}

	public boolean AddHumanResources(HumanResources hm) {
		return hrc.getHumanResources().add(hm);
	}
	public boolean updateHumanResources(HumanResources hm,String name, String password){
		if (hm==null) return false;
		boolean result=false;
		if (name!=null && !name.isEmpty()){
			hm.setName(name);
			result=true;
		}
		if (password!=null && !password.isEmpty()){
			hm.setPassword(password);
			result=true;
		}

		return result;
	}
	public boolean RemoveHumanResources(HumanResources hmn) {

		return hrc.getHumanResources().remove(hmn);
	}
	public void SeeStatistics() {

	}

	

	public String toString() {
		StringBuilder aString =new StringBuilder();
		return aString.toString();
	}



	/**
	 * Compares this object with the specified object for order.  Returns a
	 * negative integer, zero, or a positive integer as this object is less
	 * than, equal to, or greater than the specified object.
	 *
	 * <p>The implementor must ensure
	 * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
	 * for all {@code x} and {@code y}.  (This
	 * implies that {@code x.compareTo(y)} must throw an exception iff
	 * {@code y.compareTo(x)} throws an exception.)
	 *
	 * <p>The implementor must also ensure that the relation is transitive:
	 * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
	 * {@code x.compareTo(z) > 0}.
	 *
	 * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
	 * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
	 * all {@code z}.
	 *
	 * <p>It is strongly recommended, but <i>not</i> strictly required that
	 * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
	 * class that implements the {@code Comparable} interface and violates
	 * this condition should clearly indicate this fact.  The recommended
	 * language is "Note: this class has a natural ordering that is
	 * inconsistent with equals."
	 *
	 * <p>In the foregoing description, the notation
	 * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
	 * <i>signum</i> function, which is defined to return one of {@code -1},
	 * {@code 0}, or {@code 1} according to whether the value of
	 * <i>expression</i> is negative, zero, or positive, respectively.
	 *
	 * @param o the object to be compared.
	 * @return a negative integer, zero, or a positive integer as this object
	 * is less than, equal to, or greater than the specified object.
	 * @throws NullPointerException if the specified object is null
	 * @throws ClassCastException   if the specified object's type prevents it
	 *                              from being compared to this object.
	 */
	@Override
	public int compareTo(Admin o) {
		return getUserID() - o.getUserID();
	}

	public boolean equals(Admin o){
		return getName().equals(o.getName()) && getPassword().equals(o.getPassword());
	}
}
