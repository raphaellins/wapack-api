package com.pisoms.wapack_api.repository.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;


@Builder
@Getter
@Document(collection = "wallet")
public class Wallet {

    @Id
    private String id;

    private String name;

    private BigDecimal amount;
}
