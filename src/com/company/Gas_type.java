package com.company;

public class Gas_type {
    public double gas_amount;
    public double gallon_amount;
    public String gas_type;

    Gas_type(double gallon_amount, double gas_amount, String gas_type){
        this.gallon_amount = gallon_amount;
        this.gas_amount = gas_amount;
        this.gas_type = gas_type;
    }

    public double regular(){
        return 0;
    }

}
