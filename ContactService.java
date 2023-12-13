// Austin Adams
// 9 November 2023
// CS-320

import java.util.ArrayList;


public class ContactService
{
	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	// Display contact list
	public void displayList()
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			System.out.println("\t First Name: " + contactList.get(i).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(i).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(i).getNumber());
			System.out.println("\t Address: " + contactList.get(i).getAddress());
			System.out.println("\t Contact ID: " + contactList.get(i).getContactID());
		}
	}
	
	// Add new contact
	public void addContact(String firstName, String lastName, String number, String address)
	{
		Contact contact = new Contact(firstName, lastName, number, address);
		contactList.add(contact);
	}
	
	// Remove contact
	public void deleteContact(String contactID)
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().equals(contactID))
			{
				contactList.remove(i);
				break;
			}
			
			if (i == contactList.size())
			{
				
			}
		}
	}
	
	// Get contact from id
	public Contact getContact(String contactID)
	{
		Contact contact = new Contact(null, null, null, null);
				
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().contentEquals(contactID))
			{
				contact = contactList.get(i);
			}
		}
		
		return contact;
	}
	
	// Update first name
	public void updateFirstName(String updName, String contactID)
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().equals(contactID))
			{
				contactList.get(i).setFirstName(updName);
				break;
			}
			
			if (i == contactList.size() - 1)
			{
				System.out.println("Contact ID " + contactID + " not found.");
			}
		}
	}
	
	// Update last name
	public void updateLastName(String updName, String contactID)
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().equals(contactID))
			{
				contactList.get(i).setLastName(updName);
				break;
			}
			
			if (i == contactList.size() - 1)
			{
				System.out.println("Contact ID " + contactID + " not found.");
			}
		}
	}
	
	// Update number
	public void updateNumber(String updNum, String contactID)
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().equals(contactID))
			{
				contactList.get(i).setNumber(updNum);
				break;
			}
			
			if (i == contactList.size() - 1)
			{
				System.out.println("Contact ID " + contactID + " not found.");
			}
		}
	}
	
	// Update Address
	public void updateAddress(String updAddress, String contactID)
	{
		for (int i = 0; i < contactList.size(); i++)
		{
			if (contactList.get(i).getContactID().equals(contactID))
			{
				contactList.get(i).setAddress(updAddress);
				break;
			}
			
			if (i == contactList.size() - 1)
			{
				System.out.println("Contact ID " + contactID + " not found.");
			}
		}
	}
}
