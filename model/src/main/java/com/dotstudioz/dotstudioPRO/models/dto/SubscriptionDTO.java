package com.dotstudioz.dotstudioPRO.models.dto;

import java.util.ArrayList;

/**
 * Created by user on 15-06-2016.
 */
public class SubscriptionDTO {
    /**
     {
         "success": true,
         "data": [
             {
                 "_id": "5ebdc0dfe54b7f0eec06cc82",
                 "name": "Annual Subscription",
                 "price": "59.99",
                 "duration": {
                     "interval": 12,
                     "interval_unit": "month"
                 },
                 "company_id": "5e41f4756b4c5d439f3ebca2",
                 "chargify_id": "5231110",
                 "entire_catalogue": false,
                 "ads_enabled": false,
                 "apple_product_id": "",
                 "google_product_id": "",
                 "roku_product_id": "",
                 "description": "$4.99/month annual subscription  with a 14 day FREE TRIAL, billed annually.",
                 "price_display": "total",
                 "is_most_popular": true,
                 "status": "Active",
                 "channels": [
                     "5e77ccf03dc85963461c6622",
                     "5eb5f9c751dc7948af1125c2",
                     "5e4d261ab70e4f101afaa234"
                 ],
                 "taxable": true,
                 "trial": {
                     "trial_price": 0,
                     "interval": 14,
                     "interval_unit": "day"
                 }
            },
            {
                 "_id": "5ebdbcb7376740237e72ac82",
                 "name": "Monthly Subscription",
                 "price": "5.99",
                 "duration": {
                     "interval": 1,
                     "interval_unit": "month"
                 },
                 "company_id": "5e41f4756b4c5d439f3ebca2",
                 "chargify_id": "5231107",
                 "entire_catalogue": false,
                 "ads_enabled": false,
                 "apple_product_id": "",
                 "google_product_id": "",
                 "roku_product_id": "",
                 "description": "$5.99/month  subscription  with a 14 day FREE TRIAL, billed monthly.",
                 "price_display": "monthly",
                 "is_most_popular": false,
                 "status": "Active",
                 "channels": [
                     "5e77ccf03dc85963461c6622",
                     "5eb5f9c751dc7948af1125c2"
                 ],
                 "taxable": true,
                 "trial": {
                     "trial_price": 0,
                     "interval": 14,
                     "interval_unit": "day"
                 }
             }
         ]
     }
     */
    private String id;
    private String name;
    private String price;
    private DurationDTO durationDTO = new DurationDTO();
    private String companyId;
    private String chargifyId;
    private boolean entireCatalogue;
    private boolean adsEnabled;
    private String appleProductId;
    private String googleProductId;
    private String rokuProductId;
    private String description;
    private String priceDisplay;
    private boolean isMostPopular;
    private String status;
    private ArrayList<String> channels = new ArrayList<>();
    private int interval;
    private String intervalUnit;
    private String trial;
    private String handle;
    private double total_revenue;
    private boolean cancel_at_end_of_period;
    private String current_period_ends_at;
    private String delayed_cancel_at;
    private String platform;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public DurationDTO getDurationDTO() {
        return durationDTO;
    }

    public void setDurationDTO(DurationDTO durationDTO) {
        this.durationDTO = durationDTO;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getChargifyId() {
        return chargifyId;
    }

    public void setChargifyId(String chargifyId) {
        this.chargifyId = chargifyId;
    }

    public boolean isEntireCatalogue() {
        return entireCatalogue;
    }

    public void setEntireCatalogue(boolean entireCatalogue) {
        this.entireCatalogue = entireCatalogue;
    }

    public boolean isAdsEnabled() {
        return adsEnabled;
    }

    public void setAdsEnabled(boolean adsEnabled) {
        this.adsEnabled = adsEnabled;
    }

    public String getAppleProductId() {
        return appleProductId;
    }

    public void setAppleProductId(String appleProductId) {
        this.appleProductId = appleProductId;
    }

    public String getGoogleProductId() {
        return googleProductId;
    }

    public void setGoogleProductId(String googleProductId) {
        this.googleProductId = googleProductId;
    }

    public String getRokuProductId() {
        return rokuProductId;
    }

    public void setRokuProductId(String rokuProductId) {
        this.rokuProductId = rokuProductId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public boolean isMostPopular() {
        return isMostPopular;
    }

    public void setMostPopular(boolean mostPopular) {
        isMostPopular = mostPopular;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<String> channels) {
        this.channels = channels;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getIntervalUnit() {
        return intervalUnit;
    }

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public String getTrial() {
        return trial;
    }

    public void setTrial(String trial) {
        this.trial = trial;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public double getTotal_revenue() {
        return total_revenue;
    }

    public void setTotal_revenue(double total_revenue) {
        this.total_revenue = total_revenue;
    }

    public boolean isCancel_at_end_of_period() {
        return cancel_at_end_of_period;
    }

    public void setCancel_at_end_of_period(boolean cancel_at_end_of_period) {
        this.cancel_at_end_of_period = cancel_at_end_of_period;
    }

    public String getCurrent_period_ends_at() {
        return current_period_ends_at;
    }

    public void setCurrent_period_ends_at(String current_period_ends_at) {
        this.current_period_ends_at = current_period_ends_at;
    }

    public String getDelayed_cancel_at() {
        return delayed_cancel_at;
    }

    public void setDelayed_cancel_at(String delayed_cancel_at) {
        this.delayed_cancel_at = delayed_cancel_at;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}


