package com.dotstudioz.dotstudioPRO.models.dto;

/**
 * Created by user on 15-06-2016.
 */
public class ValidateAppVersionDTO {
    private String id;
    private String companyId;
    private String packageName;
    private String platform;
    private String version;
    private String appStoreURL;
    private int severityLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAppStoreURL() {
        return appStoreURL;
    }

    public void setAppStoreURL(String appStoreURL) {
        this.appStoreURL = appStoreURL;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }
}
