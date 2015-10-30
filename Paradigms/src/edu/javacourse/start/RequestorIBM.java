package edu.javacourse.start;

import edu.javacourse.GoodsList;
import edu.javacourse.Requestor;

public class RequestorIBM extends Requestor 
{
    @Override
    public GoodsList getGoodsList() {
        System.out.println("Child  method");
        return null;
    }
    
    public GoodsList getGoodsList(String group) {
        return null;
    }
    
    public GoodsList getGoodsList(double priceMin, double priceMax) {
        return null;
    }
    
    public GoodsList getGoodsList(double priceMin) {
        return null;
    }
}
