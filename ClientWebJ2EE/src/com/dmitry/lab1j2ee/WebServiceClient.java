package com.dmitry.lab1j2ee;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://desktop-tiide9g:8080/JEE2_web1-17721011224133667174.0-SNAPSHOT/PersonService?wsdl");
        PersonService personService = new PersonService(url);
        List<Person> persons = personService.getPersonWebServicePort().getAllPersons();
        for (Person person : persons) {
            System.out.println("id: " + person.getId() +", name: " + person.getName() +
                    ", surname: " + person.getSurname() +", secondname: " +person.secondname + ", age: " + person.getAge());
        }
        System.out.println("Total persons: " + persons.size());

        Scanner in = new Scanner(System.in);


        String b;
        long id;
        String name;
        String surname;
        String secondname;
        String request;

        do {
            System.out.println("Enter request: ");
            request = in.nextLine();


            List<Person> persons1 = personService.getPersonWebServicePort().getFind(request);
            for (Person person : persons1) {
                System.out.println("id: " + person.getId() +", name: " + person.getName() +
                        ", surname: " + person.getSurname() +", secondname: " +person.secondname + ", age: " + person.getAge());
            }
            System.out.println("What do you want to search on database? (yes/no)");
            b = in.nextLine();
            }while (b.equals("yes"));

    }

}
