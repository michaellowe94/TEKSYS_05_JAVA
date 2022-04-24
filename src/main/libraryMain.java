package main;

public class libraryMain {

	public static void main(String[] args) {
		KidUsers k = new KidUsers();
		AdultUsers a = new AdultUsers();

		//Kids Test
		k.setAge(10);
		k.registerAccount();
		k.setAge(18);
		k.registerAccount();
		k.setBookType("Kids");
		k.requestBook();
		k.setBookType("Fiction");
		k.requestBook();
		
		//Adults test
		a.setAge(5);
		a.registerAccount();
		a.setAge(23);
		a.registerAccount();
		a.setBookType("Kids");
		a.requestBook();
		a.setBookType("Fiction");
		a.requestBook();
	}
}