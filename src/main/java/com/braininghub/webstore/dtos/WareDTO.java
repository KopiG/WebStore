package com.braininghub.webstore.dtos;

/**
 * Created by kopig on 2019. 05. 14..
 */
public class WareDTO {
    private String codeKey;
    private String name;
    private String description;
    private Integer price;

    public String getCodeKey() {
        return codeKey;
    }

    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public WareDTO(String codeKey, String name, String description, Integer price) {
        this.codeKey = codeKey;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "WareDTO{codeKey:" + getCodeKey() + ",name:" + getName() + ",description:" +
                getDescription() + "price:" + getPrice() + "}";
    }
}
