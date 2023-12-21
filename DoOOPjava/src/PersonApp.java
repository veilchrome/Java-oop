
public class PersonApp {
	public static void main(String[] args ) {
		var person1 = new Person("Eko", "Depok");
		// person1.country = "Amerika" // EROR
		
		
		System.out.println(person1.name);
		System.out.println(person1.address);
		System.out.println(person1.country);
		
		person1.sayHello("Budi");
		
		Person person2 = new Person("Budi");
		Person person3;
		person3 = new Person();
		person3.name = "Selamet";
		person3.sayHello("Budi");
		
		// sesi 2//
		
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
