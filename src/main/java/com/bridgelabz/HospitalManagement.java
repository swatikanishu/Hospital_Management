package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement implements IHospitalManagement{
    static Scanner input = new Scanner(System.in);
    ArrayList<PatientDetails> contact = new ArrayList<>();

    @Override
    public void createContact() {
        PatientDetails personDetails = new PatientDetails();
        System.out.println("Enter Your First Name: ");
        personDetails.setFirstName(input.next());
        System.out.println("Enter Your Last Name: ");
        personDetails.setLastName(input.next());
        System.out.println("Enter Your Address: ");
        personDetails.setAddress(input.next());
        System.out.println("Enter Your City: ");
        personDetails.setCity(input.next());
        System.out.println("Enter Your State: ");
        personDetails.setState(input.next());
        System.out.println("Enter Your Zip code: ");
        personDetails.setZip(input.nextInt());
        System.out.println("Enter Your Email Id: ");
        personDetails.setEmail(input.next());
        System.out.println("Enter Your Mobile Number: ");
        personDetails.setPhoneNumber(input.nextLong());
        contact.add(personDetails);
        System.out.println("contact added successfully");
    }

    @Override
    public void editContact() {
        System.out.println("\nEnter First Name of person You want to edit :- ");
        String firstName = input.next();
        String userChoice;

        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(firstName)) {
                do {
                    System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new first name : ");
                            contact.get(i).setFirstName(input.next());
                            System.out.println("First name is updated.");
                            break;
                        case 2:
                            System.out.print("Enter new last name : ");
                            contact.get(i).setLastName(input.next());
                            System.out.println("Last name is updated.");
                            break;
                        case 3:
                            System.out.print("Enter new address :");
                            contact.get(i).setAddress(input.next());
                            System.out.println("Address is updated.");
                            break;
                        case 4:
                            System.out.print("Enter new city : ");
                            contact.get(i).setCity(input.next());
                            System.out.println("City is updated.");
                            break;
                        case 5:
                            System.out.print("Enter new state : ");
                            contact.get(i).setState(input.next());
                            System.out.println("State is updated.");
                            break;
                        case 6:
                            System.out.print("Enter new zip code : ");
                            contact.get(i).setZip(input.nextInt());
                            System.out.println("Zip code is updated.");
                            break;
                        case 7:
                            System.out.print("Enter new phone number : ");
                            contact.get(i).setPhoneNumber(input.nextLong());
                            System.out.println("Phone number is updated.");
                            break;
                        case 8:
                            System.out.print("Enter new email : ");
                            contact.get(i).setEmail(input.next());
                            System.out.println("Email is updated.");
                            break;
                    }
                    System.out.println("Are you wish to edit other Address fields: Y?N");
                    userChoice = input.next();
                } while (userChoice.toUpperCase().equals("Y"));
                return;
            }
        }
        System.out.println("Please enter the correct first name");
    }



    @Override
    public void contactList() {
        if (contact.isEmpty()) {
            System.out.println("Your address book is empty.");
            return;
        }
        System.out.println("\n Address Book:");
        for (PatientDetails patient : contact) {
            System.out.println("contact" + patient.getFirstName());
        }

    }


    @Override
    public String toString() {
        return "HospitalManagement{" +
                "contact=" + contact +
                '}';
    }
}


