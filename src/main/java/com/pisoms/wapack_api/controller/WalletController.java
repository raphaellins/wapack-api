package com.pisoms.wapack_api.controller;

import com.pisoms.wapack_api.dto.WalletDto;
import com.pisoms.wapack_api.repository.entities.Wallet;
import com.pisoms.wapack_api.service.protocols.WalletOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletOperation walletOperation;

    @PostMapping
    public ResponseEntity<Wallet> save(@RequestBody @Valid WalletDto walletDto){
        Wallet walletSaved = walletOperation.save(walletDto);
        return ResponseEntity.ok(walletSaved);
    }

    @GetMapping()
    public ResponseEntity<List<Wallet>> list(){
        List<Wallet> wallets = walletOperation.list();
        return ResponseEntity.ok(wallets);
    }
}
