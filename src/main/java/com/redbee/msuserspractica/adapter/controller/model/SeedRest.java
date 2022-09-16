package com.redbee.msuserspractica.adapter.controller.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Value;
import com.redbee.msuserspractica.domain.Seed;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SeedRest {

    String seedId;
    LocalDateTime seedDate;
    BigDecimal seedAmount;

    public static SeedRest fromDomain(Seed seed) {
        return SeedRest.builder()
                .seedId(seed.getSeedId())
                .seedDate(seed.getSeedDate())
                .seedAmount(seed.getSeedAmount())
                .build();
    }
}
