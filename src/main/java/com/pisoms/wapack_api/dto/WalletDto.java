package com.pisoms.wapack_api.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class WalletDto {

    @NotNull(message = "Amount cannot be null")
    private BigDecimal amount;

    @NotNull(message = "Name cannot be null")
    private String name;
}