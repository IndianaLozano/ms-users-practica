package com.redbee.msuserspractica.adapter.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.redbee.msuserspractica.domain.Page;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PageResponse<T> {
    List<T> data;
    long totalElements;
    int size;
    int number;
    int totalPages;

    public <U> PageResponse<T> fromDomain(Page<U> domain, Function<U, T> convert) {
        return PageResponse.<T>builder()
            .data(domain.getData()
                .stream()
                .map(convert)
                .collect(Collectors.toList()))
            .totalElements(domain.getTotalElements())
            .size(domain.getSize())
            .number(domain.getNumber())
            .totalPages(domain.getTotalPages())
            .build();
    }
}
