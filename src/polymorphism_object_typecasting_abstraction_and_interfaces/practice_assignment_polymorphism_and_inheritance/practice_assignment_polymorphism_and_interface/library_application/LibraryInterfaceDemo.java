package polymorphism_object_typecasting_abstraction_and_interfaces.practice_assignment_polymorphism_and_inheritance.practice_assignment_polymorphism_and_interface.library_application;

interface LibraryUser {
    String registerAccount();
    String requestBook();

}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String registerAccount() {
        if(getAge() <= 11){
            return "You have successfully registered under a Kids Account.";
        }
        return "Sorry, age must be less than 12 to register as a kid.";
    }

//    @Override
//    public String requestBook() {
//        if (getBookType().equals("Kids")){
//            return "Book issued successfully, please return the book within 10 days.";
//        }
//        return "Oops, you are allowed to take only kids books.";
//
//    }

    @Override
    public String requestBook() {
        if (getAge() <= 11){
            if (getBookType().equals("Kids")){
                return "Book issued successfully, please return the book within 10 days.";
            }
            else {
                return "Oops, you are allowed to take only kids books.";
            }
        }
        return "Please register as an adult";
    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public String registerAccount() {
        if (getAge() >= 12){
            return "You have successfully registered under an Adult Account.";
        }
        return "Sorry, age must be greater than 12 to register as an adult.";
    }

    @Override
    public String requestBook() {
        if (getAge() >= 12){
            if (getBookType().equals("Fiction")){
                return "Book Issued successfully, please return the book within 7 days.";
            }
            else {
                return "Oops, you are allowed to take only adult Fiction books.";
            }
        }
        return "Please register as a kid";
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1
        System.out.println("Test Case 1");

        System.out.println("*****************************************************************************************************");
        System.out.println("1. When trying to register account and request book as a kid when age is 10 years and book type is \"Kids\"");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        KidUser kidUser1 = new KidUser(10, "Kids");
        System.out.println(kidUser1.registerAccount());
        System.out.println(kidUser1.requestBook());

        System.out.println();
        System.out.println("2. When trying to register account and request book as a kid when age is 10 years and book type is \"Fiction\"");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        KidUser kidUser2 = new KidUser(10, "Fiction");
        System.out.println(kidUser2.registerAccount());
        System.out.println(kidUser2.requestBook());

        System.out.println();
        System.out.println("3. When trying to register account and request book as a kid when age is 18 years and book type is \"Kids\"");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        KidUser kidUser3 = new KidUser(18, "Kids");
        System.out.println(kidUser3.registerAccount());
        System.out.println(kidUser3.requestBook());

        System.out.println();
        System.out.println("4. When trying to register account and request book as a kid when age is 18 years and book type is \"Fiction\"");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        KidUser kidUser4 = new KidUser(18, "Fiction");
        System.out.println(kidUser4.registerAccount());
        System.out.println(kidUser4.requestBook());

        System.out.println();

        // Test case #2
        System.out.println("Test Case 2");

        System.out.println("*****************************************************************************************************");
        System.out.println("1. When trying to register account and request book as an adult when age is 5 years and book type is \"Kids\"");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        AdultUser adultUser1 = new AdultUser(5, "Kids");
        System.out.println(adultUser1.registerAccount());
        System.out.println(adultUser1.requestBook());
        System.out.println();

        System.out.println("2. When trying to register account and request book as an adult when age is 23 years and book type is \"Fiction\"");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        AdultUser adultUser2 = new AdultUser(5, "Fiction");
        System.out.println(adultUser2.registerAccount());
        System.out.println(adultUser2.requestBook());
        System.out.println();

        System.out.println("3. When trying to register account and request book as an adult when age is 23 years and book type is \"Kids\"");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        AdultUser adultUser3 = new AdultUser(23, "Kids");
        System.out.println(adultUser3.registerAccount());
        System.out.println(adultUser3.requestBook());
        System.out.println();

        System.out.println("4. When trying to register account and request book as an adult when age is 23 years and book type is \"Fiction\"");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        AdultUser adultUser4 = new AdultUser(23, "Fiction");
        System.out.println(adultUser4.registerAccount());
        System.out.println(adultUser4.requestBook());

    }
}