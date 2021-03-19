package demo6;

public class Test2 {
public static void main(String[] args) {
	String s1 = "devi sri";
	String s2 = "Anu Ramya";
	
	
	if(s1.contains("Devi")) {
		System.out.println("String is present  "+ s1);
	}else {
		System.out.println("String is not present  "+ s1);
	}
	
	
	if(s2.contains("Anu")) {
		System.out.println("String is present  "+ s2);
	}else {
		System.out.println("String is not present  "+ s2);
	}
	System.out.println("String contains or not: "+s1.contains("devi"));
	System.out.println("String contains or not: "+s1.contains("Devi"));
	System.out.println("String contains or not: "+s2.contains("anu"));
	System.out.println("String contains or not: "+s2.contains("Anu"));

}
}
