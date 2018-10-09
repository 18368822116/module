/**
 * www.xinhehui.com
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.lh.common.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 003427
 * @version $Id: Demo2.java, v 0.1 2018-10-08 8:56 003427 Exp $$
 */
public class Demo2 {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<Transaction>(){{
           add(new Transaction(new Trader("Raoul", "Cambridge"),2011,300));
            add(new Transaction(new Trader("Mario","Milan"),2011,300));
            add(new Transaction(new Trader("Alan","Cambridge"),2011,300));
            add(new Transaction(new Trader("Brian","Cambridge"),2011,300));
            add(new Transaction(new Trader("Raoul", "Cambridge"),2011,300));
            add(new Transaction(new Trader("Brian","Cambridge"),2011,300));
        }};
    }

    static class Trader{
        private String name;
        private String city;

        public Trader(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    static class Transaction{
        private Trader trader;
        private int year;
        private int value;

        public Transaction(Trader trader, int year, int value) {
            this.trader = trader;
            this.year = year;
            this.value = value;
        }

        public Trader getTrader() {
            return trader;
        }

        public void setTrader(Trader trader) {
            this.trader = trader;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
