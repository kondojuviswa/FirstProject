package HelloWorld;

public class instanceOfTest {
public static void main(String[] args){
	parent p1 = new parent();
	parent p2 = new child();
	System.out.println("p1 is an instance of parent "+ (p1 instanceof parent));
	System.out.println("p2 is an instance of child "+ (p2 instanceof child));
	System.out.println("p2 is an instance of parent "+ (p2 instanceof parent));
	System.out.println("p2 is an instance of myInterface "+ (p2 instanceof myInterface));
	
	
	
}
}
class parent{}
class child extends parent implements myInterface{}
interface myInterface{}

