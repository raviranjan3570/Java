package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){

        if(findBranch(branchName) == null){

            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){

        Branch existingBranch = findBranch(branchName);

        if(existingBranch != null){

            return existingBranch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransactions(String branchName, String customerName, double amount){

        Branch existingBranch = findBranch(branchName);

        if(existingBranch != null){

            return existingBranch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName){

        for(int i = 0; i < this.branches.size(); i++){

            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)){
                return checkedBranch;
            }
        }

        return null;
    }

    public boolean listCustomer(String branchName, boolean showTransactions){

        Branch branch = findBranch(branchName);

        if(branch != null){
            System.out.println("Customer detail for branch " + branch.getName());

            ArrayList<Customer> branchCustomer = branch.getCustomers();

            for(int i = 0; i < branchCustomer.size(); i++){

                Customer customer = branchCustomer.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i+1) + "]");

                if(showTransactions){

                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){

                        System.out.println("[" + (j+1) + "] Amount: "  + transactions.get(j));
                    }
                }
            }

            return true;
        }
        else {
            return false;
        }
    }
}
