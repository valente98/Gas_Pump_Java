package com.company;

public class Gas_type {
    public double price;
    public double gallon_amount;
    public String gas_type;

    Gas_type(double gallon_amount, double price, String gas_type){
        this.gallon_amount = gallon_amount;
        this.price = price;
        this.gas_type = gas_type;
    }

    public double regular(){
        if(gallon_amount <= 0.0){
            return price / 2.40;
        } else{
            return gallon_amount * 2.40;
        }
    }
    public double midgrade(){
        if(gallon_amount <= 0.0){
            return price / 2.80;
        } else{
            return gallon_amount * 2.80;
        }
    }
    public double premium(){
        if(gallon_amount <= 0.0){
            return price / 3.00;
        } else{
            return gallon_amount * 3.00;
        }
    }

}
