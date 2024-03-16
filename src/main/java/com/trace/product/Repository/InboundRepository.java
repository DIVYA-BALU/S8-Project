package com.trace.product.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.trace.product.Model.Inbound;
import java.util.List;


@Repository
public interface InboundRepository extends MongoRepository<Inbound, String>{
    Inbound findByLotNo(String lotNo);
}
