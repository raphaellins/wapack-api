package com.pisoms.wapack_api.repository.entities;

import com.pisoms.wapack_api.enums.OperationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Builder
@Setter
@Getter
@Document(collection = "wallet")
public class Wallet {

    @Id
    private String id;

    private BigDecimal amount;

    private String description;

    private List<String> categories;

    private LocalDate dateOperation;

    private OperationType operationType;

    private boolean paid;

    private String account;
}
