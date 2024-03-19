package com.trace.product.Model;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inbound {
    @Id
    String _id;
    String lotNo;
    ArrayList<Composition> materialComposition;
    Double quantity;
    Integer invoiceNo;
    String sellerName;
    Date invoiceDate;
    String addedBy;
    Double totalQuantity;
    Double remainingQuantity;

    
}
