package src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

import src.book_implementation.AVLTree;
import src.book_implementation.SkipList;


@SuppressWarnings("unused")
public class HRC{
		public static int  USERS_ID=0;
		private AVLTree<HumanResources> humanResources; // AVL
		private SkipList<Company> company;
		private NavigableMap<Integer,Candidate> candidate= new TreeMap<>();
		private ArrayList<Meetings> meetings;
		private Admin admin=null;
		

		public SkipList<Company> getCompany() { return company; }

		public AVLTree<HumanResources> getHumanResources() { return humanResources; }

		public ArrayList<Meetings> getMeetings() { return meetings; }

		public Admin getAdmin(){	return admin;	}

		public Candidate getCandidateID(int id){	return candidate.get(id);	}
		
		public NavigableMap<Integer,Candidate> getCandidate(){	return candidate;	}
		
		public Company searchCompany(int ID){
			Company com=null;
			Company temp=null;
			Iterator<Company> itr=getCompany().iterator();
			while (itr.hasNext() && com!=null){
				temp=itr.next();
				if (temp.getUserID()==ID){
					com=temp;
				}
			}
			return com;
		}

		public Company createCompany(int ID,String name, String password, ArrayList<AdvertiseClass> advertises,
									 String companySector,int numberOfEmployees,
									 ArrayList<String> socialRights, String address,
									 ArrayList<Integer> ratings, double ratingsOrt){
			return new Company(ID,name,password,advertises,companySector,numberOfEmployees,socialRights,address,ratings,ratingsOrt,this);
		}

		public Company createCompany(String name, String password, ArrayList<AdvertiseClass> advertises,
									 String companySector,int numberOfEmployees,
									 ArrayList<String> socialRights, String address,
									 ArrayList<Integer> ratings, double ratingsOrt){
			return createCompany(USERS_ID++,name,password,advertises,companySector,numberOfEmployees,socialRights,address,ratings,ratingsOrt);
		}

		public HumanResources createHumanResources(int ID,String name, String password){
			return new HumanResources(ID,name,password,this);
		}

		public HumanResources createHumanResources(String name, String password){
			return createHumanResources(USERS_ID++,name,password);
		}

}
