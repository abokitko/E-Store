package com.solvd.lab.v2.automation.shop.Discount;

import java.util.Date;

public class Campaigns{
    private String region;
    private Date start;
    private Date end;

    public Campaigns() {
    }

    public Campaigns(String region, Date start, Date end) {
        this.region = region;
        this.start = start;
        this.end = end;
    }
}