package com.dotstudioz.dotstudioPRO.models.dto;

/**
 * Created by mohsin on 03-03-2017.
 */

public class ParameterItem {

    private String parameterName;
    private String parameterValue;
    private int parameterIntValue;
    private long parameterLongValue;
    private double parameterDoubleValue;
    private boolean parameterBooleanValue;

    public ParameterItem(String parameterName, String parameterValue) {
        setParameterName(parameterName);
        setParameterValue(parameterValue);
    }
    public ParameterItem(String parameterName, int parameterIntValue) {
        setParameterName(parameterName);
        setParameterIntValue(parameterIntValue);
    }
    public ParameterItem(String parameterName, long parameterLongValue) {
        setParameterName(parameterName);
        setParameterLongValue(parameterLongValue);
    }
    public ParameterItem(String parameterName, double parameterDoubleValue) {
        setParameterName(parameterName);
        setParameterDoubleValue(parameterDoubleValue);
    }
    public ParameterItem(String parameterName, boolean parameterBooleanValue) {
        setParameterName(parameterName);
        setParameterBooleanValue(parameterBooleanValue);
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    public int getParameterIntValue() {
        return parameterIntValue;
    }

    public void setParameterIntValue(int parameterIntValue) {
        this.parameterIntValue = parameterIntValue;
    }

    public long getParameterLongValue() {
        return parameterLongValue;
    }

    public void setParameterLongValue(long parameterLongValue) {
        this.parameterLongValue = parameterLongValue;
    }

    public double getParameterDoubleValue() {
        return parameterDoubleValue;
    }

    public void setParameterDoubleValue(double parameterDoubleValue) {
        this.parameterDoubleValue = parameterDoubleValue;
    }

    public boolean isParameterBooleanValue() {
        return parameterBooleanValue;
    }

    public void setParameterBooleanValue(boolean parameterBooleanValue) {
        this.parameterBooleanValue = parameterBooleanValue;
    }
}
