package org.katheer.bean;

public class Account {
    private String accNo;
    private String bank;
    private String branch;
    private float balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n",
                "Account No", this.getAccNo(), "Bank Name", this.getBank(),
                "Branch", this.getBranch(), "Balance", this.getBalance());
    }
}
