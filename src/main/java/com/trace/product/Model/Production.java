package com.trace.product.Model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Production {
    @Id
    String _id;
    String materialName;
    String lotNo;
    Double totalQuantity;
    Double remainingQuantity;
    Date producedDate;
    ArrayList<Composition> materialComposition;
    ArrayList<InputLot> inputLots;

}
