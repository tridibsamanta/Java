import java.util.*; 
public class ArrayList_toString { 
    public static void main(String[] args) 
    { 
        int n = 3; 
		
        ArrayList<ArrayList<Integer> > aList = new ArrayList<ArrayList<Integer> >(n); 
				  
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(15); 
        a1.add(30); 
        aList.add(a1); 
  
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(1998); 
        aList.add(a2); 
  
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(9); 
        a3.add(81); 
        a3.add(729); 
        aList.add(a3); 
  
        for (int i = 0; i < aList.size(); i++) { 
            for (int j = 0; j < aList.get(i).size(); j++) { 
                System.out.print(aList.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        }
		System.out.println("Array List 1 contains : "+a1.toString());	
		System.out.println("Array List 2 contains : "+a2.toString());
		System.out.println("Array List 3 contains : "+a3.toString());
    } 
} 