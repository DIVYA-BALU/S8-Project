package com.trace.product.Model;

import java.sql.Date;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Outbound {
    @Id
    String _id;
    Integer lotNo;
    ArrayList<Composition> materialComposition;
    Double quantity;
    Integer invoiceNo;
    String buyerName;
    Date invoiceDate;
    String addedBy;

}
