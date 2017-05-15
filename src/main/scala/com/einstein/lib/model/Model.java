
package com.einstein.lib.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

public class Model implements Serializable
{

    @SerializedName("datasetId")
    @Expose
    private Long datasetId;
    @SerializedName("datasetVersionId")
    @Expose
    private Long datasetVersionId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("progress")
    @Expose
    private Long progress;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("failureMsg")
    @Expose
    private String failureMsg;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("modelId")
    @Expose
    private String modelId;
    @SerializedName("modelType")
    @Expose
    private String modelType;
    private final static long serialVersionUID = -6923855160145910663L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Model() {
    }

    /**
     * 
     * @param modelId
     * @param updatedAt
     * @param progress
     * @param modelType
     * @param status
     * @param createdAt
     * @param name
     * @param datasetId
     * @param failureMsg
     * @param object
     * @param datasetVersionId
     */
    public Model(Long datasetId, Long datasetVersionId, String name, String status, Long progress, String createdAt, String updatedAt, String failureMsg, String object, String modelId, String modelType) {
        super();
        this.datasetId = datasetId;
        this.datasetVersionId = datasetVersionId;
        this.name = name;
        this.status = status;
        this.progress = progress;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.failureMsg = failureMsg;
        this.object = object;
        this.modelId = modelId;
        this.modelType = modelType;
    }

    public Long getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
    }

    public Model withDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public Long getDatasetVersionId() {
        return datasetVersionId;
    }

    public void setDatasetVersionId(Long datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
    }

    public Model withDatasetVersionId(Long datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model withName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Model withStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getProgress() {
        return progress;
    }

    public void setProgress(Long progress) {
        this.progress = progress;
    }

    public Model withProgress(Long progress) {
        this.progress = progress;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Model withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Model withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
    }

    public Model withFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg;
        return this;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Model withObject(String object) {
        this.object = object;
        return this;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Model withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Model withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
