package com.redbee.msuserspractica.application.port.out;

import org.springframework.data.domain.Page;
import com.redbee.msuserspractica.domain.Seed;

public interface SeedRepository {
    Page<Seed> getByFilters(int page, int size);
}
