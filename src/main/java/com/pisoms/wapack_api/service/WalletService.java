package com.pisoms.wapack_api.service;

import com.pisoms.wapack_api.dto.WalletDto;
import com.pisoms.wapack_api.repository.entities.Wallet;
import com.pisoms.wapack_api.service.protocols.WalletOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WalletService implements WalletOperation {

    @Autowired
    MongoOperations mongoOperations;

    @Override
    public Wallet save(WalletDto walletDto) {

        Wallet wallet = Wallet.builder()
                .amount(walletDto.getAmount())
                .name(walletDto.getName())
                .build();

        mongoOperations.save(wallet);

        return wallet;
    }

    @Override
    public List<Wallet> list() {
        return mongoOperations.findAll(Wallet.class);
    }
}
