package com.dsalgo.leetcode;

public class CountOfMatchesInTournament {

    public static void main(String[] args) {
        //int result = (numberOfMatchesTwo(7, 0));
        CountOfMatchesInTournament c = new CountOfMatchesInTournament();

        System.out.println(c.numberOfMatchesTwo(8, 0));
    }

    public static int numberOfMatches(int n) {
        int temp = n, noOfMatches = 0;
        if(n == 1) return 0;
        while(temp > 0) {
            if(temp % 2 == 0) {
                noOfMatches++;
                temp = temp / 2;
            } else {
                noOfMatches++;
                temp = temp / 2 + 1;
            }
            System.out.println(temp + " " + noOfMatches);
        }
        return noOfMatches;

    }

    int numberOfMatchesTwo(int n, int noOfMatches) {
        if(n == 1) {
            return noOfMatches;
        } else if( n % 2 == 0) {
            return numberOfMatchesTwo(n / 2, noOfMatches + n/2);
        } else {
            return numberOfMatchesTwo(n / 2 + 1, noOfMatches + n/2);
        }
    }

}
