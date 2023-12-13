// Austin Adams
// 9 November 2023
// CS-320


public class ContactTest 
{
	// Contact ID with a length greater than 10
	void test1() 
	{
		Contact contact = new Contact("Billy", "Bob", "1111111111", "1234Street");
		
		if (contact.getContactID().length() > 10) 
		{
			System.out.println("Contact ID has more than 10 characters.");
		}
	}
	
	// First name with a length greater than 10
	void test2() 
	{
		Contact contact = new Contact("BillyBillyBilly", "Bob", "1111111111", "1234Street");
		
		if (contact.getFirstName().length() > 10) 
		{
			System.out.println("First name has more than 10 characters.");
		}
	}
	
	// Last name with a length greater than 10
	void test3() 
	{
		Contact contact = new Contact("Billy", "BobBobBobBob", "1111111111", "1234Street");
		
		if (contact.getLastName().length() > 10) 
		{
			System.out.println("Last name has more than 10 characters.");
		}
	}
	
	// Number with a length greater than 10
	void test4() 
	{
		Contact contact = new Contact("Billy", "Bob", "1111111111111", "1234Street");
		
		if (contact.getNumber().length() > 10) 
		{
			System.out.println("Number has more than 10 characters.");
		}
	}
	
	// Address with a length greater than 30
	void test5() 
	{
		Contact contact = new Contact("Billy", "Bob", "1111111111", "123456Street");
		
		if (contact.getAddress().length() > 10) 
		{
			System.out.println("Address has more than 30 characters.");
		}
	}
}
