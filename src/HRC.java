package linkedlist;


@SuppressWarnings("unused")
public class HRC<E extends Comparable<E>>{
		
		private AVL<HumanResources<E>> humanResources; // AVL
		private SkipList<Company> company; 
		private NavigableMap<Integer,Candidate> candidate= new TreeMap<>();
		private ArrayList<Meetings> meetings;
		private Admin admin=null;
		
		
		public ArrayList<Company> getCompany() { return company; }
		
		
		
}
