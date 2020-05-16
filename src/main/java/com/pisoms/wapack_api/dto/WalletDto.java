package com.pisoms.wapack_api.dto;

import com.pisoms.wapack_api.enums.OperationType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class WalletDto {

    @NotNull(message = "Amount cannot be null")
    private BigDecimal amount;

    @NotNull(message = "Description cannot be null")
    private String description;

    @NotNull(message = "Date Operation cannot be null")
    private LocalDate dateOperation;

    @NotNull(message = "Operation Type cannot be null")
    private OperationType operationType;

    private boolean paid;

    private String account;

    private List<String> categories;
}