package com.company;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;
    private RewardsMember rewardsMember;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RewardsMember getRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(RewardsMember rewardsMember) {
        this.rewardsMember = rewardsMember;
    }
}
