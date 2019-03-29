package com.example.Thymeleafpratice;

import java.util.Date;

public class Product {
  private String description;
  private Integer price;
  private Date availableFrom;

  public Product(String description, Integer price, Date availableFrom) {
    this.description = description;
    this.price = price;
    this.availableFrom = availableFrom;
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

  public Date getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(Date availableFrom) {
    this.availableFrom = availableFrom;
  }
}
