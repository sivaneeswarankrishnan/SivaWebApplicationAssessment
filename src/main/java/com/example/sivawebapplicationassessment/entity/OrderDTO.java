package com.example.sivawebapplicationassessment.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OrderDTO {
    private Long productId;
    private int quantity;
    private String size;
}
