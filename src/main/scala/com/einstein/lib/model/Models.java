
package com.einstein.lib.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class Models implements Serializable
{

    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("data")
    @Expose
    private List<Model> data = null;
    private final static long serialVersionUID = 5822887786280275176L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Models() {
    }

    /**
     * 
     * @param data
     * @param object
     */
    public Models(String object, List<Model> data) {
        super();
        this.object = object;
        this.data = data;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Models withObject(String object) {
        this.object = object;
        return this;
    }

    public List<Model> getData() {
        return data;
    }

    public void setData(List<Model> data) {
        this.data = data;
    }

    public Models withData(List<Model> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
