package com.trace.product.Model;

import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Outbound {
    @Id
    String _id;
}
