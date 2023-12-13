// Austin Adams
// 9 November 2023
// CS-320


public class ConctactServiceTest 
{
	// Update first name
	void test1() 
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.updateFirstName("James", "1");
		service.displayList();
	}
	
	// Update last name
	void test2() 
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.updateLastName("James", "1");
		service.displayList();
	}
	
	// Update number
	void test3() 
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.updateNumber("2222222222", "1");
		service.displayList();
	}
	
	// Update address
	void test4() 
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.updateLastName("4321Street", "1");
		service.displayList();
	}
	
	// Delete Contact
	void test5()
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.deleteContact("1");
		service.displayList();
	}
	
	// Add contact
	void test6()
	{
		ContactService service = new ContactService();
		service.addContact("Billy", "Bob", "1111111111", "1234Street");
		service.displayList();
	}
}
