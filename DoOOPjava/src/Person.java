// Kode Field //
public class Person {
	String name;
	String address;
	String sex;
	final String country = "Indonesia";
	
	Person(String paramName, String paramAddress, String paramSex) {
		name = paramName;
		address = paramAddress;
		sex = paramSex;
		
	}
	
	Person(String paramName) {
		name = paramName;
	}
	
	Person() {
		
	}
	
	void sayHello(String paramName) {
		System.out.println("Hello " + paramName + " , My Name is "+ name);
	}
	void sayAddress(String paramName) {
		System.out.println("Alamat Saya" + paramName + name);
	}
	
}
