package src;

import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.TreeMap;

import src.book_implementation.AVLTree;
import src.book_implementation.SkipList;


@SuppressWarnings("unused")
public class HRC<E extends Comparable<E>>{
		
		private AVLTree<HumanResources<E>> humanResources; // AVL
		private SkipList<Company> company; 
		private NavigableMap<Integer,Candidate> candidate= new TreeMap<>();
		private ArrayList<Meetings> meetings;
		private Admin admin=null;
		
		
		public SkipList<Company> getCompany() { return company; }
		
		
		
}
