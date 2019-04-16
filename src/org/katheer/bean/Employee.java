package org.katheer.bean;

public class Employee {
    private String ename;
    private String eid;
    private float esal;
    private Address address1;
    private Account account1;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public Address getAddress() {
        return address1;
    }

    public void setAddress(Address address) {
        this.address1 = address;
    }

    public Account getAccount() {
        return account1;
    }

    public void setAccount(Account account) {
        this.account1 = account;
    }

    public void showEmployeeDetails() {
        System.out.println("*********************************************************");
        System.out.println(String.format("%-15s: %s\n%-15s: %s\n%-15s: %.1f",
                "Employee Name", this.getEname(), "Employee ID",
                this.getEid(), "Employee Salary", this.getEsal()));
        System.out.println(String.format("%-15s: %s", "Address", this.getAddress()));
        System.out.println("Account Details: ");
        System.out.println(this.getAccount());
        System.out.println("*********************************************************");
    }
}
