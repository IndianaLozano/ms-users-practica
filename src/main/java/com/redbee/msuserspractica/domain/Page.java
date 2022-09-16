package com.redbee.msuserspractica.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Builder
@Value
public class Page<T> {
    List<T> data;
    long totalElements;
    int size;
    int number;
    int totalPages;
}
