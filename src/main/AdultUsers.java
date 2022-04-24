package main;

public class AdultUsers implements LibraryUsers {

	// Variables start
		static int age = 20;
		static String bookType = "Fiction";
	// Variables end
		public static int getAge() {
			return age;
		}

		public static void setAge(int age) {
			AdultUsers.age = age;
		}

		public static String getBookType() {
			return bookType;
		}

		public static void setBookType(String bookType) {
			AdultUsers.bookType = bookType;
		}

	
	@Override
	public void registerAccount() {
		if (getAge() > 12) {
			System.out.println("You have successfully registered as an adult.");
		} else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult.");
		}
		
	}

	@Override
	public void requestBook() {
		if (getAge() > 12 && getBookType() == "Fiction") {
			System.out.println("Book issued successfully, please return the book in 7 days.");
		} else {
			System.out.println("Oops, you are allowed to take only adult fiction books.");
		}
		
	}

}
