package com.bridgelabz;

import java.util.Scanner;

public class HospitalManagementMain {
    public static void main(String[] args) {
        System.out.println("welcome to hospitalmanagement program");
        Scanner input = new Scanner(System.in);
        char choice;
        IHospitalManagement  hospitalManagement = new HospitalManagement();
        do {
            System.out.println("Select your Option: \n1.Add new Contact \n2.Edit Contact  \n3. contactsList");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    hospitalManagement.createContact();
                    break;

                case 2:
                    hospitalManagement.contactList();
                    break;
                case 3:
                    hospitalManagement.editContact();
                    break;
            }
            System.out.println("Are you wish to continue:  Y?N");
            choice = input.next().toUpperCase().charAt(0);
        } while (choice != 'N');
        System.out.println(hospitalManagement);
    }
}


