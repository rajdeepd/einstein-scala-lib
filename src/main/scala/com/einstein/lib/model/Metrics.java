
package com.einstein.lib.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Metrics implements Serializable
{

    @SerializedName("metricsData")
    @Expose
    private MetricsData metricsData;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    private final static long serialVersionUID = 489080923742313619L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metrics() {
    }

    /**
     * 
     * @param id
     * @param createdAt
     * @param object
     * @param metricsData
     */
    public Metrics(MetricsData metricsData, String createdAt, String id, String object) {
        super();
        this.metricsData = metricsData;
        this.createdAt = createdAt;
        this.id = id;
        this.object = object;
    }

    public MetricsData getMetricsData() {
        return metricsData;
    }

    public void setMetricsData(MetricsData metricsData) {
        this.metricsData = metricsData;
    }

    public Metrics withMetricsData(MetricsData metricsData) {
        this.metricsData = metricsData;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Metrics withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Metrics withId(String id) {
        this.id = id;
        return this;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Metrics withObject(String object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
