package com.exam.model;

import java.util.Scanner;

public class Contact {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private String Name;
    private String Company;
    private String Email;
    private String Phone;

    public void setName(String name) {
        Name = name;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public String getCompany() {
        return Company;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public Contact(String name, String company, String email, String phone) {
        Name = name;
        Company = company;
        Email = email;
        Phone = phone;
    }

    public Contact() {
    }
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        setName(name);
        System.out.print("Enter email: ");
        String email = input.nextLine();
        setEmail(email);
        System.out.print("Enter Company: ");
        String company= input.nextLine();
        setCompany(company);
        System.out.print("Enter phone: ");
        String phone = input.nextLine();
        setPhone(phone);
    }
    public void displayAll() {
        System.out.println("Contact Name : " + getName());
        System.out.println("Company : " + getCompany());
        System.out.println("Email:  " + getEmail());
        System.out.println("Phone number:  " + getPhone());

    }
}
