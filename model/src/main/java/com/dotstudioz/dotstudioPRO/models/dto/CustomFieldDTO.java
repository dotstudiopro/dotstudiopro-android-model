package com.dotstudioz.dotstudioPRO.models.dto;

import java.io.Serializable;

/**
 * Created by user on 13-08-2016.
 */
public class CustomFieldDTO implements Serializable {
    private String customFieldName;
    private String customFieldValue;

    public String getCustomFieldName() {
        return customFieldName;
    }

    public void setCustomFieldName(String customFieldName) {
        this.customFieldName = customFieldName;
    }

    public String getCustomFieldValue() {
        return customFieldValue;
    }

    public void setCustomFieldValue(String customFieldValue) {
        this.customFieldValue = customFieldValue;
    }
}
