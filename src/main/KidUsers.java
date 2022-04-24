package main;

public class KidUsers implements LibraryUsers {

		static int age;
		public static int getAge() {
			return age;
		}

		public static void setAge(int age) {
			KidUsers.age = age;
		}

		public static String getBookType() {
			return bookType;
		}

		public static void setBookType(String bookType) {
			KidUsers.bookType = bookType;
		}

		static String bookType;
	
	@Override
	public void registerAccount() {
		if (getAge() < 12) {
			System.out.println("You have successfully registered under a kids account.");
		} else {
			System.out.println("Sorry, age must be less than 12 to register as a kid.");
		}
		
	}

	@Override
	public void requestBook() {
		if (getAge() < 12 && getBookType() == "Kids") {
			System.out.println("Book issued successfully, please return the book within 10 days.");
		} else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
	}

}
