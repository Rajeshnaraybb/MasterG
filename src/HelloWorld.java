
public class HelloWorld {
	
	public static void main(String args[]) {
		//\u000dSystem.out.println("Hello World");
		
		// STRING is immutable - once the object is created it value cannot bechanged
		String str = "value 1";
		
		// concat, replace, substring ---> original string str will not be changed, new string would be returned
		str.concat("value 3"); 
		String concat = str.concat(" value 3");
		System.out.println("str====>"+concat);
		
		// bad concatenation
		String new1 = "dummy1";
		String new2 = "dummy2";
		
		for(int i=0; i<5; i++) {
			// Bad concatentaion because each time the concat happens you are actuall creating new object
			// use string buffer which is thread safe and string builder which not thread safe
		new1 = new1+"aa"+new2+"--";
		
	}
		StringBuffer buffer = new StringBuffer("value 1");
		String string1 = "+ value 2";
		for (int j = 0; j < 5; j++) {
			buffer.append(string1);
		}
		System.out.println("new 1--->"+buffer);
	}
}