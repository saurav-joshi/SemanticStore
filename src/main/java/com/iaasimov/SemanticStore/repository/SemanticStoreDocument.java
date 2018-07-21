package com.iaasimov.SemanticStore.repository;
import java.util.Date;
import java.util.List;

import org.apache.solr.client.solrj.beans.Field;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;


//@SolrDocument(collection = "iaasimov")
@SolrDocument(solrCoreName = "iaasimov")

public class SemanticStoreDocument
{

    @Id @Field("id") private String id;
    @Field("docHandle") private String question;
    @Field("docBody") private String answer;
    @Field("last_modified") private Date lastModified;
    @Field("author") private String author;
    @Field("region") private String region;
    @Field("country")private String country;
    @Field("customer_name")private String customerName;
    @Field("industry")private String industry;
    @Field("product")private String product;
    @Field("use_case")private String useCase;
    @Field("use_case_details")private String useCaseDetailsl;
    @Field("customer_outcome")private String customerOutcome;
    @Field("csm")private String csm;
    @Field("emotional_connect")private String emotionalConnect;
    @Field("url") private String url;


    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public String getUseCaseDetailsl() {
        return useCaseDetailsl;
    }

    public void setUseCaseDetailsl(String useCaseDetailsl) {
        this.useCaseDetailsl = useCaseDetailsl;
    }

    public String getCustomerOutcome() {
        return customerOutcome;
    }

    public void setCustomerOutcome(String customerOutcome) {
        this.customerOutcome = customerOutcome;
    }

    public String getCsm() {
        return csm;
    }

    public void setCsm(String csm) {
        this.csm = csm;
    }

    public String getEmotionalConnect() {
        return emotionalConnect;
    }

    public void setEmotionalConnect(String emotionalConnect) {
        this.emotionalConnect = emotionalConnect;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SemanticStoreDocument(String id, String author, String question, String answer){
        this.id =id;
        this.author = author;
        this.question = question;
        this.answer = answer;

    }

    public SemanticStoreDocument(){

    }

    public String getId() {

        return id;

    }

    public void setId(String id) {

        this.id = id;

    }

    public String getQuestion() {

        return question;

    }

    public void setQuestion(String name) {

        this.question = name;

    }

    public Date getLastModified() {

        return lastModified;

    }

    public void setLastModified(Date lastModified) {

        this.lastModified = lastModified;

    }

    public String getAnswer() {

        return answer;

    }

    public void setAnswer(String text) {

        this.answer = text;

    }

    public String getAuthor() {

        return author;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

}

