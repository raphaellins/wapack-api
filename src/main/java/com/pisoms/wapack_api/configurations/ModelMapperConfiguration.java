package com.pisoms.wapack_api.configurations;

import com.pisoms.wapack_api.dto.WalletDto;
import com.pisoms.wapack_api.repository.entities.Wallet;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.createTypeMap(WalletDto.class, Wallet.class);


        return modelMapper;
    }
}
