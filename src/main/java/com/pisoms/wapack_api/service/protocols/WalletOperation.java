package com.pisoms.wapack_api.service.protocols;

import com.pisoms.wapack_api.dto.WalletDto;
import com.pisoms.wapack_api.repository.entities.Wallet;

import java.util.List;

public interface WalletOperation {

    public Wallet save(WalletDto walletDto);

    public List<Wallet> list();
}
