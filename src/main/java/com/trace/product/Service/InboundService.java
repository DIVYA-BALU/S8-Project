package com.trace.product.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trace.product.Model.Inbound;
import com.trace.product.Repository.InboundRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InboundService {
    
    private final InboundRepository inboundRepository;

    public Inbound saveInbound(Inbound transaction) {
        return inboundRepository.save(transaction);
    }

    public List<Inbound> getInboundTransactions() {
        return inboundRepository.findAll();
    }

    public Inbound updateInbound(String id, Inbound transaction) {
        Inbound trans = inboundRepository.findById(id).get();
        if(trans != null) {
            return inboundRepository.save(transaction);
        }
        return null;
    }

    public Inbound deleteInbound(String id) {
        Inbound trans = inboundRepository.findById(id).get();
        if(trans != null){
            inboundRepository.delete(trans);
            return trans;
        }
        return null;
    }
}
