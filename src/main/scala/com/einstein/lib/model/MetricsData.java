
package com.einstein.lib.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;

public class MetricsData implements Serializable
{

    @SerializedName("f1")
    @Expose
    private List<Double> f1 = null;
    @SerializedName("labels")
    @Expose
    private List<String> labels = null;
    @SerializedName("testAccuracy")
    @Expose
    private Double testAccuracy;
    @SerializedName("trainingLoss")
    @Expose
    private Double trainingLoss;
    @SerializedName("confusionMatrix")
    @Expose
    private List<List<Long>> confusionMatrix = null;
    @SerializedName("trainingAccuracy")
    @Expose
    private Double trainingAccuracy;
    private final static long serialVersionUID = -2578204382053869187L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MetricsData() {
    }

    /**
     * 
     * @param trainingAccuracy
     * @param testAccuracy
     * @param labels
     * @param confusionMatrix
     * @param f1
     * @param trainingLoss
     */
    public MetricsData(List<Double> f1, List<String> labels, Double testAccuracy, Double trainingLoss, List<List<Long>> confusionMatrix, Double trainingAccuracy) {
        super();
        this.f1 = f1;
        this.labels = labels;
        this.testAccuracy = testAccuracy;
        this.trainingLoss = trainingLoss;
        this.confusionMatrix = confusionMatrix;
        this.trainingAccuracy = trainingAccuracy;
    }

    public List<Double> getF1() {
        return f1;
    }

    public void setF1(List<Double> f1) {
        this.f1 = f1;
    }

    public MetricsData withF1(List<Double> f1) {
        this.f1 = f1;
        return this;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public MetricsData withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Double getTestAccuracy() {
        return testAccuracy;
    }

    public void setTestAccuracy(Double testAccuracy) {
        this.testAccuracy = testAccuracy;
    }

    public MetricsData withTestAccuracy(Double testAccuracy) {
        this.testAccuracy = testAccuracy;
        return this;
    }

    public Double getTrainingLoss() {
        return trainingLoss;
    }

    public void setTrainingLoss(Double trainingLoss) {
        this.trainingLoss = trainingLoss;
    }

    public MetricsData withTrainingLoss(Double trainingLoss) {
        this.trainingLoss = trainingLoss;
        return this;
    }

    public List<List<Long>> getConfusionMatrix() {
        return confusionMatrix;
    }

    public void setConfusionMatrix(List<List<Long>> confusionMatrix) {
        this.confusionMatrix = confusionMatrix;
    }

    public MetricsData withConfusionMatrix(List<List<Long>> confusionMatrix) {
        this.confusionMatrix = confusionMatrix;
        return this;
    }

    public Double getTrainingAccuracy() {
        return trainingAccuracy;
    }

    public void setTrainingAccuracy(Double trainingAccuracy) {
        this.trainingAccuracy = trainingAccuracy;
    }

    public MetricsData withTrainingAccuracy(Double trainingAccuracy) {
        this.trainingAccuracy = trainingAccuracy;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
