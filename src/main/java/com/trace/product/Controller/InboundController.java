package com.trace.product.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trace.product.Model.Inbound;
import com.trace.product.Service.InboundService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("inbound/")
@RequiredArgsConstructor
public class InboundController {
    private final InboundService inboundService;

    @PostMapping("save")
    public ResponseEntity<Inbound> saveInbound(@RequestBody Inbound inboundTrans) {
        return ResponseEntity.ok(inboundService.saveInbound(inboundTrans));
    }

    @GetMapping("get")
    public ResponseEntity<List<Inbound>> getInboundTransactions() {
        return ResponseEntity.ok(inboundService.getInboundTransactions());
    }

    @PatchMapping("update/{id}")
    public ResponseEntity<Inbound> updateInbound(@PathVariable String id, @RequestBody Inbound inboundTrans) {
        return ResponseEntity.ok(inboundService.updateInbound(id, inboundTrans));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Inbound> deleteInbound(@PathVariable String id) {
        return ResponseEntity.ok(inboundService.deleteInbound(id));
    }
}
