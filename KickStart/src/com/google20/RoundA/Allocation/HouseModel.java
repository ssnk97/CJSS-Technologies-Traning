package com.google20.RoundA.Allocation;

import java.util.Comparator;
import java.util.List;

public class HouseModel implements Comparable<Integer> {

    private Integer housesAvl; // n houses avl for him to buy
    private Integer cashAvl; // inhand or available cash with user
    private List<Integer> housesPrice;
    private Integer sum=0,count=0;          // temperary variable

    @Override
    public int compareTo(Integer o) {
        return 1;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getHousesAvl() {
        return housesAvl;
    }

    public void setHousesAvl(Integer housesAvl) {
        this.housesAvl = housesAvl;
    }

    public Integer getCashAvl() {
        return cashAvl;
    }

    public void setCashAvl(Integer cashAvl) {
        this.cashAvl = cashAvl;
    }

    public List<Integer> getHousesPrice() {
        return housesPrice;
    }

    public void setHousesPrice(List<Integer> housesPrice) {
        this.housesPrice = housesPrice;
    }
}
