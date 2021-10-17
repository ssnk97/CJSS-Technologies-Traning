package com.google20.RoundA.Allocation;

import java.util.*;

/*
Problem:
    There are N houses for sale. The i-th house costs Ai dollars to buy. You have a budget of B dollars to spend.
    What is the maximum number of houses you can buy?

Input
    The first line of the input gives the number of test cases, T. T test cases follow.
    Each test case begins with a single line containing the two integers N and B.
    The second line contains N integers. The i-th integer is Ai, the cost of the i-th house.
Output
    For each test case, output one line containing
    Case #x: y, where x is the test case number (starting from 1) and y is the maximum number of houses you can buy.

Limits
    Time limit: 15 seconds per test set.
    Memory limit: 1GB.
    1 ≤ T ≤ 100.
    1 ≤ B ≤ 105.
    1 ≤ Ai ≤ 1000, for all i.
Test set 1
    1 ≤ N ≤ 100.
Test set 2
    1 ≤ N ≤ 105.

Sample:
Input
        3                       --> no of test cases or user
        4 100                   -->testcase1: N=4 (no of houses avl),  B=100 (cashAvl)
        20 90 40 90             --> 20,90,40,90 are housesprice
        4 50                    --> TestCase2:
        30 30 10 10
        3 300                   --> TestCase3:
        999 999 999

Output:
        Case #1: 2
        Case #2: 3
        Case #3: 0

 */
public class AllocationMain {



    public static void main(String[] args) {
        Integer testCases; // no  of users
        Scanner sc = new Scanner(System.in);
        List<HouseModel> houseModels = new ArrayList<>();

        testCases = Integer.parseInt(sc.next());
        for(int i=0; i<testCases; i++)
        {
            HouseModel h1 = new HouseModel();
            List <Integer> housesPrice = new ArrayList<>();
            h1.setHousesAvl(sc.nextInt());      //N
            h1.setCashAvl(sc.nextInt());        //B
            for(int j=0; j<h1.getHousesAvl(); j++)
                housesPrice.add(sc.nextInt());
            Collections.sort(housesPrice);
            h1.setHousesPrice(housesPrice);         //list of houseprices in ascending order
            houseModels.add(h1);
        }

        for (HouseModel hs: houseModels) {
            System.out.println(hs.getHousesAvl() + " "+ hs.getCashAvl() + hs.getHousesPrice());
        }


        houseModels.forEach(hm->{
            //int sum=0;
            hm.getHousesPrice().forEach(price->{
                if((hm.getSum()+price)<=hm.getCashAvl()){
                    hm.setSum(hm.getSum()+price);
                    hm.setCount(hm.getCount()+1);
                }
            });
        });

        for (HouseModel hs: houseModels) {
            System.out.println(hs.getHousesAvl() + " "+ hs.getCashAvl() + hs.getHousesPrice() + "no of Houses can buy: : "+hs.getCount());
        }
    }


}
