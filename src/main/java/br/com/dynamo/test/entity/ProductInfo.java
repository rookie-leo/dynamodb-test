package br.com.dynamo.test.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ProductInfo")
public class ProductInfo {

    @DynamoDBHashKey
    private String id;

    @DynamoDBAttribute
    private String msrp;

    @DynamoDBAttribute
    private String cost;

    public ProductInfo(String expectedCost, String expectedPrice) {
        this.cost = expectedCost;
        this.msrp = expectedPrice;
    }


    public String getId() {
        return id;
    }

    public String getMsrp() {
        return msrp;
    }

    public String getCost() {
        return cost;
    }
}
